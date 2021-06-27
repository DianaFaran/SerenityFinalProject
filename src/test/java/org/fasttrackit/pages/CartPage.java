package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import java.util.List;
import java.util.stream.Collectors;

@DefaultUrl("http://qa1.fasttrackit.org:8008/cart/")
public class CartPage extends PageObject {

    @FindBy(css = "a.remove")
    private WebElementFacade removeButton;

    @FindBy(css = ".product-remove a")
    private List<WebElementFacade> removeButtonsList;

    @FindBy(css = ".quantity input")
    private WebElementFacade quantityField;

    @FindBy(css = ".quantity")
    private List<WebElementFacade> quantityItems;

    @FindBy(css = "[name^='update']")
    private WebElementFacade updateCartButton;

    @FindBy(css = ".cart-empty")
    private WebElementFacade emptyCartMessage;

    @FindBy(css = "[role^='alert'")
    private WebElementFacade messageAlert;

    @FindBy(css = ".checkout-button")
    private WebElementFacade checkoutButton;

    @FindBy(css = ".cart_item")
    private List<WebElementFacade> cartItemsList;

    public void clickCheckoutButton() {
        clickOn(checkoutButton);
    }
    public void changeQuantity(String number) {
        typeInto(quantityField, number);
    }

    public void clickRemoveButton() {
        clickOn(removeButton);
    }

    public void removeAllProducts() {
        WebElementFacade element = find(By.cssSelector(".product-remove a"));
        try {
            if (null != element.getElement()) {
                waitFor(element);
                element.click();
                waitABit(2000);
                removeAllProducts();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public List<String> getCartItemsList(){
        return findAll(".cart_item [data-title^='Product']").stream()
                .map(WebElementFacade::getText)
                .collect(Collectors.toList());
    }
    public boolean isProductInCart(String productName){
        for(WebElementFacade list: cartItemsList){
            if (list.findElement(By.cssSelector("[data-title^='Product'] a")).getText().equalsIgnoreCase(productName)) {
                return true;
            }
        }
        return false;
    }
    public boolean verifyRemovedProduct(){
        waitFor(messageAlert);
        return messageAlert.containsText(" removed");
    }
    public boolean checkUpdatedCartMessage(){
        waitFor(messageAlert);
        return messageAlert.containsText(" updated");
    }

    public boolean verifyCartIsEmpty() {
        return emptyCartMessage.containsText("Your cart is currently empty.");
    }
    public void clickUpdateCartButton(){
        clickOn(updateCartButton);
    }
}

package org.fasttrackit.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CartPage extends PageObject {

    @FindBy(css = ".success-msg span")
    private WebElementFacade addedToCartMessage;

    @FindBy(css = ".product-cart-actions input")
    private WebElementFacade changeQuantityInCart;

    @FindBy(css = ".btn-update[title='Update']")
    private WebElementFacade updateQuantity;

    @FindBy(css="#empty_cart_button span span")
    private WebElementFacade emptyCartButton;

    @FindBy(css = ".cart-empty")
    private WebElementFacade emptyCartMessage;

    @FindBy(css = ".cart-totals .btn-checkout span span")
    private WebElementFacade clickCheckoutButton;

    public void clickCheckoutButton(){
        clickOn(clickCheckoutButton);
    }
    public void checkEmptyCartMessage(String message){
        emptyCartMessage.shouldContainText(message);
    }
    public void clickEmptyCartButton(){
        clickOn(emptyCartButton);
    }
    public void inputNumberOfItems(String quantity){
        changeQuantityInCart.clear();
        typeInto(changeQuantityInCart,quantity);
    }
    public void updateQuantity(){
        clickOn(updateQuantity);
    }
    public void checkAddedToCartMessage(String message){
        addedToCartMessage.shouldContainText(message);
    }

}

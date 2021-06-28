package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import java.util.List;

@DefaultUrl("http://qa1.fasttrackit.org:8008/shop/")
public class ShopPage extends PageObject {

    @FindBy(css = "[title^='View cart']")
    private WebElementFacade viewCartLink;

    @FindBy(css = ".added_to_cart")
    private WebElementFacade addedProduct;

    @FindBy(css =".woocommerce-loop-product__title")
    private WebElementFacade productLink;

    @FindBy(css = ".add_to_cart_button")
    private WebElementFacade addToCartButton;

    @FindBy(css = "#main li.product")
    private List<WebElementFacade> shopItems;

    public boolean isAddedToCart(){
        return addedProduct.isDisplayed();
    }

    public void addMultipleProducts() {
        for(WebElementFacade element: shopItems){
            element.findElement(By.cssSelector("a.add_to_cart_button")).click();
            waitFor(element);
        }
    }

    public void clickProductLink(){
        clickOn(productLink);
    }

    public void clickAddToCartButton(){
        clickOn(addToCartButton);
    }

    public void clickViewCartLink(){
        clickOn(viewCartLink);
    }
}

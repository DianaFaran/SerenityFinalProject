package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPage extends PageObject {

    @FindBy(css=".single_add_to_cart_button")
    private WebElementFacade addToCartButton;

    @FindBy(css=".woocommerce-message")
    private WebElementFacade alertMessage;

    public void checkAddedToCartMessage(String message){
        waitFor("[role^='alert']");
        alertMessage.containsValue(message);
    }
    public String getAddedToCartMessage(){
        waitFor(alertMessage);
        return findBy("[role^='alert']").getText().replaceAll("View cart", "").trim();
    }

    public void clickAddToCartButton(){
        waitFor(addToCartButton);
        clickOn(addToCartButton);
    }




}

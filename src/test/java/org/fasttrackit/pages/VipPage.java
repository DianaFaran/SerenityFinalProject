package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class VipPage extends PageObject {

    @FindBy(css = "li:nth-child(2) .button")
    private WebElementFacade viewProductDetails;

    @FindBy(id = ".product-name [title^='DUMBO']")
    private WebElementFacade selectProduct;

    @FindBy(css = ".link-wishlist")
    private WebElementFacade addToWishlistLink;

    public void selectProduct(){
        clickOn(selectProduct);
    }
    public void viewProductDetails(){
        clickOn(viewProductDetails);
    }
    public void clickAddToWishlistLink() {
        clickOn(addToWishlistLink);
    }


}

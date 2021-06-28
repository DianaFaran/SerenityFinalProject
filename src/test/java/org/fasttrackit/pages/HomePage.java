package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa1.fasttrackit.org:8008/")
public class HomePage extends PageObject {

    @FindBy(css = "#menu-item-58 a")
    private WebElementFacade myAccountLink;

    @FindBy(css = "#menu-item-59 a")
    private WebElementFacade cartLink;

    @FindBy(css = "#menu-item-60 a")
    private WebElementFacade shopLink;

    @FindBy(css = "#menu-item-61 a")
    private WebElementFacade checkoutLink;

    @FindBy(css= "#meta-2 > ul > li:nth-child(2) > a")
    private WebElementFacade adminLoginLink;

    public void clickAdminLoginLink(){
        clickOn(adminLoginLink);
    }

    public void clickCheckoutLink(){
        clickOn(checkoutLink);
    }

    public void clickShopLink(){
        clickOn(shopLink);
    }

    public void clickCartLink(){
        clickOn(cartLink);
    }

    public void clickMyAccountLink(){
        clickOn(myAccountLink);
    }
}

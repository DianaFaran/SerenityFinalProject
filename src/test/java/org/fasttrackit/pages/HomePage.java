package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class HomePage extends PageObject {

    @FindBy(css = ".skip-account .label")
    private WebElementFacade accountLink;

    @FindBy(css = "[title='Log In']")
    private WebElementFacade logInLink;

    @FindBy(css = ".skip-cart .label")
    private WebElementFacade cartLink;

    @FindBy(css = ".nav-5")
    private WebElementFacade saleLink;

    @FindBy(css = ".nav-6")
    private WebElementFacade vipLink;

    public void clickCartLink(){
        clickOn(cartLink);
    }
    public void clickVipLink(){ clickOn(vipLink);}
    public void clickSaleLink(){
        clickOn(saleLink);
    }
    public void clickAccountLink(){
        clickOn(accountLink);
    }
    public void clickLogInLink(){
        clickOn(logInLink);
    }
}

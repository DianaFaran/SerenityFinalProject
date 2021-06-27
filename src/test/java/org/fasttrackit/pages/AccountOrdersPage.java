package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa1.fasttrackit.org:8008/my-account/orders/")
public class AccountOrdersPage extends PageObject {

    @FindBy(css = "[data-title^='Actions'] a")
    private WebElementFacade userLastOrderLink;

    @FindBy(css=".order-number")
    private WebElementFacade userLastOrderNumber;

    public void clickUserLastOrder(){
        clickOn(userLastOrderLink);
    }

    public String getUserLastOrderNumber(){
        waitFor(userLastOrderNumber);
        return findBy(".order-number").getText();
    }
}

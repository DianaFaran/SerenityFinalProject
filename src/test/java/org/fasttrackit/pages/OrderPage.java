package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

public class OrderPage extends PageObject {
    @FindBy(css = ".woocommerce-notice")
    private WebElementFacade orderConfirmationMessage;

    @FindBy(css = ".woocommerce-order-overview__order strong")
    private WebElementFacade placedOrderNumber;

    public String getOrderConfirmationMessage(){
        waitFor(orderConfirmationMessage);
        return orderConfirmationMessage.getText();
    }

}

package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.*;
import org.junit.Assert;

public class OrderSteps {
    private OrderPage orderPage;
    private ShopPage shopPage;
    private CartPage cartPage;
    private CheckoutPage checkoutPage;
    private AccountPage accountPage;
    private AccountOrdersPage accountOrdersPage;

    @Step
    public void verifyOrderIsPlaced(){
        Assert.assertEquals("Thank you. Your order has been received.",orderPage.getOrderConfirmationMessage());
    }
}

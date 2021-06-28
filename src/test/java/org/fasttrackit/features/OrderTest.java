package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.*;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class OrderTest extends BaseTest {
    @Steps
    private CheckoutSteps checkoutSteps;
    @Steps
    private CartSteps cartSteps;
    @Steps
    private LoginSteps loginSteps;
    @Steps
    private OrderSteps orderSteps;
    @Steps
    private AccountSteps accountSteps;

    @Test
    public void placeAnOrder(){
        cartSteps.addSpecificProductToCart("beanie");
        cartSteps.viewCartDetails();
        cartSteps.clickCheckoutButton();
        checkoutSteps.enterBillingInformation();
        checkoutSteps.clickPlaceOrderButton();
        orderSteps.verifyOrderIsPlaced();
    }

    @Test
    public void placeOrderWithLogin(){
        loginSteps.doLogin();
        cartSteps.addSpecificProductToCart("hoodie");
        cartSteps.viewCartDetails();
        cartSteps.clickCheckoutButton();
        checkoutSteps.clickPlaceOrderButton();
        orderSteps.verifyOrderIsPlaced();
    }
}

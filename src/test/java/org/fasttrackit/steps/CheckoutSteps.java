package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.CheckoutPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.OrderPage;
import org.fasttrackit.utils.Constants;

public class CheckoutSteps {
    private CartPage cartPage;
    private CheckoutPage checkoutPage;
    private HomePage homePage;
    private OrderPage orderPage;


    @Step
    public void enterBillingInformation(){
        checkoutPage.enterBillingFirstName(Constants.FIRST_NAME);
        checkoutPage.enterBillingLastName(Constants.LAST_NAME);
        checkoutPage.enterBillingStreetName(Constants.STREET_NAME);
        checkoutPage.enterBillingStreetNumber(Constants.STREET_NUMBER);
        checkoutPage.enterBillingCity(Constants.CITY);
        checkoutPage.enterBillingPostcodeField(Constants.POSTCODE);
        checkoutPage.enterBillingPhone(Constants.PHONE);
        checkoutPage.enterBillingEmail(Constants.USER_EMAIL);
    }
    @Step
    public void clickPlaceOrderButton(){
        checkoutPage.clickPlaceOrderButton();
    }
    @Step
    public void goToCheckoutPage(){
        homePage.clickCheckoutLink();
    }



}

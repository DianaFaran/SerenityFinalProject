package org.fasttrackit.steps;
import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CheckoutPage;
import org.fasttrackit.utils.Constants;

public class CheckoutSteps {
    private CheckoutPage checkoutPage;

    @Step
    public void checkoutWithLogin(){
        checkoutPage.inputEmail(Constants.USER_EMAIL);
        checkoutPage.inputPassword(Constants.USER_PASSWORD);
        checkoutPage.clickLoginButton();
        checkoutPage.checkoutPageConfirmation("BILLING INFORMATION");
    }
    @Step
    public void enterBillingInformation(){
        checkoutPage.setBillingFirstnameField(Constants.USER_FIRSTNAME);
        checkoutPage.setBillingLastnameField(Constants.USER_LASTNAME);
        checkoutPage.setBillingAddressField(Constants.USER_ADDRESS);
        checkoutPage.setBillingCityField(Constants.USER_CITY);
        checkoutPage.setBillingRegion();
        checkoutPage.setBillingCountry();
        checkoutPage.setBillingZipcode(Constants.USER_ZIPCODE);
        checkoutPage.setBillingTelephone(Constants.USER_TELEPHONE);
        checkoutPage.clickContinueButton();
        checkoutPage.selectFreeShippingButton();
        checkoutPage.clickContinueToPayment();
        checkoutPage.clickContinueToOrderReviewButton();
        checkoutPage.clickPlaceOrderButton();
    }
}

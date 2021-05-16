package org.fasttrackit.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckoutPage extends PageObject {
    @FindBy(css = ".input-box #login-email")
    private WebElementFacade emailField;

    @FindBy(css = ".input-box #login-password")
    private WebElementFacade passwordField;

    @FindBy(css = ".buttons-set [onclick^=one] span")
    private WebElementFacade loginButton;

    @FindBy(css = ".step-title h2")
    private WebElementFacade checkoutPage;

    @FindBy(id = "billing:firstname")
    private WebElementFacade billingFirstnameField;

    @FindBy(id = "billing:lastname")
    private WebElementFacade billingLastnameField;

    @FindBy(id = "billing:street1")
    private WebElementFacade billingAddressField;

    @FindBy(id = "billing:city")
    private WebElementFacade billingCityField;

    @FindBy(id ="billing:region_id")
    private WebElementFacade billingRegion;

    @FindBy(id = "billing:postcode")
    private WebElementFacade billingZipcode;

    @FindBy(id = "billing:country_id")
    private WebElementFacade billingCountry;

    @FindBy(id = "billing:telephone")
    private WebElementFacade billingTelephone;

    @FindBy(css = "[id^='billing-buttons-container'] [title^='Continue']")
    private WebElementFacade continueButton;

    @FindBy(id = "s_method_freeshipping_freeshipping")
    private WebElementFacade shippingRadioButton;

    @FindBy(css = "[onclick^=shippingMethod.save()]")
    private WebElementFacade continueToPaymentButton;

    @FindBy(css = "[onclick^=payment.save()]")
    private WebElementFacade continueToOrderReview;

    @FindBy(css = "[onclick^=review.save()]")
    private WebElementFacade placeOrderButton;

    public void clickPlaceOrderButton(){
        clickOn(placeOrderButton);
    }
    public void clickContinueToOrderReviewButton(){
        clickOn(continueToOrderReview);
    }
    public void clickContinueToPayment(){
        clickOn(continueToPaymentButton);
    }

    public void selectFreeShippingButton(){
        clickOn(shippingRadioButton);
    }

    public void clickContinueButton(){
        clickOn(continueButton);
    }

    public void setBillingTelephone(String telephone){
        typeInto(billingTelephone,telephone);
    }

    public void setBillingZipcode(String zipcode){
        typeInto(billingZipcode,zipcode);
    }
    public void setBillingCountry(){
        selectFromDropdown(billingCountry,"Statele Unite ale Americii");
    }
    public void setBillingRegion(){
        selectFromDropdown(billingRegion,"Florida");
    }
    public void setBillingCityField(String city){
        typeInto(billingCityField,city);
    }
    public void setBillingAddressField(String address){
        typeInto(billingAddressField,address);

    }public void setBillingLastnameField(String lastname){
       typeInto(billingLastnameField,lastname);
    }

    public void setBillingFirstnameField(String firstname){
        typeInto(billingFirstnameField,firstname);
    }
    public void checkoutPageConfirmation(String message){
        checkoutPage.shouldContainText(message);
    }

    public void clickLoginButton(){
        clickOn(loginButton);
    }

    public void inputPassword(String password){
        typeInto(passwordField,password);
    }
    public void inputEmail(String email){
        typeInto(emailField,email);

    }
}

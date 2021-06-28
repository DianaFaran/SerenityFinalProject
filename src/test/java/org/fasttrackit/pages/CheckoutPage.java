package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.fasttrackit.utils.Constants;

import java.util.Locale;

public class CheckoutPage extends PageObject {
    @FindBy(css = "#shipping_first_name")
    private WebElementFacade shippingFirstNameField;

    @FindBy(css = "#billing_first_name")
    private WebElementFacade billingFirstNameField;

    @FindBy(css = "#shipping_last_name")
    private WebElementFacade shippingLastNameField;

    @FindBy(css = "#billing_last_name")
    private WebElementFacade lastNameField;

    @FindBy(css = "#billing_country")
    private WebElementFacade billingCountryDropDownList;

    @FindBy(css = "#shipping_country")
    private WebElementFacade shippingCountryDropDownList;

    @FindBy(css = ".input-text[name^='billing_address_1']")
    private WebElementFacade billingStreetNameField;

    @FindBy(css = ".input-text[name^='billing_address_2']")
    private WebElementFacade billingStreetNumberField;

    @FindBy(css = ".input-text[name^='shipping_address_1']")
    private WebElementFacade shippingStreetNameField;

    @FindBy(css = ".input-text[name^='shipping_address_2']")
    private WebElementFacade shippingStreetNumberField;

    @FindBy(id = "billing_city")
    private WebElementFacade billingCityField;

    @FindBy(id = "shipping_city")
    private WebElementFacade shippingCityField;

    @FindBy(id = "billing_postcode")
    private WebElementFacade billingPostcodeField;

    @FindBy(id = "shipping_postcode")
    private WebElementFacade shippingPostcodeField;

    @FindBy(id = "billing_phone")
    private WebElementFacade billingPhoneField;

    @FindBy(id = "billing_email")
    private WebElementFacade billingEmailField;

    @FindBy(id = "place_order")
    private WebElementFacade placeOrderButton;

    @FindBy(css = ".entry-title")
    private WebElementFacade checkoutPageTitle;

    public boolean isCheckoutPageOpen(){
        return checkoutPageTitle.isDisplayed();
    }
    public String getCheckoutPageTitle(){
        return checkoutPageTitle.getText();
    }

    public void enterShippingPostcodeField(String billingPostcode){
        typeInto(shippingPostcodeField,billingPostcode);
    }

    public void enterShippingCity(String billingCity){
        typeInto(shippingCityField,billingCity);
    }

    public void enterShippingStreetNumber(String streetNumber){
        typeInto(shippingStreetNumberField,streetNumber);
    }

    public void enterShippingStreetName(String streetName){
        typeInto(shippingStreetNameField,streetName);
    }

    public void enterShippingLastName(String lastName){
        typeInto(shippingLastNameField,lastName);
    }

    public void enterShippingFirstName(String firstName){
        typeInto(shippingFirstNameField,firstName);
    }

    public void enterBillingEmail(String billingEmail){
        typeInto(billingEmailField,billingEmail);
    }

    public void enterBillingPhone(String billingPhone){
        typeInto(billingPhoneField,billingPhone);
    }

    public void enterBillingPostcodeField(String billingPostcode){
        typeInto(billingPostcodeField,billingPostcode);
    }

    public void enterBillingCity(String billingCity){
        typeInto(billingCityField,billingCity);
    }

    public void enterBillingStreetNumber(String streetNumber){
        typeInto(billingStreetNumberField,streetNumber);
    }

    public void enterBillingStreetName(String streetName){
        typeInto(billingStreetNameField,streetName);
    }

    public void enterBillingLastName(String lastName){
        typeInto(lastNameField,lastName);
    }

    public void enterBillingFirstName(String firstName){
        typeInto(billingFirstNameField,firstName);
    }
    public void selectBillingCountry(){
        selectFromDropdown(billingCountryDropDownList,"Romania");
    }

    public void selectShippingCountry(){
        selectFromDropdown(shippingCountryDropDownList,"Romania");
    }

    public void enterBillingInformation(){
        enterBillingFirstName(Constants.FIRST_NAME);
        enterBillingLastName(Constants.LAST_NAME);
        selectBillingCountry();
        enterBillingStreetName(Constants.STREET_NAME);
        enterBillingStreetNumber(Constants.STREET_NUMBER);
        enterBillingCity(Constants.CITY);
        enterBillingPostcodeField(Constants.POSTCODE);
        enterBillingPhone(Constants.PHONE);
        enterBillingEmail(Constants.USER_EMAIL);
    }
    public void enterShippingInformation(){
        enterShippingFirstName(Constants.FIRST_NAME);
        enterShippingLastName(Constants.LAST_NAME);
        selectShippingCountry();
        enterShippingStreetName(Constants.STREET_NAME);
        enterShippingStreetNumber(Constants.STREET_NUMBER);
        enterShippingCity(Constants.CITY);
        enterShippingPostcodeField(Constants.POSTCODE);
    }

    public void clickPlaceOrderButton(){
        clickOn(placeOrderButton);
    }
}

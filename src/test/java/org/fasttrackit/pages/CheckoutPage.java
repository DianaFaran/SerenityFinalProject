package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.fasttrackit.utils.Constants;

public class CheckoutPage extends PageObject {
    @FindBy(css = "#billing_first_name")
    private WebElementFacade firstNameField;

    @FindBy(css = "#billing_last_name")
    private WebElementFacade lastNameField;

    @FindBy(css = "#select2-billing_country-container")
    private WebElementFacade countryDropDownList;

    @FindBy(css = ".input-text[name^='billing_address_1']")
    private WebElementFacade billingStreetNameField;

    @FindBy(css = ".input-text[name^='billing_address_2']")
    private WebElementFacade billingStreetNumberField;

    @FindBy(id = "billing_city")
    private WebElementFacade billingCityField;

    @FindBy(id = "billing_postcode")
    private WebElementFacade billingPostcodeField;

    @FindBy(id = "billing_phone")
    private WebElementFacade billingPhoneField;

    @FindBy(id = "billing_email")
    private WebElementFacade billingEmailField;

    @FindBy(id = "place_order")
    private WebElementFacade placeOrderButton;


    public void clickPlaceOrderButton(){
        clickOn(placeOrderButton);
    }
    public void enterBillingInformation(){
        enterBillingFirstName(Constants.FIRST_NAME);
        enterBillingLastName(Constants.LAST_NAME);
        enterBillingStreetName(Constants.STREET_NAME);
        enterBillingStreetNumber(Constants.STREET_NUMBER);
        enterBillingCity(Constants.CITY);
        enterBillingPostcodeField(Constants.POSTCODE);
        enterBillingPhone(Constants.PHONE);
        enterBillingEmail(Constants.USER_EMAIL);
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

    public void selectCountry(){
        countryDropDownList.selectByVisibleText("Romania").click();
    }

    public void enterBillingLastName(String lastName){
        typeInto(lastNameField,lastName);
    }

    public void enterBillingFirstName(String firstName){
        typeInto(firstNameField,firstName);
    }
}

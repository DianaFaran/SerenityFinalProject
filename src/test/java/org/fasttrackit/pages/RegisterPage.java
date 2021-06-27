package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegisterPage extends PageObject {
    @FindBy(css = "#reg_email")
    private WebElementFacade regEmailField;

    @FindBy(css = "#reg_password")
    private WebElementFacade regPasswordField;

    @FindBy(css = "[value='Register']")
    private WebElementFacade registerButton;

    @FindBy(css = ".woocommerce-password-hint")
    private WebElementFacade passwordHint;

    @FindBy(css = ".woocommerce-Button:last-child")
    private WebElementFacade disabledRegisterButton;


    public boolean isPasswordHintDisplayed(String message){
        return passwordHint.containsText(message);
    }

    public void getPasswordHint(){
        passwordHint.getText();
    }

    public void clickRegisterButton(){
        clickOn(registerButton);
    }

    public void enterPassword(String password) {
        typeInto(regPasswordField, password);
    }
    public void enterEmail(String email) {
        typeInto(regEmailField, email);
    }

}

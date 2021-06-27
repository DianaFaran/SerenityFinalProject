package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {
    @FindBy(css = "#username")
    private WebElementFacade logEmailField;

    @FindBy(css = "#password")
    private WebElementFacade logPasswordField;

    @FindBy(css = "[value='Login']")
    private WebElementFacade loginButton;

    public void enterEmail(String email){
        typeInto(logEmailField,email);
    }
    public void enterPassword(String password){
        typeInto(logPasswordField,password);
    }
    public void clickLoginButton(){
        clickOn(loginButton);
    }
}

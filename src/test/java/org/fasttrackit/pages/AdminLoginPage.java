package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AdminLoginPage extends PageObject {

    @FindBy(css = "#user_login")
    private WebElementFacade adminUsernameField;

    @FindBy(css = "#user_pass")
    private WebElementFacade adminPasswordField;

    @FindBy(css = ".button")
    private WebElementFacade adminLoginButton;

    @FindBy(css = ".forgetmenot input")
    private WebElementFacade adminRememberMeButton;

    @FindBy(css = "#nav a:nth-child(2)")
    private WebElementFacade forgotPasswordLink;

    public void clickForgotPasswordLink(){
        clickOn(forgotPasswordLink);
    }
    public void enterAdminUsername(String adminUsername){
        typeInto(adminUsernameField,adminUsername);
    }
    public void enterAdminPassword(String adminPassword){
        typeInto(adminPasswordField,adminPassword);
    }
    public void clickAdminLoginButton(){
        clickOn(adminLoginButton);
    }


}

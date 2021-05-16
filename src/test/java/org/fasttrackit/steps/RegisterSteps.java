package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.RegisterPage;

public class RegisterSteps {

    private HomePage homePage;
    private RegisterPage registerPage;

    @Step
    public void navigateToRegister(){
        homePage.open();
        homePage.clickAccountLink();
        registerPage.clickRegisterLink();
    }

    @Step
    public void enterCompleteName(String firstname, String lastname) {
        registerPage.setFirstnameField(firstname);
        registerPage.setLastnameField(lastname);
    }
    @Step
    public void enterCredentials(String email, String password){
        registerPage.setEmailField(email);
        registerPage.setPasswordField(password);
        registerPage.setConfirmPasswordField(password);
        registerPage.clickRegisterButton();
    }


}

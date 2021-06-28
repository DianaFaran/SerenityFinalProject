package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class LoginTest extends BaseTest {
    @Steps
    private LoginSteps loginSteps;

    @Test
    public void loginWithValidCredentials(){
        loginSteps.goToLoginPage();
        loginSteps.enterLoginCredentials(Constants.USER_EMAIL,Constants.USER_PASSWORD);
        loginSteps.clickLoginButton();
        loginSteps.checkUserIsLoggedIn("Hello ");
    }
    @Test
    public void checkUserAlreadyLoggedIn(){
        loginSteps.doLogin();
        loginSteps.goToLoginPage();
        loginSteps.checkUserIsLoggedIn("Hello ");

    }
    @Test
    public void attemptLoginWithInvalidEmail(){
        loginSteps.goToLoginPage();
        loginSteps.enterLoginCredentials("ginnyyahoo.com",Constants.USER_PASSWORD);
        loginSteps.clickLoginButton();
        loginSteps.checkInvalidEmailMessage("ERROR: Invalid username. Lost your password?");
    }
    @Test
    public void attemptLoginWithBlankEmailField(){
        loginSteps.goToLoginPage();
        loginSteps.enterLoginCredentials("",Constants.USER_PASSWORD);
        loginSteps.clickLoginButton();
        loginSteps.checkInvalidEmailMessage("Error: Username is required.");
    }
    @Test
    public void attemptLoginWithBlankPasswordField(){
        loginSteps.goToLoginPage();
        loginSteps.enterLoginCredentials(Constants.USER_EMAIL,"");
        loginSteps.clickLoginButton();
        loginSteps.checkInvalidEmailMessage("ERROR: The password field is empty.");
    }
    @Test
    public void attemptLoginWithInvalidPassword(){
        loginSteps.goToLoginPage();
        loginSteps.enterLoginCredentials(Constants.USER_EMAIL, "123bn");
        loginSteps.clickLoginButton();
        loginSteps.checkInvalidEmailMessage("ERROR: The password you entered for the email address ginny@yahoo.com is incorrect. Lost your password?");
    }
}

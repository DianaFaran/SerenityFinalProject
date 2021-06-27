package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.utils.Constants;
import org.junit.Assert;

public class LoginSteps {

    private HomePage homePage;
    private LoginPage loginPage;
    private AccountPage accountPage;

    @Step
    public void goToLoginPage(){
        homePage.open();
        homePage.clickMyAccountLink();
    }
    @Step
    public void enterLoginCredentials(String email, String password){
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
    }
    @Step
    public void clickLoginButton(){
        loginPage.clickLoginButton();
    }
    @Step
    public void doLogin(){
        homePage.open();
        homePage.clickMyAccountLink();
        loginPage.enterEmail(Constants.USER_EMAIL);
        loginPage.enterPassword(Constants.USER_PASSWORD);
        loginPage.clickLoginButton();
        accountPage.verifyWelcomeMessage(accountPage.getWelcomeMessageText());
    }

    @Step
    public void doLogOut(){
        homePage.clickMyAccountLink();
        accountPage.clickLogout();
    }
    @Step
    public void checkInvalidEmailMessage(String message){
        Assert.assertEquals(message,accountPage.getErrorMessage());
    }

    @Step
    public void checkUserIsLoggedIn(String message){
        accountPage.verifyWelcomeMessage(accountPage.getWelcomeMessageText());
        Assert.assertTrue(accountPage.isWelcomeMessageDisplayed(message));
        String expected = message+accountPage.getRandomEmailText()+" (not "+accountPage.getRandomEmailText()+"? "+accountPage.getLogOutLinkText()+")";
        Assert.assertEquals(expected,accountPage.getWelcomeMessageText());
    }
}

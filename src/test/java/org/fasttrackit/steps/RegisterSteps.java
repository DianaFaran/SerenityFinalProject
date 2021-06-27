package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.RegisterPage;
import org.junit.Assert;

public class RegisterSteps {

    private HomePage homePage;
    private RegisterPage registerPage;
    private AccountPage accountPage;

    @Step
    public void goToRegisterPage(){
        homePage.open();
        homePage.clickMyAccountLink();
    }

    @Step
    public void enterCredentials(String email,String password){
        registerPage.enterEmail(email);
        registerPage.enterPassword(password);
    }
    @Step
    public void clickRegisterButton(){
        registerPage.clickRegisterButton();
    }

    @Step
    public void verifyAccountIsRegistered(String message) {
        accountPage.verifyWelcomeMessage(accountPage.getWelcomeMessageText());
        Assert.assertTrue(accountPage.isWelcomeMessageDisplayed(message));
        String expected = message+accountPage.getRandomEmailText()+" (not "+accountPage.getRandomEmailText()+"? "+accountPage.getLogOutLinkText()+")";
        Assert.assertEquals(expected,accountPage.getWelcomeMessageText());
    }
    @Step
    public void checkRegisterErrorMessage(String message){
        Assert.assertEquals(message,accountPage.getErrorMessage());
    }

    @Step
    public void verifyErrorMessageForWrongPassword(String message){
        registerPage.getPasswordHint();
        Assert.assertTrue(message,registerPage.isPasswordHintDisplayed(message));

    }



}

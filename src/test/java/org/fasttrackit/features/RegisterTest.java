package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.RegisterSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class RegisterTest extends BaseTest {
    @Steps
    private RegisterSteps registerSteps;

    @Test
    public void registerWithValidCredentials(){
        registerSteps.goToRegisterPage();
        registerSteps.enterCredentials(Constants.RANDOM_EMAIL,Constants.USER_PASSWORD);
        registerSteps.clickRegisterButton();
        registerSteps.verifyAccountIsRegistered("Hello ");
    }

    @Test
    public void registerWithInvalidPassword(){
        registerSteps.goToRegisterPage();
        registerSteps.enterCredentials(Constants.RANDOM_EMAIL,"123456123456");
        registerSteps.verifyErrorMessageForWrongPassword("Hint:");
    }
    @Test
    public void attemptRegisterWithBlankEmailField(){
        registerSteps.goToRegisterPage();
        registerSteps.enterCredentials("",Constants.USER_PASSWORD);
        registerSteps.clickRegisterButton();
        registerSteps.checkRegisterErrorMessage("Error: Please provide a valid email address.");
    }
    @Test
    public void attemptRegisterWithBlankPasswordField(){
        registerSteps.goToRegisterPage();
        registerSteps.enterCredentials(Constants.NEW_RANDOM_EMAIL,"");
        registerSteps.clickRegisterButton();
        registerSteps.checkRegisterErrorMessage("Error: Please enter an account password.");
    }

    @Test
    public void checkUserIsAlreadyRegisteredMessage(){
        registerSteps.goToRegisterPage();
        registerSteps.enterCredentials(Constants.USER_EMAIL,Constants.USER_PASSWORD);
        registerSteps.clickRegisterButton();
        registerSteps.checkRegisterErrorMessage("Error: An account is already registered with your email address. Please log in.");
    }
}

package org.fasttrackit.features;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.steps.RegisterSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.Constants;
import org.junit.Test;


public class RegisterTest extends BaseTest {

    private AccountPage accountPage;
    @Steps
    private RegisterSteps registerSteps;

    @Test
    public void registerWithValidCredentials(){
        registerSteps.navigateToRegister();
        registerSteps.enterCompleteName("Rosie", "Smith");
        registerSteps.enterCredentials("rosen21@yahoo.com","123456");
        accountPage.verifyWelcomeMessage("Thank you for registering with Madison Island.");
    }

    @Test
    public void emailAlreadyRegistered(){
        registerSteps.navigateToRegister();
        registerSteps.enterCompleteName("Rosie", "Smith");
        registerSteps.enterCredentials(Constants.USER_EMAIL,"123456");
        accountPage.verifyErrorMessage("There is already an account with this email address.");
    }



}

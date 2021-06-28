package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.AccountSteps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class MyAccountTest extends BaseTest {
    @Steps
    private AccountSteps accountSteps;
    @Steps
    private LoginSteps loginSteps;

    @Test
    public void checkUserCanEditBillingAddress(){
        loginSteps.doLogin();
        accountSteps.goToAccountAddresses();
        accountSteps.editBillingAddress();
    }
    @Test
    public void checkUserCanEditShippingAddress(){
        loginSteps.doLogin();
        accountSteps.goToAccountAddresses();
        accountSteps.editShippingAddress();
    }


}

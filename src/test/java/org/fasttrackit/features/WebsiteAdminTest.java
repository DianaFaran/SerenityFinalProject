package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.AdminSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class WebsiteAdminTest extends BaseTest {
    @Steps
    private AdminSteps adminSteps;

    @Test
    public void loginToAdminPage(){
        adminSteps.goToAdminPage();
        adminSteps.enterAdminCredentials();
        adminSteps.checkAdminIsLoggedIn("Howdy, admin");
    }
    @Test
    public void viewUserOrders(){
        adminSteps.doAdminLogin();
        adminSteps.goToOrdersPage();
        adminSteps.checkOrderPageIsDisplayed("Orders");
    }

}

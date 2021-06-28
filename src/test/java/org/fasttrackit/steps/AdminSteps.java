package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.AdminLoginPage;
import org.fasttrackit.pages.AdminPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.utils.Constants;
import org.junit.Assert;

public class AdminSteps {
    private HomePage homePage;
    private AdminLoginPage adminLoginPage;
    private AdminPage adminPage;

    @Step
    public void goToAdminPage(){
        homePage.open();
        homePage.clickAdminLoginLink();
    }

    @Step
    public void doAdminLogin(){
        goToAdminPage();
        enterAdminCredentials();
        adminLoginPage.clickAdminLoginButton();
    }
    @Step
    public void enterAdminCredentials(){
        adminLoginPage.enterAdminUsername(Constants.ADMIN_USERNAME);
        adminLoginPage.enterAdminPassword(Constants.ADMIN_PASSWORD);
        adminLoginPage.clickAdminLoginButton();
    }
    @Step
    public void checkAdminIsLoggedIn(String message){
        Assert.assertEquals(message,adminPage.getLoginMessage());
    }
    @Step
    public void goToOrdersPage(){
        adminPage.clickWoocommerceButton();
        adminPage.clickOrdersButton();
    }
    @Step
    public void checkOrderPageIsDisplayed(String pageTitle){
        Assert.assertEquals(pageTitle,adminPage.getOrderPageTitle());
    }
}

package org.fasttrackit.steps;
import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.AccountOrdersPage;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.HomePage;

public class AccountSteps {
    private AccountPage accountPage;
    private HomePage homePage;
    private AccountOrdersPage accountOrdersPage;

    @Step
    public void goToAccountDashboard(){
        homePage.clickMyAccountLink();
    }
    @Step
    public void goToAccountOrders(){
        accountPage.open();
        accountPage.clickOrdersLink();
    }
    @Step
    public String getUserLastOrderNumber(){
        accountOrdersPage.open();
        accountOrdersPage.clickUserLastOrder();
        return accountOrdersPage.getUserLastOrderNumber();
    }

}

package org.fasttrackit.steps;
import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.AccountOrdersPage;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.CheckoutPage;
import org.fasttrackit.pages.HomePage;

public class AccountSteps {
    private AccountPage accountPage;
    private HomePage homePage;
    private AccountOrdersPage accountOrdersPage;
    private CheckoutPage checkoutPage;

    @Step
    public void goToAccountDashboard(){
        accountPage.open();
    }
    @Step
    public void goToAccountOrders(){
        accountPage.clickOrdersLink();
    }
    @Step
    public void goToAccountAddresses(){
        accountPage.clickAddressesLink();
    }
    @Step
    public void editShippingAddress(){
        accountPage.clickShippingAddressLink();
        checkoutPage.enterShippingInformation();
        accountPage.clickSaveAddressButton();

    }
    @Step
    public void editBillingAddress(){
        accountPage.clickBillingAddressLink();
        checkoutPage.enterBillingInformation();
        accountPage.clickSaveAddressButton();
    }

    @Step
    public String getUserLastOrderNumber(){
        accountOrdersPage.open();
        accountOrdersPage.clickUserLastOrder();
        return accountOrdersPage.getUserLastOrderNumber();
    }

}

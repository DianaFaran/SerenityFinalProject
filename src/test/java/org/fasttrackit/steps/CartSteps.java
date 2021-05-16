package org.fasttrackit.steps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.ProductsPage.DumboJeansPage;
import org.fasttrackit.pages.VipPage;


public class CartSteps {

    private HomePage homePage;
    private VipPage vipPage;
    private DumboJeansPage dumboJeansPage;
    private CartPage cartPage;
    private LoginPage loginPage;

    @Step
    public void navigateToProductPage(){
        homePage.open();
        homePage.clickVipLink();
    }
    @Step
    public void addProductToCart() {
        homePage.open();
        homePage.clickVipLink();
        vipPage.viewProductDetails();
        dumboJeansPage.selectProductColor();
        dumboJeansPage.selectProductSize();
        dumboJeansPage.addToCart();
    }
    @Step
    public void checkItemAddedToCart(){
        cartPage.checkAddedToCartMessage(" was added to ");

    }
    @Step
    public void emptyCart(){
        cartPage.clickEmptyCartButton();
        cartPage.checkEmptyCartMessage("You have no items in your shopping cart.");
    }

    @Step
    public void changeItemQuantity(String quantity){
        cartPage.inputNumberOfItems(quantity);
        cartPage.updateQuantity();
    }
    @Step
    public void proceedToCheckout(){
        cartPage.clickCheckoutButton();
    }
}

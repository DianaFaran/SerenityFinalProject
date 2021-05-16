package org.fasttrackit.features;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.steps.CartSteps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.Constants;
import org.junit.Test;


public class CartTest extends BaseTest {

    @Steps
    private CartSteps cartSteps;
    @Steps
    private LoginSteps loginSteps;

    @Test
    public void addToCartWithLoggedAccount(){
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASSWORD);
        cartSteps.navigateToProductPage();
        cartSteps.addProductToCart();
    }

    @Test
    public void addItemToCartWithoutLogin(){
        cartSteps.navigateToProductPage();
        cartSteps.addProductToCart();
        cartSteps.checkItemAddedToCart();
    }

    @Test
    public void changeNumberOfItemsInCart(){
        cartSteps.addProductToCart();
        cartSteps.changeItemQuantity("3");
    }

    @Test
    public void removeAllItemsFromCart(){
        cartSteps.addProductToCart();
        cartSteps.emptyCart();
    }
//    @Test
//    public void emptyCartForLoggedUser(){
//        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASSWORD);
//        homePage.clickCartLink();
//        cartSteps.emptyCart();
//    }

}

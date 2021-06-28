package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.CartSteps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.steps.SearchSteps;
import org.fasttrackit.steps.ShopSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class CartTest extends BaseTest {
    @Steps
    private CartSteps cartSteps;
    @Steps
    private LoginSteps loginSteps;
    @Steps
    private SearchSteps searchSteps;
    @Steps
    private ShopSteps shopSteps;


    @Test
    public void addProductToCartFromShopPage() {
        shopSteps.addProductToCart();
        shopSteps.checkProductIsAdded();
    }
    @Test
    public void addMultipleProductsToCartFromShopPage(){
        shopSteps.addProductToCart();
        shopSteps.checkProductIsAdded();
        shopSteps.addMultipleProductsToCart();
    }

    @Test
    public void addProductToCartByKeyword(){
        cartSteps.addSpecificProductToCart("Beanie");
        cartSteps.checkProductIsAdded("“Beanie with Logo” has been added to your cart.");
    }
    @Test
    public void addMultipleProductsToCartByKeyword(){
        cartSteps.addSpecificProductToCart("Beanie");
        cartSteps.checkProductIsAdded("“Beanie with Logo” has been added to your cart.");
        cartSteps.addSpecificProductToCart("hoodie");
        cartSteps.checkProductIsAdded("“Hoodie with Pocket” has been added to your cart.");
        cartSteps.addSpecificProductToCart("hoodie with zipper");
        cartSteps.checkProductIsAdded("“Hoodie with Zipper” has been added to your cart.");
    }

    @Test
    public void addToCartProductsFromSearchResults(){
        cartSteps.addSpecificProductToCart("beanie");
        cartSteps.checkProductIsAdded("“Beanie with Logo” has been added to your cart.");
    }

    @Test
    public void addProductToCartWithLogin(){
        loginSteps.doLogin();
        cartSteps.addMultipleItemsByKeyword();
    }

    @Test
    public void checkItemsAreSavedInUserCart(){
        loginSteps.doLogin();
        cartSteps.addSpecificProductToCart("beanie");
        cartSteps.checkProductIsAdded("“Beanie with Logo” has been added to your cart.");
        cartSteps.addSpecificProductToCart("hoodie");
        cartSteps.checkProductIsAdded("“Hoodie with Pocket” has been added to your cart.");
        cartSteps.addSpecificProductToCart("hoodie with zipper");
        cartSteps.checkProductIsAdded("“Hoodie with Zipper” has been added to your cart.");
        loginSteps.doLogOut();
        loginSteps.doLogin();
        cartSteps.viewCartDetails();
        cartSteps.checkProductIsInCart("Hoodie with Pocket");
    }

    @Test
    public void removeItemFromCart(){
        shopSteps.addProductToCart();
        shopSteps.checkProductIsAdded();
        cartSteps.viewCartDetails();
        cartSteps.removeProductFromCart();
    }

    @Test
    public void emptyUserCart(){
        loginSteps.doLogin();
        shopSteps.addProductToCart();
        cartSteps.viewCartDetails();
        cartSteps.emptyCart();
        cartSteps.checkCartIsEmpty();
    }

    @Test
    public void changeItemQuantity(){
        shopSteps.addProductToCart();
        cartSteps.viewCartDetails();
        cartSteps.changeQuantity("3");
    }
}

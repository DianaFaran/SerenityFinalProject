package org.fasttrackit.steps;
import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.*;
import org.junit.Assert;

public class CartSteps {
    private HomePage homePage;
    private ShopPage shopPage;
    private SearchPage searchPage;
    private SearchResultsPage searchResultsPage;
    private ProductPage productPage;
    private CartPage cartPage;

    @Step
    public void goToShopPage(){
        homePage.open();
        homePage.clickShopLink();
    }

    @Step
    public void addSpecificProductToCart(String productName){
        homePage.open();
        searchPage.searchForProduct(productName);
        searchResultsPage.clickProductLink();
        productPage.clickAddToCartButton();
    }
    @Step
    public void addMultipleItemsByKeyword(){
        goToShopPage();
        searchPage.searchForProduct("beanie");
        searchResultsPage.clickProductLink();
        productPage.clickAddToCartButton();
        searchPage.searchForProduct("hoodie with zipper");
        searchResultsPage.clickProductLink();
        productPage.clickAddToCartButton();
        searchPage.searchForProduct("hoodie with pocket");
        searchResultsPage.clickProductLink();
        productPage.clickAddToCartButton();
    }

    @Step
    public void checkProductIsAdded(String message){
        Assert.assertEquals(message, productPage.getAddedToCartMessage());
    }
    @Step
    public void checkProductIsInCart(String productName){
        Assert.assertTrue(cartPage.isProductInCart(productName));

    }
    @Step
    public void viewCartDetails() {
        homePage.clickCartLink();
    }

    @Step
    public void changeQuantity(String number){
        cartPage.changeQuantity(number);
        cartPage.clickUpdateCartButton();
        cartPage.checkUpdatedCartMessage();
    }

    @Step
    public void emptyCart(){
        viewCartDetails();
        cartPage.removeAllProducts();
    }
    @Step
    public void checkCartIsEmpty(){
        Assert.assertTrue("Cart is not empty",cartPage.verifyCartIsEmpty());
    }

    @Step
    public void removeProductFromCart(){
        cartPage.clickRemoveButton();
        Assert.assertTrue(cartPage.verifyRemovedProduct());
    }
    @Step
    public void clickCheckoutButton() {
        cartPage.clickCheckoutButton();
    }

}

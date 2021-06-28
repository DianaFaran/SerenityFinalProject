package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.ShopPage;
import org.junit.Assert;

public class ShopSteps {
    private ShopPage shopPage;

    @Step
    public void addProductToCart(){
        shopPage.open();
        shopPage.clickProductLink();
        shopPage.clickAddToCartButton();
    }
    @Step
    public void addMultipleProductsToCart(){
        shopPage.open();
        shopPage.addMultipleProducts();

    }
    @Step
    public void checkProductIsAdded(){
        Assert.assertTrue(shopPage.isAddedToCart());
    }

}

package org.fasttrackit.steps;


import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.SalePage;
import org.fasttrackit.pages.VipPage;
import org.fasttrackit.pages.WishlistPage;

public class AddToWishlistSteps {

    private HomePage homePage;
    private SalePage salePage;
    private WishlistPage wishlistPage;
    private VipPage vipPage;

    @Step
    public void navigateToSalePage(){
        homePage.open();
        homePage.clickSaleLink();
    }
    @Step
    public void addToWishlist(){
        salePage.clickViewProductDetails();
        vipPage.clickAddToWishlistLink();

    }
}

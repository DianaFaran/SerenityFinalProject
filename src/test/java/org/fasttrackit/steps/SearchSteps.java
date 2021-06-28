package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.SearchPage;
import org.fasttrackit.pages.SearchResultsPage;
import org.junit.Assert;

public class SearchSteps {
    private HomePage homePage;
    private SearchPage searchPage;
    private SearchResultsPage searchResultsPage;

    @Step
    public void searchForProduct(String productName) {
        homePage.open();
        searchPage.searchForProduct(productName);
    }

    @Step
    public void showResultsList(){
        System.out.println(searchResultsPage.getProductList());
    }
    @Step
    public void verifyProductIsInList(String productName){
        Assert.assertTrue("Product is not in the list", searchResultsPage.isProductInList(productName));
    }
    @Step
    public void checkNoResultsMessage(){
        Assert.assertTrue("Sorry, but nothing matched your search terms.",
                searchResultsPage.searchResultsMessage("Sorry, but nothing matched your search terms."));
    }




}

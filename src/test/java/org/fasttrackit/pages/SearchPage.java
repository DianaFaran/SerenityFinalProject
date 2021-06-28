package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SearchPage extends PageObject {

    @FindBy(css = ".search-field")
    private WebElementFacade searchField;

    public void clickSearchField(){
        clickOn(searchField);
    }
    public void searchForProduct(String productName){
        searchField.typeAndEnter(productName);
    }
}

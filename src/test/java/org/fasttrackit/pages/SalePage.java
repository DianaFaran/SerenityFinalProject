package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;



public class SalePage extends PageObject {

    @FindBy(css = ".actions [title^='View Details']")
    private WebElementFacade viewProductDetails;

    public void clickViewProductDetails(){
        clickOn(viewProductDetails);
    }

}

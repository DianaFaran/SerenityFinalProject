package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

public class SearchResultsPage extends PageObject {

    @FindBy(css = ".entry-title")
    private List <WebElementFacade> productList;

    @FindBy(css=".entry-title a")
    private WebElementFacade productLink;

    @FindBy(css=".page-content p")
    private WebElementFacade searchResultsMessage;

    public List<String> getProductList(){
        return findAll(".entry-title").stream()
                .map(WebElementFacade::getText)
                .collect(Collectors.toList());
    }

    public boolean isProductInList(String productName){
        for(WebElementFacade list: productList){
            if (list.findElement(By.cssSelector(".entry-title a")).getText().equalsIgnoreCase(productName)) {
                return true;
            }
        }
        return false;
    }
    public void clickProductLink(){
        clickOn(productLink);
    }

    public boolean searchResultsMessage(String message){
        return searchResultsMessage.getText().startsWith(message);


    }


}

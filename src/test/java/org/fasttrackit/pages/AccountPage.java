package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class AccountPage extends PageObject {

    @FindBy(css = ".success-msg span")
    private WebElementFacade welcomeMessageParagraph;

    @FindBy(css = ".error-msg span")
    private WebElementFacade errorMessage;

    public void verifyErrorMessage(String message){
        errorMessage.shouldContainText(message);
    }

    public void verifyWelcomeMessage(String message){
        welcomeMessageParagraph.shouldContainText(message);
    }

    public boolean isWelcomeTextDisplayed(String text){
        return welcomeMessageParagraph.containsOnlyText(text);
    }

    public String getWelcomeText(){
        return welcomeMessageParagraph.getText();
    }
}

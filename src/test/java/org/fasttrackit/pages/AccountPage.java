package org.fasttrackit.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa1.fasttrackit.org:8008/my-account/")
public class AccountPage extends PageObject {

    @FindBy(css = ".woocommerce p:first-child")
    private WebElementFacade welcomeMessage;

    @FindBy(css = ".woocommerce p strong")
    private WebElementFacade randomUser;

    @FindBy(css = ".woocommerce p:first-child a")
    private WebElementFacade logoutLink;

    @FindBy(css = ".woocommerce-error li")
    private WebElementFacade errorMessage;

    @FindBy(css = ".woocommerce-MyAccount-navigation-link--orders a")
    private WebElementFacade ordersLink;

    public String getErrorMessage(){
        return errorMessage.getText();
    }

    public void clickLogout(){
        clickOn(logoutLink);
    }
    public void clickOrdersLink(){
        clickOn(ordersLink);
    }

    public void verifyWelcomeMessage(String message){
        waitFor(".woocommerce p strong:first-child");
        welcomeMessage.containsText(message + randomUser.getText());
    }
    public boolean isWelcomeMessageDisplayed(String message){
        waitFor(welcomeMessage);
        return welcomeMessage.containsText(message + randomUser.getText());
    }
    public String getLogOutLinkText(){
        return logoutLink.getText();
    }
    public String getRandomEmailText(){
        return randomUser.getText();
    }
    public String getWelcomeMessageText(){
        return welcomeMessage.getText();
    }


}

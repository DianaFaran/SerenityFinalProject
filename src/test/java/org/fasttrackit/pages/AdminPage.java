package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AdminPage extends PageObject {

    @FindBy(css="#wp-admin-bar-my-account > a")
    private WebElementFacade loginMessage;

    @FindBy(css="#toplevel_page_woocommerce > a > div.wp-menu-name")
    private WebElementFacade shopMenuButton;

    @FindBy(css="#toplevel_page_woocommerce > a > div.wp-menu-name")
    private WebElementFacade ordersButton;

    @FindBy(css = ".wp-heading-inline")
    private WebElementFacade orderPageTitle;

    public String getOrderPageTitle(){
        return orderPageTitle.getText();
    }

    public void clickOrdersButton(){
        clickOn(ordersButton);
    }
    public void clickWoocommerceButton(){
        clickOn(shopMenuButton);
    }

    public String getLoginMessage(){
        return loginMessage.getText();
    }

}

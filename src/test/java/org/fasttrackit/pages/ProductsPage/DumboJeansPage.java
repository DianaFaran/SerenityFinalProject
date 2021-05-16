package org.fasttrackit.pages.ProductsPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class DumboJeansPage extends PageObject {

        @FindBy(css = "#swatch27 .swatch-label")
        private WebElementFacade productColor;

        @FindBy(css = "#option68.option-27")
        private WebElementFacade productSize;

        @FindBy(css = "div.add-to-cart-buttons")
        private WebElementFacade addToCart;

        public void addToCart() {
            clickOn(addToCart);
        }
        public void selectProductSize() {
            clickOn(productSize);
        }

        public void selectProductColor() {
            clickOn(productColor);
        }

}

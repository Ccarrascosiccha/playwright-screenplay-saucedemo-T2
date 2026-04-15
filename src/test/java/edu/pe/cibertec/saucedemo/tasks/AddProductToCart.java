package edu.pe.cibertec.saucedemo.tasks;

import edu.pe.cibertec.saucedemo.ui.InventoryPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.playwright.Target;
import net.serenitybdd.screenplay.playwright.interactions.Click;

public class AddProductToCart {

    public static Performable named(String productName) {
        return Task.where("{0} adds product '" + productName + "' to the cart",
                Click.on(
                        Target.the("Add to cart button for " + productName)
                                .locatedBy(InventoryPage.addToCartButton(productName))
                )
        );
    }

}

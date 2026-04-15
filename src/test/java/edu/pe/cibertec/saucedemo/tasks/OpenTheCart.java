package edu.pe.cibertec.saucedemo.tasks;

import edu.pe.cibertec.saucedemo.ui.InventoryPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.playwright.Target;
import net.serenitybdd.screenplay.playwright.interactions.Click;

public class OpenTheCart {
    public static Performable page() {
        return Task.where("{0} opens the cart",
                Click.on(
                        Target.the("Cart link")
                                .locatedBy(InventoryPage.CART_LINK)
                )
        );
    }
}

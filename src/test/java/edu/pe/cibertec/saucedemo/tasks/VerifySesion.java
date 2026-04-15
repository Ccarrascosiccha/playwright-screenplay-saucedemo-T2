package edu.pe.cibertec.saucedemo.tasks;

import edu.pe.cibertec.saucedemo.ui.CartPage;
import edu.pe.cibertec.saucedemo.ui.InventoryPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.playwright.Target;
import net.serenitybdd.screenplay.playwright.interactions.Click;

public class VerifySesion {

    public static Performable navigateToCartPage() {
        return Task.where("{0} navigates to the cart page",
                Click.on(
                        Target.the("Cart link")
                                .locatedBy(InventoryPage.CART_LINK)
                )
        );
    }

    public static Performable navigateBackToInventoryPage() {
        return Task.where("{0} navigates back to the inventory page",
                Click.on(
                        Target.the("Continue shopping button")
                                .locatedBy(CartPage.CONTINUE_SHOPPING_BUTTON)
                )
        );
    }
}

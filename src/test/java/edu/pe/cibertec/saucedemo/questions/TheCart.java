package edu.pe.cibertec.saucedemo.questions;

import edu.pe.cibertec.saucedemo.ui.CartPage;
import edu.pe.cibertec.saucedemo.ui.InventoryPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.playwright.Target;
import net.serenitybdd.screenplay.playwright.questions.Text;

import java.util.List;

public class TheCart {

    public static Question<String>badgeQuantity(){
        return Text.of(Target.the("Cart Badge")
            .locatedBy(InventoryPage.CART_BADGE));
    }
    public static Question<List<String>> itemNames() {
        return Text.ofEach(
                Target.the("Cart item names")
                        .locatedBy(CartPage.CART_ITEM_NAMES)
        );
    }

}

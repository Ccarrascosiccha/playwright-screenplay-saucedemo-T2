package edu.pe.cibertec.saucedemo.tasks;

import edu.pe.cibertec.saucedemo.ui.CheckoutPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.playwright.Target;
import net.serenitybdd.screenplay.playwright.questions.Text;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class VerifyResumen {

    public static Performable showsItemTotal(String itemTotal) {
        return Task.where("{0} verifies the order summary shows item total '" + itemTotal + "'",
                actor -> actor.should(
                        seeThat(
                                Text.of(
                                        Target.the("Item total label")
                                                .locatedBy(CheckoutPage.ITEM_TOTAL_LABEL)
                                ),
                                containsString(itemTotal)
                        )
                )
        );
    }
}

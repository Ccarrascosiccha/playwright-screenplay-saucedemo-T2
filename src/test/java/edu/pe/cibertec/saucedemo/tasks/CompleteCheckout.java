package edu.pe.cibertec.saucedemo.tasks;

import edu.pe.cibertec.saucedemo.ui.CheckoutPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.playwright.Target;
import net.serenitybdd.screenplay.playwright.interactions.Click;
import net.serenitybdd.screenplay.playwright.interactions.Enter;

public class CompleteCheckout {
    public static Performable with(String firstName, String lastName, String postalCode) {
        return Task.where("{0} proceeds to checkout with first name '" + firstName + "', last name '" + lastName + "', and postal code '" + postalCode + "'",
                OpenTheCart.page(),
                Click.on(
                        Target.the("Checkout button")
                                .locatedBy(CheckoutPage.CHECKOUT_BUTTON)
                ),
                Enter.theValue(firstName).into(
                        Target.the("First name field")
                                .locatedBy(CheckoutPage.FIRST_NAME_FIELD)
                ),
                Enter.theValue(lastName).into(
                        Target.the("Last name field")
                                .locatedBy(CheckoutPage.LAST_NAME_FIELD)
                ),
                Enter.theValue(postalCode).into(
                        Target.the("Postal code field")
                                .locatedBy(CheckoutPage.POSTAL_CODE_FIELD)
                ),
                Click.on(
                        Target.the("Continue button")
                                .locatedBy(CheckoutPage.CONTINUE_BUTTON)
                )
        );
    }
}

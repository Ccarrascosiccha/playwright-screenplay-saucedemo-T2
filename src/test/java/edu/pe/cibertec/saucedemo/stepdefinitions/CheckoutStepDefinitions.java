package edu.pe.cibertec.saucedemo.stepdefinitions;

import edu.pe.cibertec.saucedemo.tasks.CompleteCheckout;
import edu.pe.cibertec.saucedemo.tasks.CompleteTheOrder;
import edu.pe.cibertec.saucedemo.tasks.VerifyResumen;
import edu.pe.cibertec.saucedemo.ui.CheckoutPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.playwright.Target;
import net.serenitybdd.screenplay.playwright.assertions.Ensure;
import net.serenitybdd.screenplay.playwright.questions.Text;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;

public class CheckoutStepDefinitions {
    @When("she proceeds to checkout with first name {string}, last name {string} and postal code {string}")
    public void sheProceedsToCheckoutWithFirstNameLastNameAndPostalCode(String firstName, String lastName, String postalCode) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CompleteCheckout.with(firstName, lastName, postalCode)
        );
    }
    @When("she verifies the order summary shows item total {string}")
    public void sheVerifiesTheOrderSummaryShowsItemTotal(String total) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                VerifyResumen.showsItemTotal(total)
        );
    }
    @When("she completes the order")
    public void sheCompletesTheOrder() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CompleteTheOrder.now()
        );
    }
    @Then("she should see the confirmation message {string}")
    public void sheShouldSeeTheConfirmationMessage(String message) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(
                        Text.of(
                                Target.the("Confirmation message")
                                        .locatedBy(CheckoutPage.COMPLETE_HEADER)
                        ),
                        equalTo(message)
                )
        );
    }

    @Then("the checkout form should remain visible")
    public void theCheckoutFormShouldRemainVisible() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(
                        Target.the("First name field")
                                .locatedBy(CheckoutPage.FIRST_NAME_FIELD)
                ).isVisible()
        );
    }
}

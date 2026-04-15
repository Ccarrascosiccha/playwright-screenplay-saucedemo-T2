package edu.pe.cibertec.saucedemo.stepdefinitions;

import edu.pe.cibertec.saucedemo.questions.TheCart;
import edu.pe.cibertec.saucedemo.tasks.AddProductToCart;
import edu.pe.cibertec.saucedemo.tasks.RemoveProductFromCart;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import static org.hamcrest.Matchers.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import edu.pe.cibertec.saucedemo.tasks.OpenTheCart;
import io.cucumber.java.en.Then;
import java.util.List;


public class CartStepDefinitions {


    @When("she adds the product {string} to the cart")
    public void sheAddsTheProductTotheCart(String producName) {
       OnStage.theActorInTheSpotlight().attemptsTo(
               AddProductToCart.named(producName)
       );
    }
    @Then("the cart icon should display {string}")
    public void theCartIconShouldDisplayTheQuantity(String quantity) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(TheCart.badgeQuantity(),equalTo(quantity))
        );
    }
    @Then("the cart should contain {string} and {string}")
        public void theCartShouldContainAnd(String firstProduct, String secondProduct) {

        }
    @When("she removes the product {string} from the cart")
    public void sheRemovesTheProductFromTheCart(String productName){
        OnStage.theActorInTheSpotlight().attemptsTo(
                RemoveProductFromCart.named(productName)
        );
    }
    @Then("the cart should contain {String}")
    public void theCartShouldOnlyContain(String productName) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                OpenTheCart.page()
        );

        OnStage.theActorInTheSpotlight().should(
                seeThat(TheCart.itemNames(), equalTo(List.of(productName)))
        );
    }
}

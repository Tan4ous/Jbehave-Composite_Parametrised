package Tan4ous.steps;

import Tan4ous.steps.Bonus;
import org.jbehave.core.annotations.*;

import static org.junit.Assert.assertEquals;

public class MySteps {

    private String status;
    private Bonus bonus;
    private int quantity;
    int sum = 0, b1;

    @Given("<user> is logged in")
    @Alias("$user is logged in")
    public void givenuserIsLoggedIn(){
           bonus.isLogged = true;
    }

     @Given("<user> has <points>")
     @Alias("$user has <points>")
     public void givenuserHaspoints(@Named("points") Double points) {
            bonus.calculateSum(points);
     }

    @Given("%user has bought a %product")
    @Alias("<user> has bought a <product>")
    @Composite(steps = {
            "Given <user> is logged in",
            "Given <user> has <points>",
    })
    public void aCompositeStep(@Named("user") String user,@Named("product") int product, @Named("points") int points) {
        bonus = new Bonus(product);
    }

    @When("<user> get sum of <points> or bonus")
    public void whenTheStockIsTradedAtsum() {
        status = bonus.checkOutSum();
    }

    @Then("sum is <result>")
    public void thenTheAlertStatusShouldBeresult(@Named("result") String stat) {
        assertEquals(stat, status);
    }

    @Then("sum equal <result>")
    public void equalresult(@Named("result") Double stat) {
        assertEquals(stat, bonus.sum);
    }

    @Given("%user added new product in the basket")
    @Alias("<user> added new product in the basket")
    @Composite(steps = {
            "Given <user> is logged in",
    })
    public void aComposite(@Named("user") String user) {

    }

    @When("sum of <already> or new product")
    public void AddedQuantity(@Named("already") int already) {
        quantity = already + 1;
    }

    @Then("quantity of product equal <result>")
    public void thenTheAlertQuantityShouldBeresult(@Named("result") int stat) {
        assertEquals(stat, quantity);
    }

    @Given("an operating system <value>")
    public void OS(@Named("value") String os){

    }






}
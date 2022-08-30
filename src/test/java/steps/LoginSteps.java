package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps
{
    @Given("user navigate to the website")
    public void user_navigate_to_the_website() {
        System.out.println("Go to web");
    }
    @When("user user validates the homepage title")
    public void userUserValidatesTheHomepageTitle() {
        System.out.println("Get homepage title");
    }

    @And("user enters {string} username")
    public void userEntersUsername(String username) {
        System.out.println("User enter "+username+" ");
    }

    @And("user enters {string} password")
    public void userEntersPassword(String password) {
        System.out.println("User enters "+password+"");
    }

    @Then("user click on the sign in button")
    public void user_click_on_the_sign_in_button() {

    }


}

package com.sai.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MySteps {
    @Given("this background of feature {int}")
    public void thisBackgroundOfFeature(int featureNo) {
        System.out.println("\n---------------------------------------------------------------");
        System.out.println("Background of feature "+featureNo);
    }

    @Given("I am a given of scenario {int}")
    public void iAmAGivenOfScenario(int featureNo) {
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Given of scenario of feature- "+featureNo);
    }

    @When("I am a when of scenario {int}")
    public void iAmAWhenOfScenario(int featureNo) {
        System.out.println("When of scenario of feature "+featureNo);
    }

    @Then("I am a then of scenario {int}")
    public void iAmAThenOfScenario(int featureNo) {
        System.out.println("Then of scenario of feature "+featureNo);
    }
}

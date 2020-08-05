package com.sai.cucumber.steps;

import com.sai.cucumber.TestApplication;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import org.junit.Assert;

public class AppSteps {
    @Given("this app is opened")
    public void thisAppIsOpened() {
        
    }

    @Given("the mouse is on button {int}")
    public void theMouseIsOnButton(int i) {
        TestApplication.fxRobot.moveTo("#button"+i);
    }

    @When("the mouse clicks")
    public void theMouseClicks() {
        TestApplication.fxRobot.clickOn(MouseButton.PRIMARY);
    }

    @Then("the label in {int} should be {string}")
    public void theLabelInShouldBe(int i, String val) {
        String txt = TestApplication.fxRobot.lookup("#label"+i).queryAs(Label.class).getText();
        if(!txt.equals(val)){
            throw new AssertionError("E");
        }
    }
}

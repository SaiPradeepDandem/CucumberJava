package com.sai.cucumber.configuration;

import com.sai.cucumber.TestApplication;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import javafx.scene.control.Label;

public class TestLifeCycle {
    @After
    public void afterScenario(Scenario scenario){
        for (int i = 0; i < 10; i++) {
            TestApplication.fxRobot.lookup("#label"+i).queryAs(Label.class).setText("");
        }
    }
}

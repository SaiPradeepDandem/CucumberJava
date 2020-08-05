package com.sai.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
        features = { "src/test/resources/features" },
        glue = { "com.sai.cucumber.steps" },
        plugin = {"pretty","com.sai.cucumber.configuration.CucumberHook","html:target/cucumber-html-report",
                  "json:target/cucumber-JVM-reports/cucumber.json"})
public class RunCucumberIT {

}

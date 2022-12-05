package com.stalindurjo.uat.TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/stalindurjo/uat/Feature",
        glue = {"com.stalindurjo.uat.StepDefinitions"},
        tags = "not @ignore and @only",
//        dryRun = true,
        plugin = {"json:target/cucumber.json"}
)
public class TestRunner {}

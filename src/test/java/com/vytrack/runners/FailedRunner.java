package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="@target/rerun.txt",
        glue = "com/vytrack/step_definitions",  //path to the step definitions
        plugin = {"html:target/rerun-default-cucumber-reports",
//                "json:target/cucumber.json"
        }
)

public class FailedRunner {
}

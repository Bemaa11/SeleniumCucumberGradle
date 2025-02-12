package com.bima;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"com.bima.stepdef"},
        features = {"src/test/resources/features"},
        plugin = {"pretty","html:reports/index.html", "json:reports/cucumber.json"}
)
public class CucumberTest {

}

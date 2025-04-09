package testrunner;


import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@Test
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "stepdefinition",
    plugin = {"pretty"},
    monochrome = true
)
public class Runner extends AbstractTestNGCucumberTests {
}
   
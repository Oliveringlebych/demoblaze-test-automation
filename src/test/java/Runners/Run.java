package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resource/demoblaze.feature",
        glue = {"stepdefs"}
)
public class Run extends AbstractTestNGCucumberTests {
}

package runner;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//This is runner class. Basically runs our feature file when we specify feature tag

import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        plugin = {"pretty",
                "html:target/default-cucumber-reports",
                "json:target/cucumber.json",
        },
        //features = {"/Users/jimawesome/Downloads/project02/src/test/features"},
        features = {"/Users/jimawesome/PycharmProjects/Python/trello/src/test/java/features"},
        glue = "steps",
        tags = "@test",
        dryRun = false
)



public class CukesRunner extends AbstractTestNGCucumberTests {


}

package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.asserts.SoftAssert;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import utils.ConfigurationReader;
import utils.Driver;

public class Hooks {

    @Before
    public void setUp(Scenario scenario) {
        WebDriver driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        driver.get(ConfigurationReader.getProperty("url"));
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            /* HERE we are taking a SCREENSHOT */
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            /* HERE we are adding the Screenshot to the REPORT */
            scenario.embed(screenshot, "image/png");
        }
        SoftAssert soft = new SoftAssert();
        soft.assertAll();
//        Driver.quit();

    }
}

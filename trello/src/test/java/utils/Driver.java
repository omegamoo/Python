package utils;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

    private Driver() {
    }

    private static WebDriver driver;
    JavascriptExecutor js = (JavascriptExecutor) driver;

    public static WebDriver getDriver() {

        if (driver == null) {

            switch (ConfigurationReader.getProperty("browser")) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--no-sandbox"); // Bypass OS security model
                    options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
                    options.addArguments("window-size=1920,1080");
                    driver = new ChromeDriver(options);
                    break;

                /* This is NEEDED for Sauce labs (For cross browser testing) */
//				DesiredCapabilities caps = DesiredCapabilities.chrome();
//				caps.setPlatform(Platform.ANY);
//				try {
//					driver = new RemoteWebDriver(new URL(""), caps);
//				} catch (MalformedURLException e) {
//					e.printStackTrace();
//				}

                case "ie":
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;
                default:
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
            }
        }

        return driver;
    }

    /* QUIT the browser */
    public static void quit() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }


    /* QUIT + WAIT */
    public static void quit(int seconds) {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    /* Is Read only */
    public static boolean isreadOnly(WebElement element) {
        Boolean readOnly = false;
        readOnly = ((element.getAttribute("disabled") != null || element.getAttribute("readonly") != null));
        if (element.getAttribute("readonly") != null) {
            System.out.println("ELEMENT IS NOT READONLY");
        } else {

        }
        return readOnly;
    }

    /* SLEEP for a while */
    public static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /*SLEEP for a ExpectedCondition finishes*/
    public static void sleep(ExpectedCondition<WebElement> visibilityOf) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /* This Utility HIGHLIGHTS your driver action */
    public static void highLightElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: red; border: 4px solid red;");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
    }



}

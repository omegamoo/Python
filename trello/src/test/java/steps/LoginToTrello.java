package steps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utils.*;
import pages.*;

public class LoginToTrello {

    WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 30);
    Actions actions = new Actions(driver);
    SoftAssert soft = new SoftAssert();

    LoginPage loginPage = new LoginPage(driver);

    String username = ConfigurationReader.getProperty("username");
    String password = ConfigurationReader.getProperty("password");


    @Given("User clicks Login link")
    public void user_clicks_Login_link() {
        BrowserUtilities.clickElement(loginPage.loginLinkOnTop);
    }

    @Given("User types user credentials")
    public void user_types_user_credentials() {
        BrowserUtilities.fillInputBox(loginPage.usernameInputBox, username);
        BrowserUtilities.fillInputBox(loginPage.passwordInputBox, password);
    }

    @Then("User clicks login button")
    public void user_clicks_login_button() {
        BrowserUtilities.clickElement(loginPage.loginButton);
    }

}

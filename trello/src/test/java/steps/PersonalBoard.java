package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import pages.PersonalBoardPage;
import pages.LoginPage;
import utils.BrowserUtilities;
import utils.ConfigurationReader;
import utils.Driver;

public class PersonalBoard {

    WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 30);
    Actions actions = new Actions(driver);
    SoftAssert soft = new SoftAssert();

    PersonalBoardPage personalBoardPage = new PersonalBoardPage(driver);

    @Given("User clicks LifeGoals from the personal boards")
    public void user_clicks_LifeGoals_from_the_personal_boards() {
        BrowserUtilities.clickElement(personalBoardPage.lifeGoalsBoard);
    }


    @And("User clicks addAnotherLink")
    public void User_clicks_addAnotherLink() {
        BrowserUtilities.clickElement(personalBoardPage.addAnotherLink);
    }

    @And("User types testText")
    public void user_types_testText() {
        BrowserUtilities.fillInputBox(personalBoardPage.testText, "test123");
    }

    @Then("User clicks AddCard button")
    public void user_clicks_AddCard_button() {
        BrowserUtilities.clickElement(personalBoardPage.addButton);
    }

}
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalBoardPage {

    public PersonalBoardPage (WebDriver driver){

        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='board-tile-details is-badged']")
    public WebElement lifeGoalsBoard;

    @FindBy(xpath = "//*[@id=\'board\']/div[1]/div/a/span[3]")
    public WebElement addAnotherCardLink;

    @FindBy(xpath = "//textarea[@class='list-card-composer-textarea js-card-title']")
    public WebElement addAnotherBoardInputBox;

    @FindBy(xpath = "//input[@class='primary confirm mod-compact js-add-card']")
    public WebElement addCardButton;

}

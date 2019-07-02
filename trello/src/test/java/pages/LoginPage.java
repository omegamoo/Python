package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver){

        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "/html/body/header/nav/div[2]/a[1]")
    public WebElement loginLinkOnTop;

    @FindBy(xpath = "//*[@id=\"user\"]")
    public WebElement usernameInputBox;

    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//*[@id=\"login\"]")
    public WebElement loginButton;




}

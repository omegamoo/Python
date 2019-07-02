package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtilities {
    private static WebDriver driver = Driver.getDriver();
    static WebDriverWait wait = new WebDriverWait(driver, 40);


    // Clicks any webElement
    public static void clickElement(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public static void fillInputBox(WebElement elementInputBox, String text) {
        wait.until(ExpectedConditions.elementToBeClickable(elementInputBox));
        elementInputBox.sendKeys(text);
    }
}

package Pages.ElementsPages;

import Base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonsPage extends BaseTest {
    Actions actions = new Actions(driver);
    public ButtonsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "doubleClickBtn")
    public WebElement doubleClickButton;

    @FindBy(id = "rightClickBtn")
    public WebElement rightClickButton;

    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button")
    public WebElement clickMeButton;

    @FindBy (id = "doubleClickMessage")
    public WebElement doubleClickMessage;

    @FindBy (id = "rightClickMessage")
    public WebElement rightClickMessage;

    @FindBy (id = "dynamicClickMessage")
    public WebElement clickMeMessage;


    public void setMargin(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.marginTop ='50px'", element);
    }
    public void doubleClick() {
        actions.doubleClick(doubleClickButton).perform();
    }

    public void rightClick() {
        actions.contextClick(rightClickButton).perform();
    }

    public void clickMe() {
        clickMeButton.click();
    }
}

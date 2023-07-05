package Pages.BookStorePages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectedBookPage extends BaseTest {

    public SelectedBookPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".text-right.fullButton")
    public WebElement addToCollectionButton;

    @FindBy(css = ".text-left.fullButton")
    public WebElement backToBookStoreButton;


    public void clickOnAddToCollectionButton() {
        addToCollectionButton.click();
    }

    public void backToBookStoreButton() {
        backToBookStoreButton.click();
    }

//    public void closeAlert() throws InterruptedException {
//        Thread.sleep(1000);
//        driver.switchTo().alert().accept();
//    }
}

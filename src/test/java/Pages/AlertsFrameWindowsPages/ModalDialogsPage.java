package Pages.AlertsFrameWindowsPages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModalDialogsPage extends BaseTest {

    public ModalDialogsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "showSmallModal")
    public WebElement smallModalButton;

    @FindBy(id = "showLargeModal")
    public WebElement largeModalButton;

    @FindBy(css = ".modal-dialog.modal-sm")
    public WebElement smallModal;

    @FindBy(id = "closeSmallModal")
    public WebElement closeSmallModalButton;

    @FindBy(css = ".modal-dialog.modal-lg")
    public WebElement largeModal;

    @FindBy(id = "closeLargeModal")
    public WebElement closeLargeModalButton;

    public void clickOnSmallModalButton() {
        smallModalButton.click();
    }

    public void clickOnLargeModalButton() {
        largeModalButton.click();
    }

    public void clickOnCloseSmallModalButton() {
        closeSmallModalButton.click();
    }

    public void clickOnCloseLargeModalButton() {
        closeLargeModalButton.click();
    }
}

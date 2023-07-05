package Pages.BookStorePages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProfilePage extends BaseTest {

    public ProfilePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/div[3]/button")
    public WebElement logOutButton;

    @FindBy(css = ".text-right.button.di")
    public WebElement deleteAllBooksButton;

    @FindBy(id = "delete-record-undefined")
    public WebElement trashCanIcon;

    @FindBy(id = "closeSmallModal-ok")
    public WebElement confirmDeleteAllBooksButton;

    @FindBy(id = "userName-value")
    public WebElement usernameText;

    @FindBy(className = "rt-tr-group")
    public WebElement bookRow;

    @FindBy(className = "rt-tr-group")
    public List<WebElement> allBooksInCollection;

    @FindBy(id = "see-book-Git Pocket Guide")
    public WebElement bookGitInCollection;

    @FindBy(id = "see-book-Learning JavaScript Design Patterns")
    public WebElement bookLearningJSInCollection;

    @FindBy(id = "see-book-Speaking JavaScript")
    public WebElement bookSpeakingJSInCollection;




    public void clickOnLogOutButton() {
        logOutButton.click();
    }

    public void deleteAllBooks() {
        deleteAllBooksButton.click();
    }

    public void confirmDeleteAllBooks() {
        confirmDeleteAllBooksButton.click();
    }
}

package Pages.BookStorePages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BooksPage extends BaseTest {

    public BooksPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "mr-2")
    public List<WebElement> allBooksTitles;

    @FindBy(id = "see-book-Git Pocket Guide")
    public WebElement bookGit;

    @FindBy(id = "see-book-Learning JavaScript Design Patterns")
    public WebElement bookLearningJS;

    @FindBy(id = "see-book-Speaking JavaScript")
    public WebElement bookSpeakingJS;

}

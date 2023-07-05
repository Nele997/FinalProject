package Pages.ElementsPages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LinksPage extends BaseTest {
    public LinksPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "simpleLink")
    public WebElement homeLink;

    @FindBy(id = "dynamicLink")
    public WebElement homePlusLink;

    @FindBy(css = ".col-12.mt-4.col-md-6")
    public List<WebElement> links;

    public void clickOnHomeLink(){
        homeLink.click();
    }

    public void clickOnHomePlusLink(){
        homePlusLink.click();
    }


}

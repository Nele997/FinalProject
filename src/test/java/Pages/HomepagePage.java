package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomepagePage extends BaseTest {

    public HomepagePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (css = ".card.mt-4.top-card")
    public List<WebElement> categoryCards;

    public void clickOnCard(String cardName) {
        for (WebElement card : categoryCards) {
            if(card.getText().equals(cardName)) {
                card.click();
                break;
            }
        }
    }
}

package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SidebarPage extends BaseTest {

    public SidebarPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "text")
    public List<WebElement> sidebarButtons;


    public void clickOnSidebarButton(String buttonName) {
        for (WebElement card : sidebarButtons) {
            if(card.getText().equals(buttonName)) {
                card.click();
                break;
            }
        }
    }
}

package Pages.InteractionsPages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SelectablePage extends BaseTest {

    public SelectablePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "verticalListContainer")
    public WebElement listContainer;

    @FindBy(id = "gridContainer")
    public WebElement gridContainer;

    @FindBy(id = "demo-tab-list")
    public WebElement listTab;

    @FindBy(id = "demo-tab-grid")
    public WebElement gridTab;

    @FindBy(css = ".mt-2.list-group-item.list-group-item-action")
    public List<WebElement> listGroupItems;

    @FindBy(xpath = "//*[starts-with(@class, 'list-group-item')]")
    public List<WebElement> gridGroupItems;


    public void clickOnListTab() {
        listTab.click();
    }

    public void clickOnGridTab() {
        gridTab.click();
    }

    public WebElement selectListItem(String itemText) {
        for (WebElement item : listGroupItems) {
            if (item.getText().equals(itemText)) {
                item.click();
                return item;
            }
        }
        return null;
    }

    public WebElement selectGridItem(String itemText) {
        for (WebElement item : gridGroupItems) {
            if (item.getText().equals(itemText)) {
                item.click();
                return item;
            }
        }
        return null;
    }

}

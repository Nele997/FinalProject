package Tests.InteractionsTests;

import Base.BaseTest;
import Pages.InteractionsPages.SelectablePage;
import Pages.HomepagePage;
import Pages.SidebarPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectableTest extends BaseTest {

    public String activeColor = "rgba(0, 123, 255, 1)";
    public HomepagePage homepagePage;
    public SidebarPage sidebarPage;
    public SelectablePage selectablePage;

    @BeforeMethod
    public void pageSetUp() {
        homepagePage = new HomepagePage();
        sidebarPage = new SidebarPage();
        selectablePage = new SelectablePage();

        driver.manage().window().maximize();
        driver.get(homeURL);
    }

    @Test (priority = 10)
    public void userCanSelectMultipleItemsInListView() {
        homepagePage.clickOnCard("Interactions");
        scrollBy();
        sidebarPage.clickOnSidebarButton("Selectable");

        for (WebElement item : selectablePage.listGroupItems) {
            WebElement selectedItem = selectablePage.selectListItem(item.getText());

            Assert.assertTrue(selectedItem.getAttribute("class").contains("active"));
            Assert.assertEquals(selectedItem.getCssValue("background-color"), activeColor);
        }
    }

    @Test(priority = 20)
    public void userCanSelectMultipleItemsInGridView() {
        homepagePage.clickOnCard("Interactions");
        scrollBy();
        sidebarPage.clickOnSidebarButton("Selectable");
        selectablePage.clickOnGridTab();

        for (WebElement item : selectablePage.gridGroupItems) {

            WebElement selectedItem = selectablePage.selectGridItem(item.getText());

            Assert.assertTrue(selectedItem.getAttribute("class").contains("active"));
            Assert.assertEquals(selectedItem.getCssValue("background-color"), activeColor);
        }
    }
}

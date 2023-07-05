package Tests.ElementsTests;

import Base.BaseTest;
import Pages.ElementsPages.ButtonsPage;
import Pages.ElementsPages.RadioButtonPage;
import Pages.HomepagePage;
import Pages.SidebarPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonsTest extends BaseTest {

    String expectedMessage;
    public HomepagePage homepagePage;
    public ButtonsPage buttonsPage;
    public RadioButtonPage radioButtonPage;
    public SidebarPage sidebarPage;
    @BeforeMethod
    public void pageSetUp() {
        homepagePage = new HomepagePage();
        buttonsPage = new ButtonsPage();
        radioButtonPage = new RadioButtonPage();
        sidebarPage = new SidebarPage();
        driver.manage().window().maximize();
        driver.get(homeURL);
    }

    @Test (priority = 10)
    public void doubleClickButtonTest() throws InterruptedException {
        homepagePage.clickOnCard("Elements");
        scrollBy();
        sidebarPage.clickOnSidebarButton("Buttons");
        buttonsPage.setMargin(buttonsPage.doubleClickButton);
        Thread.sleep(2000);
        buttonsPage.doubleClick();

        expectedMessage = "You have done a double click";
        Assert.assertEquals(buttonsPage.doubleClickMessage.getText(), expectedMessage);
    }

    @Test (priority = 20)
    public void rightClickButtonTest() {
        homepagePage.clickOnCard("Elements");
        sidebarPage.clickOnSidebarButton("Buttons");
        buttonsPage.rightClick();

        expectedMessage = "You have done a right click";
        Assert.assertEquals(buttonsPage.rightClickMessage.getText(), expectedMessage);
    }

    @Test (priority = 30)
    public void clickMeButtonTest() {
        homepagePage.clickOnCard("Elements");
        scrollBy();
        sidebarPage.clickOnSidebarButton("Buttons");
        buttonsPage.clickMe();

        expectedMessage = "You have done a dynamic click";
        Assert.assertEquals(buttonsPage.clickMeMessage.getText(), expectedMessage);
    }

    @Test (priority = 40)
    public void clickOnYesRadioButton() {
        homepagePage.clickOnCard("Elements");
        scrollBy();
        sidebarPage.clickOnSidebarButton("Radio Button");
        radioButtonPage.clickRadioButton(radioButtonPage.yesRadioButton);

        expectedMessage = "You have selected Yes";
        Assert.assertEquals(radioButtonPage.yesMessage.getText(), expectedMessage);
    }

    @Test (priority = 50)
    public void clickOnImpressiveRadioButton() {
        homepagePage.clickOnCard("Elements");
        scrollBy();
        sidebarPage.clickOnSidebarButton("Radio Button");
        radioButtonPage.clickRadioButton(radioButtonPage.impressiveRadioButton);

        expectedMessage = "You have selected Impressive";
        Assert.assertEquals(radioButtonPage.yesMessage.getText(), expectedMessage);
    }

    @Test (priority = 60)
    public void isNoRadioButtonDisabled() {
        homepagePage.clickOnCard("Elements");
        scrollBy();
        sidebarPage.clickOnSidebarButton("Radio Button");

        Assert.assertFalse(radioButtonPage.noRadioButton.isEnabled());
    }
}

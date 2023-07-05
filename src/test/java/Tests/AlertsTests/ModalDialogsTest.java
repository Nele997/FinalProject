package Tests.AlertsTests;

import Base.BaseTest;
import Pages.AlertsFrameWindowsPages.ModalDialogsPage;
import Pages.HomepagePage;
import Pages.SidebarPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ModalDialogsTest extends BaseTest {

    public HomepagePage homepagePage;
    public SidebarPage sidebarPage;
    public ModalDialogsPage modalDialogsPage;

    @BeforeMethod
    public void pageSetUp() {
        homepagePage = new HomepagePage();
        sidebarPage = new SidebarPage();
        modalDialogsPage = new ModalDialogsPage();
        driver.manage().window().maximize();
        driver.get(homeURL);
    }

    @Test(priority = 10)
    public void userCanOpenSmallModal() {
        homepagePage.clickOnCard("Alerts, Frame & Windows");
        scrollBy();
        sidebarPage.clickOnSidebarButton("Modal Dialogs");
        modalDialogsPage.clickOnSmallModalButton();

        waitForVisibility(modalDialogsPage.smallModal);
        Assert.assertTrue(elementIsPresent(modalDialogsPage.smallModal));
    }

    @Test(priority = 20)
    public void userCanCloseSmallModalByClickOnCloseButton() {
        homepagePage.clickOnCard("Alerts, Frame & Windows");
        scrollBy();
        sidebarPage.clickOnSidebarButton("Modal Dialogs");
        modalDialogsPage.clickOnSmallModalButton();

        waitForClickability(modalDialogsPage.closeSmallModalButton);
        modalDialogsPage.clickOnCloseSmallModalButton();

        waitForInvisibility(modalDialogsPage.smallModal);
        Assert.assertFalse(elementIsPresent(modalDialogsPage.smallModal));
    }

    @Test(priority = 30)
    public void userCanOpenLargeModal() {
        homepagePage.clickOnCard("Alerts, Frame & Windows");
        scrollBy();
        sidebarPage.clickOnSidebarButton("Modal Dialogs");
        modalDialogsPage.clickOnLargeModalButton();

        waitForVisibility(modalDialogsPage.largeModal);
        Assert.assertTrue(elementIsPresent(modalDialogsPage.largeModal));
    }

    @Test(priority = 40)
    public void userCanCloseLargeModalByClickOnCloseButton() {
        homepagePage.clickOnCard("Alerts, Frame & Windows");
        scrollBy();
        sidebarPage.clickOnSidebarButton("Modal Dialogs");
        modalDialogsPage.clickOnLargeModalButton();

        modalDialogsPage.clickOnCloseLargeModalButton();

        waitForInvisibility(modalDialogsPage.largeModal);
        Assert.assertFalse(elementIsPresent(modalDialogsPage.largeModal));
    }
}

package Tests.ElementsTests;

import Base.BaseTest;
import Pages.ElementsPages.LinksPage;
import Pages.HomepagePage;
import Pages.SidebarPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class LinksTest extends BaseTest {
    public HomepagePage homepagePage;
    public SidebarPage sidebarPage;
    public LinksPage linksPage;
    public ArrayList<String> tabs;

    @BeforeMethod
    public void pageSetUp(){
        homepagePage = new HomepagePage();
        sidebarPage = new SidebarPage();
        linksPage = new LinksPage();

        driver.manage().window().maximize();
        driver.get(homeURL);
        homepagePage.clickOnCard("Elements");
        scrollBy();
        sidebarPage.clickOnSidebarButton("Links");
    }

    @Test
    public void clickOnHome(){
        linksPage.clickOnHomeLink();
        tabs = new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(driver.getCurrentUrl(), homeURL);
    }

    @Test
    public void clickOnHomePlus(){
        linksPage.clickOnHomePlusLink();
        tabs = new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(tabs.get(2));
        Assert.assertEquals(driver.getCurrentUrl(), homeURL);
    }


    @AfterMethod
    public void pageTearDown(){
        driver.manage().deleteAllCookies();
    }
}


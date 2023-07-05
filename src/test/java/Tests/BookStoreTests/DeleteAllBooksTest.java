package Tests.BookStoreTests;

import Base.BaseTest;
import Pages.BookStorePages.LoginPage;
import Pages.BookStorePages.ProfilePage;
import Pages.HomepagePage;
import Pages.SidebarPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeleteAllBooksTest extends BaseTest {

    public HomepagePage homepagePage;
    public SidebarPage sidebarPage;
    public ProfilePage profilePage;
    public LoginPage loginPage;

    @BeforeMethod
    public void pageSetUp() {
        homepagePage = new HomepagePage();
        sidebarPage = new SidebarPage();
        profilePage = new ProfilePage();
        loginPage = new LoginPage();
        driver.manage().window().maximize();
        driver.get(homeURL);
    }

    @Test(priority = 10)
    public void userCanDeleteAllBooks() throws InterruptedException {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);

        homepagePage.clickOnCard("Book Store Application");
        scrollBy();
        sidebarPage.clickOnSidebarButton("Login");
        loginPage.insertUsername(validUsername);
        loginPage.insertPassword(validPassword);
        loginPage.clickOnLoginButton();

        waitForClickability(profilePage.deleteAllBooksButton);
        scrollIntoView(profilePage.deleteAllBooksButton);
        profilePage.deleteAllBooks();

        waitForClickability(profilePage.confirmDeleteAllBooksButton);
        profilePage.confirmDeleteAllBooks();

        closeAlert();

        Assert.assertFalse(elementIsPresent(profilePage.trashCanIcon));
    }
}

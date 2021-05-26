package TestCases;

import Basetest.BaseClass;
import Pages.Homepage;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass
{
    LoginPage loginPage;
    @Test
    public void LoginTest()
    {
        loginPage=new LoginPage(driver);
        Homepage homepage =loginPage.loginToSauceApp("standard_user","secret_sauce");
        String text=homepage.getTitleofHeader();
        Assert.assertEquals(text,"PRODUCTS","Text mismatch");
    }
}

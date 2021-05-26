package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
    WebDriver driver;
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(id = "user-name")
    WebElement unm;

    @FindBy(id="password")
    WebElement pass;

    @FindBy(id="login-button")
    WebElement btn;

    public void setUnm(String nm)
    {
        unm.sendKeys(nm);
    }
    public void setPass(String ps)
    {
        pass.sendKeys(ps);
    }
    public void clickOnbtn()
    {
        btn.click();
    }
    public Homepage loginToSauceApp(String unm,String pass)
    {
        setUnm(unm);
        setPass(pass);
        clickOnbtn();
        return new Homepage(driver);
    }


}

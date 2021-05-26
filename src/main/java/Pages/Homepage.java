package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage
{
    WebDriver driver;
    public Homepage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id='header_container']/div[2]/span")
    WebElement title;
    public String getTitleofHeader()
    {
        return title.getText();
    }

}

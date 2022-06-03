package testcreation.webGeminisClub.pages;

import engine.selenium.SeleniumBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GCActivationPage extends SeleniumBase {

    public GCActivationPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //Locators
    By text = By.xpath("//p[1]");
   

    //Keyword driven

    public void validateNewUser(String arg0) {
        waitUrlContains("/activacion");
        Assert.assertEquals(getText(text),arg0);
    }




}

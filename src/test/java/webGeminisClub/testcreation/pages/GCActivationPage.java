package webGeminisClub.testcreation.pages;

import webGeminisClub.bases.SeleniumBase;
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

    public String validateNewUser(String arg0) {
        waitUrlContains("/activacion");
        return getText(text);
    }




}

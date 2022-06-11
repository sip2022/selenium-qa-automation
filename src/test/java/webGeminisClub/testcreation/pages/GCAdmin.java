package webGeminisClub.testcreation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import webGeminisClub.bases.SeleniumBase;

public class GCAdmin extends SeleniumBase {
    public GCAdmin(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
//Locators
    By btnActivities = By.xpath("btnAct //a[@id='continue_button']");

    public void activities(){
        click(btnActivities);
        waitUrlContains("admin/actividades");
    }
}

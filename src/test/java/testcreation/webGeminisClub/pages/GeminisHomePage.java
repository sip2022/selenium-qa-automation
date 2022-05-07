package automationcraft.testcreation.webDafiti.pages;

import automationcraft.engine.database.MongoDBManage;
import org.bson.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import automationcraft.engine.selenium.SeleniumBase;

import java.util.Collection;
import java.util.List;

/***
 * @author luisinakelly
 * @version 1
 */

public class GeminisHomePage extends SeleniumBase {
    public DafitiHomePage(WebDriver driver) {
        super(driver);
    }
    
    //Locators
    By btnLogin = By.className("");

    //Keyword Driven

    /***
     * Ir a login page
     * 
     */

    public void login(){
        waitUrlContains();
    }


   

}

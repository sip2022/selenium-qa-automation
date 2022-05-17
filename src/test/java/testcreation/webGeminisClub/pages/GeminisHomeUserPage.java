package testcreation.webGeminisClub.pages;


import engine.selenium.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import engine.selenium.SeleniumBase;

import java.util.Collection;
import java.util.List;

/***
 * @author luisinakelly
 * @version 1
 */

public class GeminisHomeUserPage extends SeleniumBase {

    //Locators
    By btn = By.className("");

    public GeminisHomeUserPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //Keyword Driven

    /***
     * Ir a login page
     * 
     */

    public void metodo(){
        waitUrlContains("");
    }


   

}

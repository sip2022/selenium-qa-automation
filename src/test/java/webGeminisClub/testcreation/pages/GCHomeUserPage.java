package webGeminisClub.testcreation.pages;


import webGeminisClub.bases.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/***
 * @author luisinakelly
 * @version 1
 */

public class GCHomeUserPage extends SeleniumBase {

    //Locators
    By btn = By.className("");


    public GCHomeUserPage(WebDriver driver, WebDriverWait wait) {
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

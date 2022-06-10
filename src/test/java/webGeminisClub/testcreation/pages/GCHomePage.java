package webGeminisClub.testcreation.pages;

import webGeminisClub.bases.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


/***
 * @author luisinakelly
 * @version 1
 */

public class GCHomePage extends SeleniumBase {

    
    //Locators
    By btnLogin = By.xpath("//a[contains(text(),'Iniciar sesion/Registrarse')]");
    By btnActivities = By.xpath("//a[contains(text(),'Actividades')]");
    By btnPlans = By.xpath("//a[contains(text(),'Planes')]");
    public GCHomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //Keyword Driven

    /***
     * Ir a login page
     * 
     */
    public void login(){
        click(btnLogin);
        waitUrlContains("/login");
    }


    public void goToActivities() {
        click(btnActivities);
        waitUrlContains("actividades");
    }

    public void goToPlan() {
        click(btnPlans);
        waitUrlContains("planes");
    }
}

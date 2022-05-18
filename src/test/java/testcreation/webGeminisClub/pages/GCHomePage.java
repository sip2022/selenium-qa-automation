package testcreation.webGeminisClub.pages;

//import org.bson.Document;
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

public class GCHomePage extends SeleniumBase {

    
    //Locators
    By btnLogin = By.xpath("//a[contains(text(),'Iniciar sesion/Registrarse')]");

    public GCHomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //Keyword Driven

    /***
     * Ir a login page
     * 
     */
    public void login(){
        WebElement loginButton = findElement(btnLogin);
        click(loginButton);
        waitUrlContains("/login");
    }


   

}

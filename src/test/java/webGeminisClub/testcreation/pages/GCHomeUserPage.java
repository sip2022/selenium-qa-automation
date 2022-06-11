package webGeminisClub.testcreation.pages;


import org.openqa.selenium.WebElement;
import webGeminisClub.bases.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/***
 * @author luisinakelly
 * @version 1
 */

public class GCHomeUserPage extends SeleniumBase {

    //Locators
    By cards = By.xpath("//section[@class='InicioUser_itemCard__sBcp2']");
    By cardName = By.tagName("h3");

    public GCHomeUserPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //Keyword Driven


    public void goToPayment() {

        List<WebElement> buttons = findElements(cards);
        for (WebElement btn:buttons) {
            if (btn.findElement(cardName).getText().equals("Mis Pagos")){
                btn.click();
                break;
            }
        }
        waitUrlContains("user/pagos");
    }

    public void goToMenuAdmin() {

        List<WebElement> buttons = findElements(cards);
        for (WebElement btn:buttons) {
            if (btn.findElement(cardName).getText().equals("Menú de Administrador")){
                btn.click();
                break;
            }
        }
        waitUrlContains("admin");
    }

}

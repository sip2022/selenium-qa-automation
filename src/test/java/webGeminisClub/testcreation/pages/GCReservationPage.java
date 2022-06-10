package webGeminisClub.testcreation.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import webGeminisClub.bases.SeleniumBase;

import java.util.List;

public class GCReservationPage extends SeleniumBase {

    public GCReservationPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

//Locators
    By textReservation = By.tagName("p");
    //Keyword driven
    public void searchReservation(String arg0) {
        String info="";
        List<WebElement> allReservation = findElements(textReservation);
        for (WebElement reservation:allReservation) {
            if(reservation.getText().equals(arg0)){
                  info = reservation.getText();
                  break;
            }
        }
        Assert.assertEquals(info,arg0);
    }
}

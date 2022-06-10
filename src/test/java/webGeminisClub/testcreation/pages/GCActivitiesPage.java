package webGeminisClub.testcreation.pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import webGeminisClub.bases.SeleniumBase;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class GCActivitiesPage extends SeleniumBase {
    public GCActivitiesPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    private static String activityName;

    //Locators
    By activitiesLoc = By.xpath("//section[@class='ActividadCard_actividad__jeI3L']");
    By actName = By.tagName("p");
    By actSeeMore = By.tagName("button");
    By activitySection = By.id("actividad_section");
    By titleActivity = By.tagName("h1");
    By allTimeslots = By.xpath("//input[@name='horario']");
    By modalActivity = By.xpath("//section[@class='Actividad_reserva_Display__JUqSd']");
    By btnReservation = By.xpath("//button[contains(text(),'Reservar')]");
    //Keyword driven

    public void selectActivity(String string) {
        activityName = string;
        List<WebElement> activities = findElements(activitiesLoc);
        for (WebElement act : activities) {
            WebElement activity = act.findElement(actName);
            if (activity.getText().equals(string)){
                act.findElement(actSeeMore).click();
                break;
            }
        }
        waitElementVisible(activitySection);
        WebElement aName = findElement(titleActivity);
        Assert.assertEquals(aName.getText(),string);
    }

    public void reservation(String string) {
        List<WebElement> timeslots = findElements(allTimeslots);
        for (WebElement timeslot: timeslots) {
            if (timeslot.getText().equals(string)){
                timeslot.click();
                Assert.assertTrue(timeslot.isSelected());
                click(btnReservation);
                break;
            }
        }

    }

    public void validateFrameReservation() {
        waitElementVisible(modalActivity);
        WebElement title = findElement(modalActivity).findElement(By.tagName("h2"));
        Assert.assertEquals(title.getText(),activityName);
    }

    public void confirmReservation() {
        WebElement reservation = findElement(modalActivity).findElement(btnReservation);
        reservation.click();
        
    }

    public void validateReservation() {
        Alert alertReservation = waitAlertDisplayed();
        String alertText = alertReservation.getText();
        Assert.assertTrue(alertText.contains("Reserva exitosa"));
        alertReservation.accept();
        waitUrlContains("reservas");
    }

}

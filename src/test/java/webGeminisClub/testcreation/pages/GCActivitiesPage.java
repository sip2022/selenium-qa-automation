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

    private String activityName;

    //Locators
    By activitiesLoc = By.xpath("//section[@class='ActividadCard_actividad__jeI3L']");
    By actName = By.tagName("p");
    By actSeeMore = By.tagName("button");
    By activitySection = By.id("actividad_section");
    By titleActivity = By.tagName("h1");
    By allTimeslots = By.xpath("Actividad_horario_radio__vcDZL");
    By timeslot = By.xpath("//input[@id='horario_0']");
    By modalActivity = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/section[1]/section[5]/section[1]/section[1]/h2[1]");
    By btnReservation = By.xpath("//section/button[contains(text(),'Reservar')]");
    By btnReservationActivity = By.xpath("//section[@class='Actividad_reserva_Display__JUqSd']/section[1]/section[3]/button");
    By modalConfirm = By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/section[1]/section[5]/section[1]/section[2]/section[1]");
    By modalConfirmText = By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/section[1]/section[5]/section[1]/section[2]/section[1]/section[1]/h2[1]");
    By closeBtn = By.xpath("//body/div[@id='root']/div[1]/div[1]/main[1]/section[1]/section[5]/section[1]/section[2]/section[1]/section[2]/button[1]");
    //Keyword driven

    public void selectActivity(String string) {
        activityName = string;
        List<WebElement> activities = findElements(activitiesLoc);
        for (WebElement act : activities) {
            WebElement activity = act.findElement(actName);
            if (activity.getText().equals(string)){
                act.click();
                break;
            }
        }
        waitElementVisible(activitySection);
        WebElement aName = findElement(titleActivity);
        Assert.assertEquals(aName.getText(),string);
    }

    public void reservation(String string) {
        click(timeslot);
        Assert.assertTrue(isSelected(timeslot));
        click(btnReservation);
        /*List<WebElement> timeslots = findElements(allTimeslots);
        timeslots.get(0).click();
        for (WebElement timeslot: timeslots) {
           WebElement text = (WebElement) timeslot.findElements(By.tagName("label"));
            if (text.getText().equals(string)){
                timeslot.click();
                Assert.assertTrue(timeslot.isSelected());
                click(btnReservation);
                break;
            }
        }*/
    }

    public void validateFrameReservation() {
       waitElementVisible(modalActivity);
        Assert.assertEquals(getText(modalActivity),activityName);
    }

    public void confirmReservation() {
        List<WebElement>btnsReservation = findElements(btnReservation);
        btnsReservation.get(1).click();
    }

    public void validateReservation() {
        waitElementVisible(modalConfirm);
        System.out.println(getText(modalConfirmText));
        //Assert.assertTrue(getAttributeValue(modalConfirmText).contains("Reserva exitosa"));
        click(closeBtn);

    }

}

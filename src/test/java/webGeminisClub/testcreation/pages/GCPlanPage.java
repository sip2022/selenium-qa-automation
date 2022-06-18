package webGeminisClub.testcreation.pages;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import webGeminisClub.bases.SeleniumBase;

import java.util.List;

public class GCPlanPage extends SeleniumBase {

    public GCPlanPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    //Locators
    By planBronze = By.xpath("//section[@id='5b09d5f8-b8c0-4b19-b88c-6781d17ad8ea']");
    By planSilver = By.xpath("//section[@id='5171ac22-5afc-49d0-9a53-72533920df82']");
    By planGold = By.xpath("//section[@id='9a098968-f073-4052-950e-2af5c75d2d74']");
    By planPlatinum = By.xpath("//section[@id='caab40c3-d031-4d50-bd27-a3c5734adaae']");
    By namePlan = By.xpath("//section/h2");
    By inputMonths = By.xpath("//input[@id='input-meses']");
    By suscribeBtn = By.xpath("//button[contains(text(),'Suscribirse')]");
    By confirmModal = By.xpath("//section[@class='PagoPlan_confirmacion_Display__9u9Gp']");
    By confirmBtn = By.xpath("//section/button[contains(text(),'Suscribirse')]");


    //Keyword driven
    public void selectPlan(String arg0) {
        switch (arg0){
            case "Bronze": click(planBronze);
            break;
            case "Silver": click(planSilver);
                break;
            case "Gold": click(planGold);
                break;
            case "Platinum": click(planPlatinum);
                break;
        }
    }

    public void subscribe() {
        click(suscribeBtn);
        waitElementVisible(confirmModal);
    }

    public void confirmSubscription() {
        WebElement confirmFrame = findElement(confirmModal);
        Assert.assertEquals(confirmFrame.findElement(By.tagName("h2")),"Confirmación de suscripción");
        WebElement confirmButton = confirmFrame.findElement(confirmBtn);
        confirmButton.click();
    }

    public void validateSuscriptionOk() {
        Alert alertSubscription = waitAlertDisplayed();
        String alertMessage = alertSubscription.getText();
        Assert.assertTrue(alertMessage.contains("Se ha completado la suscripción"));
    }


    public void setMonthsSubscription(String months) {
        ///waitElementVisible(inputMonths);
        setText(inputMonths,months);
        WebElement monthsInput = findElement(inputMonths);
        Assert.assertEquals(monthsInput.getAttribute("value"),months);
    }
}

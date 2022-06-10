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
    By plansBtn = By.xpath("//section[@class='PlanList_singlePlan__EuTIt']"); //btn text section/h2
    By namePlan = By.xpath("//section/h2");
    By inputMonths = By.id("input-meses");
    By suscribeBtn = By.xpath("//button[contains(text(),'Suscribirse')]");
    By confirmModal = By.xpath("//section[@class='PagoPlan_confirmacion_Display__9u9Gp']");
    By confirmBtn = By.xpath("//section/button[contains(text(),'Suscribirse')]");


    //Keyword driven
    public void selectPlan(String arg0) {
        List<WebElement> plans = findElements(plansBtn);
        for (WebElement plan:plans) {
            WebElement planName = plan.findElement(namePlan);
            if (planName.getText().equals(arg0)){
                plan.click();
                break;
            }
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
        setText(inputMonths,months);
        WebElement monthsInput = findElement(inputMonths);
        Assert.assertEquals(monthsInput.getAttribute("value"),months);
    }
}

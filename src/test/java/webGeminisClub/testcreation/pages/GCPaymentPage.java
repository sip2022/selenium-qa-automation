package webGeminisClub.testcreation.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import webGeminisClub.bases.SeleniumBase;

public class GCPaymentPage extends SeleniumBase {
    public GCPaymentPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //Locators
    By notPaid = By.xpath("//p[contains(text(),'¡No has pagado tu suscripción!')]");
    By monthsLoc = By.xpath("//p[contains(text(),'Meses')]");
    By planLoc = By.xpath("//p[contains(text(),'Plan')]");
    By priceMonth = By.xpath("//p[contains(text(),'Monto por mes:')]");
    By totalPrice = By.xpath("//p[contains(text(),'Monto Total')]");


    //Keyword driven
    public void validatePaymentList(int months,String plan, int price ) {
        Assert.assertTrue(isDisplayed(notPaid));
        Assert.assertTrue(getAttributeValue(planLoc).contains(plan));
        Assert.assertTrue(getAttributeValue(monthsLoc).contains(String.valueOf(months)));
        Assert.assertTrue(getAttributeValue(priceMonth).contains(String.valueOf(price)));
        Assert.assertTrue(getAttributeValue(totalPrice).contains(String.valueOf((price*months))));
    }
}


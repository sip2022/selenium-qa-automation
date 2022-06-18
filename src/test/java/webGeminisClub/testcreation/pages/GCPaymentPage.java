package webGeminisClub.testcreation.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import webGeminisClub.bases.SeleniumBase;

import java.util.List;

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
    By allSubscriptions =By.xpath("//section[@class='User_Pagos_sub_debt_card__lIi2o']");
    By linkPayment = By.xpath("//a[@id='link_pago']");


    //Keyword driven
    public void validatePaymentList(int months,String plan, int price ) {
        List<WebElement> subscriptions = findElements(allSubscriptions);
        for (WebElement subscription: subscriptions) {
            int total = price*months;
            if (subscription.findElement(planLoc).getAttribute("value").contains(plan) && subscription.findElement(totalPrice).getAttribute("value").contains(String.valueOf(total))){
                Assert.assertTrue(isDisplayed(notPaid));
                Assert.assertTrue(getAttributeValue(planLoc).contains(plan));
                Assert.assertTrue(getAttributeValue(monthsLoc).contains(String.valueOf(months)));
                Assert.assertTrue(getAttributeValue(priceMonth).contains(String.valueOf(price)));
                Assert.assertTrue(getAttributeValue(totalPrice).contains(String.valueOf((price*months))));
                break;
            }
        }
    }

    public void gotoMercadoPago(String plan, String price) {
        List<WebElement> subscriptions = findElements(allSubscriptions);
        for (WebElement subscription: subscriptions) {

                click(linkPayment);
                waitUrlContains("mercadopago");
                break;
  //          }
        }
    }

    public void validatePaymentHistory() {

    }
}


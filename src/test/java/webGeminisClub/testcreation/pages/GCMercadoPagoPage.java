package webGeminisClub.testcreation.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import webGeminisClub.bases.SeleniumBase;

import java.util.List;

public class GCMercadoPagoPage extends SeleniumBase {
    By card = By.xpath("//label[@for=\"new_card_row\"]");
    By dataTitle = By.xpath("//span[contains(text(),'Completá los datos de tu tarjeta')]");
    By cardNumber = By.xpath("//input[@id='card_number']\n");
    By eDate = By.xpath("//input[@id='input_expiration_date']");
    By name = By.xpath("//input[@id='fullname']");
    By cvv = By.xpath("//input[@id='cvv']");
    By submitBtn = By.xpath("//button[@id='submit']");
    By dniTitle = By.xpath("//span[contains(text(),'Ahora ingresá el documento del titular')]");
    By dni = By.xpath("//input[@id='number']");
    By installmentsTitle = By.xpath("//span[contains(text(),'Elegí las cuotas que quieras')]");
    By installments = By.xpath("//label[@class='options-list__label']");
    By installmentsNumber = By.xpath("//p[contains(text(),'1x')]");
    By payBtn = By.xpath("//button[@id='pay']");
    By titleOk = By.xpath("//span[contains(text(),'¡Listo! Se acreditó tu pago')]");
    By goToGC = By.xpath("//a[@id='continue_button']");
    By titleConfirm = By.xpath("//span[contains(text(),'Revisá tu compra')]");

    public GCMercadoPagoPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void pay() {
        click(payBtn);
        waitElementVisible(titleOk);
        Assert.assertEquals("",findElement(titleOk).getText());
    }

    public void selectPayByCard() {
        click(card);
        waitElementVisible(dataTitle);
    }

    public void setcardNumber(String arg0) {
        setText(cardNumber,arg0);
        Assert.assertTrue(getAttributeValue(cardNumber).contains(arg0));
    }

    public void setCustomerName(String arg0) {
        setText(name,arg0);
        Assert.assertTrue(getAttributeValue(name).contains(arg0));
    }

    public void setCvv(String arg0) {
        setText(cvv,arg0);
        Assert.assertTrue(getAttributeValue(cvv).contains(arg0));
    }

    public void clickContinue(String nextPage) {
        click(submitBtn);
        switch (nextPage){
            case "nextDni": waitElementVisible(dniTitle);
                break;
            case "nextInstallments": waitElementVisible(installmentsTitle);
                break;
        }
    }

    public void setDni(String arg0) {
        setText(dni,arg0);
        Assert.assertTrue(getAttributeValue(dni).contains(arg0));
    }

    public void selectNumberOfPayments(String arg0) {
        List<WebElement> installmentsList =findElements(installments);
        for (WebElement numberOfPayment: installmentsList) {
            if (numberOfPayment.findElement(installmentsNumber).getAttribute("value").contains(arg0)){
                numberOfPayment.click();
                break;

            }
        }
        waitElementVisible(titleConfirm);
    }

    public void goToGCPage() {
        click(goToGC);
        waitUrlContains("sip");
    }

    public void setExpirationDateCard(String arg0) {
        setText(eDate,arg0);
    }
}

package webDafiti.bases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SeleniumBase {

    //atributos
    WebDriver driver;
    WebDriverWait wait;

    //Constructor
    public SeleniumBase(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    //Metodos envolver la tecnologia Selenium -> Wrapper
    public WebElement findElement(By localizador){
        return driver.findElement(localizador);
    }

    public List<WebElement> findElements(By localizador){
        return driver.findElements(localizador);
    }

    public String getText(By localizador){
        return findElement(localizador).getText();
    }

    public String getAttributeValue(By localizador){
        return findElement(localizador).getAttribute("value");
    }


    public void click(By locator){
        driver.findElement(locator).click();
    }

    public Boolean isDisplayed(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public void goToUrl(String url){
        driver.get(url);
    }

    public void setText(By localizador, String s){
        driver.findElement(localizador).sendKeys(s);
    }
    public void setKeyEnter(By localizador){
        driver.findElement(localizador).sendKeys(Keys.ENTER);
    }
   // public void waitUrlContains(String s){ wait.until(ExpectedConditions.urlContains(s));}
    public String getUrl(){
       return driver.getCurrentUrl();
    }


    public void waitUrlContains(String s) {
        wait.until(ExpectedConditions.urlContains(s));
    }

    public void waitForElementAndClick(By localizador){
        wait.until(ExpectedConditions.elementToBeClickable(localizador)).click();
    }
    public void waitElementClickable(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));

    }
    public void waitElementVisible(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }
    public void moveToElement(WebElement we){
        Actions action = new Actions(driver);
        action.moveToElement(we).build().perform();
    }
    public void clickAndHold(WebElement we){
        Actions action = new Actions(driver);
        action.clickAndHold(we).build().perform();
    }

}

package webGeminisClub.testcreation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import webGeminisClub.bases.SeleniumBase;

public class GCAdminActivitiesPage extends SeleniumBase {
    public GCAdminActivitiesPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    //Locators
    By addActivity = By.xpath("//button[contains(text(),'Agregar Actividad')]");
    By name = By.xpath("//input[@id='input-name']");
    By professor = By.xpath("//select[@id='input-profesor']");
    By atendeesLimit = By.xpath("//input[@id='input-asistencia']");
    By price = By.xpath("//input[@id='input-precio']");
    By createActivity = By.xpath("//button[contains(text(),'Crear Actviidad')]");

    public void add() {
        click(addActivity);
        waitElementVisible(name);
    }

    public void setName(String arg0) {
        setText(name,arg0);
    }

    public void setProfessor(String arg0) {
        selectByValue(professor,arg0);
    }

    public void atendeesLimit(String arg0) {
        setText(atendeesLimit,arg0);
    }

    public void setPrice(String arg0) {
        setText(price,arg0);
    }


    public void createActivity() {
        click(createActivity);
        // agregar assert o wait
    }
}

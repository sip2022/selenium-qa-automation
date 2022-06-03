package testcreation.webGeminisClub.pages;

import engine.selenium.SeleniumBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GCSignUpPage extends SeleniumBase {

    public GCSignUpPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //Locators
    By inputName = By.name("firstName");
    By inputLastName = By.name("lastName");
    By inputDni = By.name("dni");
    By inputBirthDate = By.name("birthDate");
    By inputPhone = By.name("phone");
    By inputMail = By.name("email");
    By inputPassword = By.name("password");
    By btnSignUp = By.id("crear-Usuario");

    //Keyword driven
    public void signUp() {
        click(btnSignUp);
        //wait
        //assert
    }

    public void setData(String arg0, String data) {
        switch (data){
            case "name": setText(inputName,arg0);
                Assert.assertEquals(getText(inputName),arg0);
                break;
            case "lastName":setText(inputLastName,arg0);
                Assert.assertEquals(getText(inputLastName),arg0);
                break;
            case "dni":setText(inputDni,arg0);
                Assert.assertEquals(getText(inputDni),arg0);
                break;
            case "birthDate":setText(inputBirthDate,arg0);
                Assert.assertEquals(getText(inputBirthDate),arg0);
                break;
            case "phone":setText(inputPhone,arg0);
                Assert.assertEquals(getText(inputPhone),arg0);
                break;
            case "email":setText(inputMail,arg0);
                Assert.assertEquals(getText(inputMail),arg0);
                break;
            case "password":setText(inputPassword,arg0);
                Assert.assertEquals(getText(inputPassword),arg0);
                break;
        }

    }
   



}

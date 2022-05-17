package testcreation.webGeminisClub.pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import engine.selenium.SeleniumBase;

import java.util.Collection;
import java.util.List;

/***
 * @author luisinakelly
 * @version 1
 */

public class GeminisLoginPage extends SeleniumBase {

    //Locators
    By email = By.name("email");
    By password = By.name("password");
    By signInBtn = By.id("ingresar-Usuario");
    By newAccountBtn = By.id("crear-Usuario");
	By resetPasswordBtn = By.id("olvContraLogin");

    public GeminisLoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //Keyword Driven

    /***
     * ingresar mail de usuario
     * @param userEmail
     */
    public void setMail(String userEmail) {
        WebElement emailText = findElement(email);
        setText(email, userEmail);
        Assert.assertEquals(userEmail,emailText.getText());
    }

    /***
     * ingresar contraseña del usuario
     * @param userPassword
     */
    public void setPassword(String userPassword) {
        WebElement passwordText = findElement(password);
        setText(password,userPassword);
        Assert.assertEquals(userPassword,passwordText.getText());
    }

    /***
     * iniciar sesión
     * 
     */
    public void signIn(){
	    WebElement btnSignUp = findElement(newAccountBtn);
    	click(btnSignUp);
    	// agregar wait
    }

    /***
     * Registrar nuevo usuario
     * 
     */
    public void signUp(){
    	WebElement btnSignUp = findElement(newAccountBtn);
    	click(btnSignUp);
    	waitUrlContains("/newUser");
    }

	/***
     * Reestablecer contraseña
     * 
     */
    public void resetPassword(){
        click(resetPasswordBtn);
     	// agregar wait   
    }


    public void validateUserHome(String user) {
        switch (user){
            case "customer": // completar validacion assert
                break;
            case "teacher": // completar validacion assert
                break;
            case "analyst": // completar validacion assert
                break;
            case "admin": // completar validacion assert
                break;
        }
    }
}

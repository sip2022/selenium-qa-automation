package testcreation.webGeminisClub.steps;

import engine.bdd.AppHook;
import io.cucumber.java.en.And;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import testcreation.webGeminisClub.pages.GeminisHomePage;
import testcreation.webGeminisClub.pages.GeminisLoginPage;
import testcreation.webGeminisClub.pages.GeminisResetPasswordPage;

public class GeminisClubSteps {
    String url = "http://34.130.26.22";
    WebDriver driver = AppHook.getDriver();
    WebDriverWait wait = AppHook.getWait();
    GeminisHomePage homePage;
    GeminisLoginPage loginPage;
    GeminisResetPasswordPage resetPasswordPage;
    @Given("estoy en un navegador con la pagina inicial de Geminis Club")
    public void estoyEnUnNavegadorConLaPaginaInicialDeGeminisClub() {
        homePage = new GeminisHomePage(driver,wait);
        homePage.goToUrl(url);
    }

    @When("selecciono iniciar sesion/registrarse")
    public void seleccionoIniciarSesion() {
        loginPage = new GeminisLoginPage(driver, wait);
        homePage.login();

    }

    @When("ingreso mi mail de usuario {string}")
    public void ingresoMiMailDeUsuario(String arg0) {
        loginPage.setMail(arg0);
    }

    @When("ingreso contraseña {string}")
    public void ingresoContraseña(String arg0) {
        loginPage.setPassword(arg0);
    }
    @When("presiono ingresar")
    public void presionoIngresar() {
    }
    @Then("el navegador muestra la pagina de inicio de {string}")
    public void elNavegadorMuestraLaPaginaDeInicioDe(String arg0) {
        loginPage.signIn();
        switch (arg0) {
            case "cliente": loginPage.validateUserHome("customer");
                break;
            case "profesor": loginPage.validateUserHome("teacher");
                break;
            case "analista": loginPage.validateUserHome("analyst");
                break;
            case "administracion": loginPage.validateUserHome("admin");
                break;
        }
    }

    @When("presiono olvide contraseña")
    public void presionoOlvideContraseña() {
        loginPage.resetPassword();
        resetPasswordPage = new GeminisResetPasswordPage(driver,wait);
    }

    @When("ingreso mi mail de usuario {string} en olvide contrasena")
    public void ingresoMiMailDeUsuarioEnOlvideContrasena(String arg0) {
    }

    @When("ingreso nueva contrasena {string}")
    public void ingresoNuevaContrasena(String arg0) {
    }

    @When("ingreso nuevamente la nueva contrasena {string}")
    public void ingresoNuevamenteLaNuevaContrasena(String arg0) {
    }

    @When("presiono guardar contraseña")
    public void presionoGuardarContraseña() {
    }

    @Then("el navegador muestra el login con el mensaje {string}")
    public void elNavegadorMuestraElLoginConElMensaje(String arg0) {
    }

    @When("selecciono iniciar sesion\\/registrarse")
    public void seleccionoIniciarSesionRegistrarse() {
    }

    @When("presiono crear cuenta")
    public void presionoCrearCuenta() {
        loginPage.signUp();
    }

    @When("ingreso nombre {string}")
    public void ingresoNombre(String arg0) {
    }

    @When("ingreso apellido {string}")
    public void ingresoApellido(String arg0) {
    }

    @When("ingreso dni {int}")
    public void ingresoDni(int arg0) {
    }

    @When("ingreso edad {int}")
    public void ingresoEdad(int arg0) {
    }

    @When("ingreso telefono {string}")
    public void ingresoTelefono(String arg0) {
    }

    @When("ingreso email {string}")
    public void ingresoEmail(String arg0) {
    }

    @When("ingreso contrasena {string} del nuevo usuario")
    public void ingresoContrasenaDelNuevoUsuario(String arg0) {
    }

    @When("presiono registrarse")
    public void presionoRegistrarse() {
    }
}

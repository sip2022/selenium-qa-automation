package webGeminisClub.testcreation.steps;

import webGeminisClub.bases.AppHook;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import webGeminisClub.testcreation.pages.*;
public class GeminisClubSteps {
    String url = "http://front.unlusip.com/";
    String urlSignUp = "http://front.unlusip.com/registro";
    WebDriver driver = AppHook.getDriver();
    WebDriverWait wait = AppHook.getWait();
    GCHomePage homePage;
    GCLoginPage loginPage;
    GCResetPasswordPage resetPasswordPage;
    GCSignUpPage signUpPage;
    GCActivationPage activationPage;

    //GCActivitiesPage activitiesPage;

    
    @Given("estoy en un navegador con la pagina inicial de Geminis Club")
    public void estoyEnUnNavegadorConLaPaginaInicialDeGeminisClub() {
        homePage = new GCHomePage(driver,wait);
        homePage.goToUrl(url);
        throw new io.cucumber.java.PendingException();
    }

     @Given("estoy en un navegador con la pagina de registro de Geminis Club")
    public void estoyEnUnNavegadorConLaPaginaDeRegistroDeGeminisClub() {
        signUpPage = new GCSignUpPage(driver,wait);
        signUpPage.goToUrl(urlSignUp);

    }

    @When("selecciono iniciar sesion/registrarse")
    public void seleccionoIniciarSesion() {
        loginPage = new GCLoginPage(driver, wait);
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
        resetPasswordPage = new GCResetPasswordPage(driver,wait);
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

    @Then("el navegador muestra el mensaje {string}")
    public void elNavegadorMuestraElMensaje(String arg0) throws InterruptedException {
    	activationPage = new GCActivationPage(driver,wait);
    	activationPage.validateNewUser(arg0);
        Thread.sleep(5000);
    }

    @When("selecciono iniciar sesion\\/registrarse")
    public void seleccionoIniciarSesionRegistrarse() {
    }

    @When("presiono crear cuenta")
    public void presionoCrearCuenta() {
        loginPage.signUp();
    }

    @When("ingreso nombre {string}")
    public void ingresoNombre(String arg0) throws InterruptedException{
        signUpPage.setData(arg0,"name");
        Thread.sleep(3000);
    }

    @When("ingreso apellido {string}")
    public void ingresoApellido(String arg0) throws InterruptedException{
        signUpPage.setData(arg0,"lastName");
        Thread.sleep(3000);

    }

    @When("ingreso dni {string}")
    public void ingresoDni(String arg0) throws InterruptedException {
        signUpPage.setData(arg0,"dni");
        Thread.sleep(3000);

    }

    @When("ingreso fecha de nacimiento {string}")
    public void ingresoFNacimiento(String arg0) throws InterruptedException {
        signUpPage.setData(arg0,"birthDate");
        Thread.sleep(3000);
    }

    @When("ingreso telefono {string}")
    public void ingresoTelefono(String arg0) throws InterruptedException {
        signUpPage.setData(arg0,"phone");
        Thread.sleep(3000);
    }

    @When("ingreso email {string}")
    public void ingresoEmail(String arg0) throws InterruptedException {
        signUpPage.setData(arg0,"email");
        Thread.sleep(3000);
    }

    @When("ingreso contrasena {string} del nuevo usuario")
    public void ingresoContrasenaDelNuevoUsuario(String arg0) throws InterruptedException {
        signUpPage.setData(arg0,"password");
        Thread.sleep(3000);
    }

    @When("presiono registrarse")
    public void presionoRegistrarse() {
        signUpPage.signUp();


    }
    @When("presiono boton Actividades")
    public void presiono_boton_actividades() {
        homePage.goToActivities();

    }

    @When("presiono boton para reservar la clase de {string}")
    public void presiono_boton_para_reservar_la_clase_de(String string) {
        //activitiesPage.selectActivity(string);
    }

    @When("selecciono el turno {string}")
    public void selecciono_el_turno(String string) {
        //activitiesPage.reservation(string);
    }

    @When("el navegador me muestra modal de reserva")
    public void el_navegador_me_muestra_modal_de_reserva() {
        //activitiesPage.validateFrameReservation();
    }

    @When("presiono boton reservar")
    public void presiono_boton_reservar() {
        //activitiesPage.confirmReservation();
    }

    @Then("el navegador me muestra un mensaje de reserva exitosa")
    public void el_navegador_me_muestra_un_mensaje_de_reserva_exitosa() {
        //activitiesPage.validateReservation();
    }

}

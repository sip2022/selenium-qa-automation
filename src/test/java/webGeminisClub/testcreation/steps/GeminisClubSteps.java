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
    GCHomeUserPage userHomePage;

    GCActivitiesPage activitiesPage;
    GCReservationPage reservationPage;
    GCPlanPage planPage;
    GCPaymentPage paymentPage;
    GCMercadoPagoPage mpPage;
    GCAdmin adminPage;
    GCAdminActivitiesPage adminActivitiesPage;

    
    @Given("estoy en un navegador con la pagina inicial de Geminis Club")
    public void estoyEnUnNavegadorConLaPaginaInicialDeGeminisClub() {
        homePage = new GCHomePage(driver,wait);
        homePage.goToUrl(url);
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
        activationPage = new GCActivationPage(driver,wait);
    }
    @When("presiono boton Actividades")
    public void presiono_boton_actividades() {
        homePage.goToActivities();
        activitiesPage = new GCActivitiesPage(driver,wait);
    }

    @When("presiono boton para reservar la clase de {string}")
    public void presiono_boton_para_reservar_la_clase_de(String string) {
        activitiesPage.selectActivity(string);
    }

    @When("selecciono el turno {string}")
    public void selecciono_el_turno(String string) {
        activitiesPage.reservation(string);
    }

    @When("el navegador me muestra modal de reserva")
    public void el_navegador_me_muestra_modal_de_reserva() {
        activitiesPage.validateFrameReservation();
    }

    @When("presiono boton reservar")
    public void presiono_boton_reservar() {
        activitiesPage.confirmReservation();
    }

    @When("el navegador me muestra un mensaje de reserva exitosa")
    public void el_navegador_me_muestra_un_mensaje_de_reserva_exitosa() {
        activitiesPage.validateReservation();
    }

    @Then("el navegador me muestra la nueva reserva {string} en la pagina de mis reservas")
    public void elNavegadorMeMuestraLaNuevaReservaEnLaPaginaDeMisReservas(String arg0) {
        reservationPage.searchReservation(arg0);
    }

    @When("inicio sesion con mi mail {string} y contraseña {string}")
    public void inicioSesionConMiMailYContraseña(String arg0, String arg1) throws InterruptedException {
        this.estoyEnUnNavegadorConLaPaginaDeRegistroDeGeminisClub();
        this.ingresoNombre("user");
        this.ingresoApellido("gym 2");
        this.ingresoDni("77777770");
        this.ingresoFNacimiento("08062022");
        this.ingresoTelefono("1122334401");
        this.ingresoEmail("usergym2@mail.com");
        this.ingresoContrasenaDelNuevoUsuario("user1234");
        this.presionoRegistrarse();
    }

    @When("el navegador me muestra un mensaje de suscripcion exitosa")
    public void elNavegadorMeMuestraUnMensajeDeSuscripcionExitosa() {
        planPage.validateSuscriptionOk();
    }

    @When("presiono boton Planes")
    public void presionoBotonPlanes() {
        homePage.goToPlan();
        planPage = new GCPlanPage(driver,wait);
    }

    @When("selecciono el plan {string}")
    public void seleccionoElPlan(String arg0) {
        planPage.selectPlan(arg0);
    }


    @When("presiono el boton suscribirse")
    public void presionoElBotonSuscribirse() {
        planPage.subscribe();
    }

    @When("confirmo suscripcion")
    public void confirmoSuscripcion() {
        planPage.confirmSubscription();
    }


    @When("Ingreso la cantidad de meses que quiero suscribirme al plan {string}")
    public void ingresoLaCantidadDeMesesQueQuieroSuscribirmeAlPlan(String arg0) {
        planPage.setMonthsSubscription(arg0);
    }

    @Then("el navegador me muestra mi lista de pagos con el pago pendiente de la suscripcion por {int} mes del plan {string} valor mensual {int}")
    public void elNavegadorMeMuestraMiListaDePagos(int arg0, String arg1, int arg2) {
        paymentPage = new GCPaymentPage(driver,wait);
        paymentPage.validatePaymentList(arg0,arg1,arg2);
    }

    @When("presiono Pagar")
    public void presionoPagar() {
        mpPage.pay();
    }

    @When("presiono boton Usuario")
    public void presionoBotonUsuario() {
        homePage.goToUser();
        userHomePage = new GCHomeUserPage(driver,wait);
    }

    @When("presiono boton Mis Pagos")
    public void presionoBotonMisPagos() {
        userHomePage.goToPayment();
        paymentPage = new GCPaymentPage(driver,wait);
    }

    @When("selecciono paga con tarjeta")
    public void seleccionoPagaConTarjeta() {
        mpPage.selectPayByCard();
    }

    @When("ingreso numero de tarjeta {string}")
    public void ingresoNumeroDeTarjeta(String arg0) {
        mpPage.setcardNumber(arg0);
    }

    @When("ingreso vencimiento de la tarjeta {string}")
    public void ingresoVencimientoDeLaTarjeta(String arg0) {
        mpPage.setExpirationDateCard(arg0);
    }

    @When("ingreso titular de la tarjeta {string}")
    public void ingresoTitularDeLaTarjeta(String arg0) {
        mpPage.setCustomerName(arg0);
    }

    @When("ingreso cvv {string}")
    public void ingresoCvv(String arg0) {
        mpPage.setCvv(arg0);
    }


    @When("ingreso dni del titular de la tarjeta {string}")
    public void ingresoDniDelTitularDeLaTarjeta(String arg0) {
        mpPage.setDni(arg0);
    }

    @When("selecciono numero de cuotas {string}")
    public void seleccionoNumeroDeCuotas(String arg0) {
        mpPage.selectNumberOfPayments(arg0);
    }

    @When("presiono volver al sitio")
    public void presionoVolverAlSitio() {
        mpPage.goToGCPage();
    }

    @Then("el navegador me muestra el pago en listas de pago")
    public void elNavegadorMeMuestraElPagoEnListasDePago() {
        paymentPage.validatePaymentHistory();
    }


    @When("presiono enlace para pagar suscripcion de mi plan {string} con un valor total de {string}")
    public void presionoEnlaceParaPagarSuscripcionDeMiPlanConUnValorTotalDe(String arg0, String arg1) {
        paymentPage.gotoMercadoPago(arg0,arg1);
        mpPage = new GCMercadoPagoPage(driver,wait);
    }

    @When("presiono boton continuar para complettar dni")
    public void presionoBotonContinuarParaComplettarDni() {
        mpPage.clickContinue("nextDni");
    }

    @When("presiono boton continuar para seleccionar cuotas")
    public void presionoBotonContinuarParaSeleccionarCuotas() {
        mpPage.clickContinue("nextInstallments");
    }

    @When("presiono boton continuar para confirmar pago")
    public void presionoBotonContinuarParaConfirmarPago() {
        mpPage.clickContinue("nextPay");
    }

    @When("presiono boton Admin")
    public void presionoBotonAdmin() {
        userHomePage.goToMenuAdmin();
    }

    @When("selecciono actividades")
    public void seleccionoActividades() {
        adminPage = new GCAdmin(driver,wait);
        adminPage.activities();
        adminActivitiesPage = new GCAdminActivitiesPage(driver,wait);
    }

    @When("presiono el boton Agregar actividad")
    public void presionoElBotonAgregarActividad() {
        adminActivitiesPage.add();
    }

    @When("ingreso nombre de la actividad {string}")
    public void ingresoNombreDeLaActividad(String arg0) {
        adminActivitiesPage.setName(arg0);
    }

    @When("selecciono profesor {string}")
    public void seleccionoProfesor(String arg0) {
        adminActivitiesPage.setProfessor(arg0);
    }

    @When("ingreso limite de asistencia {string}")
    public void ingresoLimiteDeAsistencia(String arg0) {
        adminActivitiesPage.atendeesLimit(arg0);
    }

    @When("ingreso precio base {string}")
    public void ingresoPrecioBase(String arg0) {
        adminActivitiesPage.setPrice(arg0);
    }

    @When("presiono crear actividad")
    public void presionoCrearActividad() {
        adminActivitiesPage.createActivity();
    }

    @Then("el navegador muestra un mensaje de creacion de nueva actividad exitosa")
    public void elNavegadorMuestraUnMensajeDeCreacionDeNuevaActividadExitosa() {
    }
}

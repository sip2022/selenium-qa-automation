}





Feature: Inicio sesión de usuarios
  Como usuario de Geminis Club,
  Quiero iniciar sesón de mi cuenta en Geminis Club,
  Para poder utilizar el sistema.

  @test
  Scenario: Login cliente
    Given estoy en un navegador con la pagina inicial de Geminis Club
    When selecciono iniciar sesion/registrarse
    And ingreso mi mail de usuario "luisinakelly@gmail.com"
    And ingreso contraseña "lkelly1234"
    And presiono ingresar
    Then  el navegador muestra la pagina de inicio de "cliente"


 @test 
  Scenario: Login administrador
    Given estoy en un navegador con la pagina inicial de Geminis Club
    When selecciono iniciar sesion/registrarse
    And ingreso mi mail de usuario "admin@mail.com"
    And ingreso contraseña "admin"
   And presiono ingresar
    Then  el navegador muestra la pagina de inicio de "administracion"

  @test 
  Scenario: Login analista
    Given estoy en un navegador con la pagina inicial de Geminis Club
    When selecciono iniciar sesion/registrarse
    And ingreso mi mail de usuario "analista@mail.com"
    And ingreso contraseña "analista123"
    And presiono ingresar
    Then  el navegador muestra la pagina de inicio de "analista"

  @test 
  Scenario: Login profesor
    Given estoy en un navegador con la pagina inicial de Geminis Club
    When selecciono iniciar sesion/registrarse
    And ingreso mi mail de usuario "profesor@mail.com"
    And ingreso contraseña "profe1234"
    And presiono ingresar
    Then  el navegador muestra la pagina de inicio de "profesor"
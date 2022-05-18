Feature: 
  Como ,
  Quiero ,
  Para .

 @test 
  Scenario: Registrar usuario
    Given estoy en un navegador con la pagina inicial de Geminis Club
  	When selecciono iniciar sesion/registrarse
    And presiono crear cuenta
    And ingreso nombre ""
    And ingreso apellido ""
    And ingreso dni "40000000"
    And ingreso edad "24"
    And ingreso telefono ""
    And ingreso email "usergeminisclub@gmail.com"
    And ingreso contrasena "user1234" del nuevo usuario
    And presiono registrarse
  	Then el navegador muestra el login con el mensaje "Creaste tu cuenta activala y comenza a entrenar con nosotros"
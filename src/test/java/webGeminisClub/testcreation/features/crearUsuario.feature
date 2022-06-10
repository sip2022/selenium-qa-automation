Feature: 
  Como ,
  Quiero ,
  Para .


  Scenario: Registrar usuario
    Given estoy en un navegador con la pagina de registro de Geminis Club
  	When ingreso nombre "User Gym"
    And ingreso apellido "Test"
    And ingreso dni "40000004"
    And ingreso fecha de nacimiento "09062000"
    And ingreso telefono "144000011"
    And ingreso email "usergym-geminisclub@mail.com"
    And ingreso contrasena "gym12345" del nuevo usuario
    And presiono registrarse
  	Then el navegador muestra el mensaje "¡Su cuenta ha sido registrada con éxito, pero no está activada!"
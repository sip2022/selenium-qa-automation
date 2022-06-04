Feature: 
  Como ,
  Quiero ,
  Para .

 @test @muestraClase
  Scenario: Registrar usuario
    Given estoy en un navegador con la pagina de registro de Geminis Club
  	When ingreso nombre "User 1"
    And ingreso apellido "Test"
    And ingreso dni "40000001"
    And ingreso fecha de nacimiento "18121997"
    And ingreso telefono "144000001"
    And ingreso email "user1geminisclub@mail.com"
    And ingreso contrasena "user12345" del nuevo usuario
    And presiono registrarse
  	Then el navegador muestra el mensaje "¡Su cuenta ha sido registrada con éxito, pero no está activada!"
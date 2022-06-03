Feature: 
  Como ,
  Quiero ,
  Para .

 @test @muestraClase
  Scenario: Registrar usuario
    Given estoy en un navegador con la pagina de registro de Geminis Club
  	When ingreso nombre "User"
    And ingreso apellido "Test"
    And ingreso dni "40000000"
    And ingreso fecha de nacimiento "18121997"
    And ingreso telefono "144000000"
    And ingreso email "usergeminisclub@mail.com"
    And ingreso contrasena "user1234" del nuevo usuario
    And presiono registrarse
  	Then el navegador muestra el mensaje "¡Su cuenta ha sido registrada con éxito, pero no está activada!"
Feature: Reservar actividad
  Como cliente de Geminis CLub,
  Quiero reservar un turno,
  Para poder realizar una clase .

 @test @muestraClase
  Scenario: Reservar Actividad
    Given estoy en un navegador con la pagina inicial de Geminis Club
  	When presiono boton Actividades
  	And presiono boton para reservar la clase de "SPINNING"
  	And selecciono el turno "MONDAY: 9:15 - 10:15"
  	And el navegador me muestra modal de reserva
  	And presiono boton reservar
  	Then el navegador me muestra un mensaje de reserva exitosa
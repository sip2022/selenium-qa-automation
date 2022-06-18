Feature: Reservar actividad
  Como cliente de Geminis CLub,
  Quiero reservar un turno,
  Para poder realizar una clase .

@test
  Scenario: Reservar Actividad
    Given estoy en un navegador con la pagina inicial de Geminis Club
  	When inicio sesion con mi mail "usuario" y contraseña "password"
    And presiono boton Actividades
  	And presiono boton para reservar la clase de "CROSSFIT"
  	And selecciono el turno "Lunes: 7:15 - 8:15"
  	And el navegador me muestra modal de reserva
  	And presiono boton reservar
    And el navegador me muestra un mensaje de reserva exitosa
  	Then el navegador me muestra la nueva reserva "Lunes 9:15 - 10:15 CROSSFIT" en la pagina de mis reservas
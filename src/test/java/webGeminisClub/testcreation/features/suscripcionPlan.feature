Feature: Suscribirse a un plan 
  Como cliente de Geminis Club,
  Quiero suscribirme a un plan,
  Para poder utilizar los servicios del gimnsio.

 @test 
  Scenario:
   Given estoy en un navegador con la pagina inicial de Geminis Club
   When inicio sesion con mi mail "usuario" y contraseña "password"
   And presiono boton Planes
   And selecciono el plan "Platinum"
   And Ingreso la cantidad de meses que quiero suscribirme al plan "1"
   And presiono el boton suscribirse
   And confirmo suscripcion
   And el navegador me muestra un mensaje de suscripcion exitosa
   Then el navegador me muestra mi lista de pagos con el pago pendiente de la suscripcion por 1 mes del plan "Paltinum" valor mensual 3500
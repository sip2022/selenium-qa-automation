Feature: Pago suscripcion
  Como cliente de Geminis Club ,
  Quiero poder pagar la suscripcion al pal elegido,
  Para poder seguir utilizando los servicios del gimnasio.


  Scenario: Pago Plan con tarjeta
    Given estoy en un navegador con la pagina inicial de Geminis Club
    When inicio sesion con mi mail "usuario" y contraseña "password"
    And presiono boton Usuario
    And presiono boton Mis Pagos
    And presiono enlace para pagar suscripcion de mi plan "Bronze" con un valor total de "1500"
    And selecciono paga con tarjeta
    And ingreso numero de tarjeta "4509953566233704"
    And ingreso vencimiento de la tarjeta "1125"
    And ingreso titular de la tarjeta "User Gym"
    And ingreso cvv "123"
    And presiono boton continuar para complettar dni
    And ingreso dni del titular de la tarjeta "12345678"
    And presiono boton continuar para seleccionar cuotas
    And selecciono numero de cuotas "1"
    And presiono Pagar
    And presiono volver al sitio
    And presiono boton Usuario
    And presiono boton Mis Pagos
  	Then el navegador me muestra el pago en listas de pago
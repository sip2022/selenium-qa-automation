Feature: Crear Actividad
  Como administrador de Geminis Club,
  Quiero crear actividades,
  Para poder ofrecer clases a los clientes.


  Scenario:
    When inicio sesion con mi mail "usuario" y contraseña "password"
    And presiono boton Usuario
    And presiono boton Admin
    And selecciono actividades
    And presiono el boton Agregar actividad
    And ingreso nombre de la actividad "Funcional"
    And selecciono profesor "null null"
    And ingreso limite de asistencia "10"
    And ingreso precio base "2000"
    And presiono crear actividad
  	Then el navegador muestra un mensaje de creacion de nueva actividad exitosa
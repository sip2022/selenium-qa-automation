Feature: Reestablecer contraseña
  Como usuario de Geminis Club,
  Quiero reestablecer mi contraseña,
  Para poder iniciar sesión en el sistema.


  Scenario: 
    Given estoy en un navegador con la pagina inicial de Geminis Club
  	When selecciono iniciar sesion
    And presiono olvide contraseña
    And ingreso mi mail de usuario "luisinakelly@gmail.com" en olvide contrasena
    And ingreso nueva contrasena "lkelly12345"
    And ingreso nuevamente la nueva contrasena "lkelly12345"
    And presiono guardar contraseña
  	Then el navegador muestra el login con el mensaje "Se reestablecio la contraseña correctamente, inicia sesion y entrena con nosotros"
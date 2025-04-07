Feature: Login de Usuarios
  @login-success
  Scenario Outline: Login de usuario con credenciales correctas
    Given el usuario está en la página de inicio de sesión "https://juice-shop.herokuapp.com/#/login"
    When el usuario ingresa "<email>" "<password>" válidos
    Then el usuario debería iniciar sesión exitosamente
    Examples:
      | email                        | password |
      | josuevaldivieso02@gmail.com  | P12345@a |

  @login-fail
  Scenario Outline: Login de usuario con credenciales incorrectas
    Given el usuario está en la página de inicio de sesión "https://juice-shop.herokuapp.com/#/login"
    When el usuario ingresa "<email>" "<password>" válidos
    Then el usuario no debería iniciar sesión exitosamente
    Examples:
      | email                      | password  |
      | josuevaldivieso@gmail.com  | P123456@   |

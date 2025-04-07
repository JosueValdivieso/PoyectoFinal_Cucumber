Feature: Registro de nuevos Usuarios
  @registro
  Scenario Outline: inicio de sesión con credenciales válidas
  Given el usuario está en la página de registro de usuario "https://juice-shop.herokuapp.com/#/register"
  When el usuario ingresa "<email>" "<password>" "<Answer>" válidos
  Then el usuario debería tener su cuenta creada
    Examples:
      | email               | password        | Answer  |
      | jvaldivc@gmail.com  | Password!@#1a   | zoila   |
      | ncroberto@gmail.com | Humy!b$KTrV2    | Martha  |
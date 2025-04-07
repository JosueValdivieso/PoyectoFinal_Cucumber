Feature: Cesta de productos
  @Cesta
  Scenario Outline: Agregar productos ala cesta
    Given el usuario está en la página de inicio de sesión "https://juice-shop.herokuapp.com/#/login"
    When el usuario ingresa "<email>" "<password>" válidos
    And agrega los productos a la cesta
    Then los productos de deberían agregar a la cesta exitosamente
    Examples:
      | email                        | password |
      | josuevaldivieso03@gmail.com  | P12345@a |
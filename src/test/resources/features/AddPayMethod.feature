Feature: Métodos de pago
  @AddPayMthod
  Scenario Outline: Agregar Método de pago
    Given el usuario está en la página my Payment Options "https://juice-shop.herokuapp.com/#/saved-payment-methods"
    When el usuario ingresa datos de tarjeta "<nombre>" "<numero>" válidos
    Then el usuario debería registar tarjeta exitosamente
    Examples:
      | nombre            | numero           |
      | Josue Valdivieso  | 4557201255029869 |
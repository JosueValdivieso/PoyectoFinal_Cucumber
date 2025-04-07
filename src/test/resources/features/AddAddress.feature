Feature: Agregar Dirección
  @addAddress
  Scenario Outline: Agregar dirección
    Given el usuario está en la página de agregar dirección "https://juice-shop.herokuapp.com/#/address/saved"
    When el usuario ingresa "<Country>" "<Name>" "<Mobile>" "<ZIP>" "<Address>" "<City>" "<State>"
    Then el usuario debería agregar dirección exitosamente
    Examples:
      | Country | Name   | Mobile    | ZIP  | Address             | City  | State |
      | Peru    | Josue  | 976734181 | 7856 |  Av. Arequipa 2255  | Lima  | Lima  |
      | Bolivia | Carlos | 976730000 | 6520 |  Av. Sucre 2255     | Sucre | Sucre |

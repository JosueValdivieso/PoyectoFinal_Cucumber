package com.juiceshop.steps;

import com.juiceshop.utils.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CardStep extends Base {
    @Given("el usuario está en la página my Payment Options {string}")
    public void elUsuarioEstáEnLaPáginaMyPaymentOptions(String url) {
        driver.get(url);
    }

    @When("el usuario ingresa datos de tarjeta {string} {string} válidos")
    public void elUsuarioIngresaDatosDeTarjetaVálidos(String nombre, String card) {
        cardPage.fillOutformCard(nombre, card);
        
    }

    @Then("el usuario debería registar tarjeta exitosamente")
    public void elUsuarioDeberíaRegistarTarjetaExitosamente() {
    }
}

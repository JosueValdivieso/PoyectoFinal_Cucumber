package com.juiceshop.steps;

import com.juiceshop.utils.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddressStep extends Base {
    @Given("el usuario está en la página de agregar dirección {string}")
    public void elUsuarioEstáEnLaPáginaDeAgregarDirección(String arg0) {
        
    }

    @When("el usuario ingresa {string} {string} {string} {string} {string} {string} {string}")
    public void elUsuarioIngresa(String country, String name, String mobile, String zip, String address, String city, String state) {
        addressPage.fillOutformAddress(country,name,mobile,zip,address,city,state);
    }

    @Then("el usuario debería agregar dirección exitosamente")
    public void elUsuarioDeberíaAgregarDirecciónExitosamente() {
    }
}

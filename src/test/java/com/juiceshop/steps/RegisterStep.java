package com.juiceshop.steps;

import com.juiceshop.utils.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;

public class RegisterStep extends Base {

    @Given("el usuario está en la página de registro de usuario {string}")
    public void elUsuarioEstáEnLaPáginoDeRegsitroDeUsuario(String url) {
        driver.get(url);
        
    }

    @When("el usuario ingresa {string} {string} {string} válidos")
    public void elUsuarioIngresaVálidos(String email, String pass, String answer) {
        registerPage.fillOutformRegister(email, pass, answer);

    }

    @Then("el usuario debería tener su cuenta creada")
    public void elUsuarioDeberíaTenerSuCuentaCreada() {
        assertThat(driver.findElement(By.tagName("h1"))).isEqualTo("Login");
    }
}

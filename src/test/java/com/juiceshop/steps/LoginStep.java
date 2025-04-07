package com.juiceshop.steps;

import com.juiceshop.utils.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginStep extends Base {
    @Given("el usuario está en la página de inicio de sesión {string}")
    public void elUsuarioEstáEnLaPáginaDeInicioDeSesión(String url) {
        driver.get(url);
        
    }

    @When("el usuario ingresa {string} {string} válidos")
    public void elUsuarioIngresaVálidos(String email, String pass) {
        loginPage.fillOutformLogin(email, pass);
    }

    @Then("el usuario debería iniciar sesión exitosamente")
    public void elUsuarioDeberíaIniciarSesiónExitosamente() {
        assertThat(driver.findElement(By.className("ng-star-inserted")).getText()).isEqualTo("All Products");

    }

    @Then("el usuario no debería iniciar sesión exitosamente")
    public void elUsuarioNoDeberíaIniciarSesiónExitosamente() {
        assertThat(driver.findElement(By.className("error ng-star-inserted")).getText()).isEqualTo("Invalid email or password.");
    }

}




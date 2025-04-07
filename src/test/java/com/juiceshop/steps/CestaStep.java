package com.juiceshop.steps;

import com.juiceshop.utils.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CestaStep extends Base {
    @And("agrega los productos a la cesta")
    public void agregaLosProductosALaCesta() {
        cestaPage.selectProductsBascket();

    }

    @Then("los productos de deberían agregar a la cesta exitosamente")
    public void losProductosDeDeberíanAgregarALaCestaExitosamente() {
    }
}

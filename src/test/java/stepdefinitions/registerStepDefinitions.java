package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Register;

public class registerStepDefinitions {

    Register register;
    @Given("el usuario ingrese a JPetStore")
    public void elUsuarioIngreseAJPetStore() {
        register.open();
    }

    @When("el usuario de clic en Sign In")
    public void elUsuarioDeClicEnSignIn() {
        register.ClicEnSignIn();
    }

    //Registro Correcto
    @And("el usuario de clic en register now")
    public void elUsuarioDeClicEnRegisterNow() {
        register.ClicEnRegisterNow();
    }

    @And("el usuario diligencie los campos obligatorios del formulario")
    public void elUsuarioDiligencieLosCamposObligatoriosDelFormulario(String row) {
        register.DiligencieLosCamposObligatoriosDelFormulario(Integer.parseInt(row));
    }

    @And("el usuario de clic en Save Account Information")
    public void elUsuarioDeClicEnSaveAccountInformation() {
        register.ClicEnSaveAccountInformation();
    }

    @Then("el usuario volvera al Inicio")
    public void elUsuarioVolveraAlInicio() {
        register.VolveraHome();
    }
//Registro Incorrecto
    @And("el usuario ingresa un usuario ya existente")
    public void elUsuarioIngresaUnUsuarioYaExistente(String row) {
        register.IngresarUsuarioExistente(Integer.parseInt(row));
    }

    @Then("el sistema muestra mensaje de error")
    public void elSistemaMuestraMensajeDeError() {
        register.MensajedeErrorRegistro();
    }

    //Campos Vacios
    @And("el usuario no ingresa campos obligatorios")
    public void elUsuarioNoIngresaCamposObligatorios(String rowNumber) {
        register.NoIngresarCamposObligatorios(Integer.parseInt(rowNumber));
    }

    //IDvacio
    @And("el usuario no ingresa el ID")
    public void elUsuarioNoIngresaElID(String row) {
        register.IDvacio(Integer.parseInt(row));
    }

    @Then("el sistema permanece en el formulario de registro")
    public void elSistemaPermaneceEnElFormularioDeRegistro() {
        register.PermaneceenRegistro();
    }

//Password vacios
    @And("el usuario no ingresa los password")
    public void elUsuarioNoIngresaLosPassword(String row) {
        register.NoIngresaLosPassword(Integer.parseInt(row));
    }
}

package com.choucair.reto6.definitions;
import java.util.List;
import com.choucair.reto6.steps.*;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ProductPurchaseDefinition {
	@Steps
	SearchProductSteps searchProductSteps;
	@Steps
	CardViewSteps cardViewSteps;
	@Steps
	CheckoutSteps checkoutSteps;
	@Steps
	ExecutionValidationSteps executionValidationSteps;
	@Given("^Abro la pagina y en el buscador digito \"([^\"]*)\"$")
	public void abro_la_pagina_y_en_el_buscador_digito(String strInSearch) {
		searchProductSteps.opennavegador(strInSearch);}
	@When("^Selecciono abro el primer mackbook$")
	public void selecciono_abro_el_primer_mackbook() {
		searchProductSteps.openmacbook();
	}
	@When("^le doy click en añadir al carrito, voy al carrito y doy click a checkout$")
	public void le_doy_click_en_añadir_al_carrito_y_voy_al_carrito() {
		cardViewSteps.viewcard();
	}
	@When("^Le doy en comprar e ingreso los datos de la compra y acepto la politica de privacidad$")
	public void le_doy_en_comprar_e_ingreso_los_datos_de_la_compra_y_acepto_la_politica_de_privacidad(
			DataTable dtDatosForm) {
		List<List<String>> data = dtDatosForm.raw();
		for (int i = 1; i < data.size(); i++) {
			checkoutSteps.fDataClient(data, i);
			checkoutSteps.fAddressClient(data, i);
			}
		checkoutSteps.agree();
	}
	@Then("^Verifico que la compra llegue hasta metodo de pago$")
	public void verifico_que_la_compra_llegue_hasta_metodo_de_pago() {
		executionValidationSteps.okexecution();
	}
}

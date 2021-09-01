package com.choucair.reto6.definitions;
import com.choucair.reto6.steps.CardViewSteps;
import com.choucair.reto6.steps.ExecutionValidationSteps;
import com.choucair.reto6.steps.SearchProductSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SearchCameraDefinition {
	@Steps
	SearchProductSteps searchProductSteps;
	@Steps
	CardViewSteps cardViewSteps;
	@Steps
	ExecutionValidationSteps executionValidationSteps;
	
	@Given("^Abro la pagina, en el menu selecciono camaras y abro la segunda camara$")
	public void abro_la_pagina_en_el_menu_selecciono_camaras_y_abro_la_segunda_camara() {
		searchProductSteps.searchcamera();
	}	
	@When("^digito (\\d+) en cantidad y añado al carrito$")
	public void digito_en_cantidad_y_añado_al_carrito(String Cantidad) {
		cardViewSteps.addcamera(Cantidad);
	}
	@Then("^en el boton del carrito me visualiza la cantidad de camaras que añadi$")
	public void en_el_boton_del_carrito_me_visualiza_la_cantidad_de_camaras_que_añadi() {
		executionValidationSteps.checkPrice();
	}
}

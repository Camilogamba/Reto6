package com.choucair.reto6.steps;

import com.choucair.reto6.pageobjects.SearchProductPage;
import com.choucair.reto6.utilities.AccionesWeb;

import net.thucydides.core.annotations.Step;

public class SearchProductSteps {
	SearchProductPage searchProductPage;
	AccionesWeb accionesWeb;
	@Step
	public void opennavegador(String strInSearch) {
		accionesWeb.abrirURL("http://opencart.abstracta.us/index.php?route=common/home");
		accionesWeb.bordearElemento(searchProductPage.inSearch);
		accionesWeb.espBorCliSendKey(searchProductPage.inSearch, strInSearch);
		accionesWeb.bordearScrenClick(searchProductPage.btnSearch);
		accionesWeb.recorrer_productos();
	}
	public void searchcamera() {
		accionesWeb.abrirURL("http://opencart.abstracta.us/index.php?route=common/home");
		accionesWeb.bordearScrenClick(searchProductPage.camSear);
		accionesWeb.moverPantallahastaElemento2(searchProductPage.ubcam);
		accionesWeb.bordearScrenClick(searchProductPage.btcam);
		
	}
	@Step
	public void openmacbook() {
		accionesWeb.moverPantallahastaElemento2(searchProductPage.search);
		accionesWeb.bordearScrenClick(searchProductPage.openMac);
	}
}

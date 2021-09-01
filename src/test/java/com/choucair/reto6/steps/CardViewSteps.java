package com.choucair.reto6.steps;
import com.choucair.reto6.pageobjects.AddCardPage;
import com.choucair.reto6.utilities.AccionesWeb;
import net.thucydides.core.annotations.Step;

public class CardViewSteps {
	AddCardPage addCardPage;
	AccionesWeb accionesWeb;
	@Step
	public void viewcard() {
		accionesWeb.bordearEspe2(addCardPage.quantity);
		accionesWeb.moverPantallahastaElemento2(addCardPage.ubcard);
		accionesWeb.bordearScrenClick(addCardPage.addCard);
		accionesWeb.bordearClick(addCardPage.totalCard);
		accionesWeb.moverPantallahastaElemento2(addCardPage.btncontent);
		accionesWeb.bordearScrenClick(addCardPage.checkout);
		accionesWeb.bordearClick(addCardPage.segu);
		accionesWeb.bordearClick(addCardPage.segu2);
		accionesWeb.bordearScrenClick(addCardPage.btncont);
	}
	@Step
	public void addcamera(String strCant) {
		accionesWeb.bordearElemento(addCardPage.quantity);
		accionesWeb.clear_sendKeys(addCardPage.quantity, strCant);
		accionesWeb.bordearClick(addCardPage.addCard2);
		accionesWeb.validartotal();
	}
}

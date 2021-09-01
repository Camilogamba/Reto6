package com.choucair.reto6.steps;
import java.util.List;
import com.choucair.reto6.pageobjects.CheckoutPage;
import com.choucair.reto6.utilities.AccionesWeb;
import net.thucydides.core.annotations.Step;

public class CheckoutSteps {
	CheckoutPage checkoutPage;
	AccionesWeb accionesWeb;
	@Step
	public void fDataClient(List<List<String>> data, int id) {
		accionesWeb.espBorCliSendKey(checkoutPage.fname, data.get(id).get(0).trim());
		accionesWeb.espBorCliSendKey(checkoutPage.lname, data.get(id).get(1).trim());  
		accionesWeb.espBorCliSendKey(checkoutPage.email, data.get(id).get(2).trim());
		accionesWeb.espBorCliSendKey(checkoutPage.telephone, data.get(id).get(3).trim());
		accionesWeb.espBorCliSendKey(checkoutPage.strpass, data.get(id).get(4).trim());
		accionesWeb.espBorCliSendKey(checkoutPage.strrpass, data.get(id).get(5).trim());
	}
	@Step
	public void fAddressClient(List<List<String>> data, int id) {
		accionesWeb.espBorCliSendKey(checkoutPage.address, data.get(id).get(6).trim());
		accionesWeb.espBorCliSendKey(checkoutPage.city, data.get(id).get(7).trim());
		accionesWeb.espBorCliSendKey(checkoutPage.postCode, data.get(id).get(8).trim());
		accionesWeb.espBorCliSendKey(checkoutPage.country, data.get(id).get(9).trim());
		accionesWeb.espBorCliSendKey2(checkoutPage.zone, data.get(id).get(10).trim());
	}
	@Step
	public void agree() {
		accionesWeb.bordearClick(checkoutPage.check);
		accionesWeb.esperasegundos(4);
		accionesWeb.bordearScrenClick(checkoutPage.btnreg);
	}
}

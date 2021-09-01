package com.choucair.reto6.steps;

import com.choucair.reto6.pageobjects.ExecutionValidationPage;
import com.choucair.reto6.utilities.AccionesWeb;

import net.thucydides.core.annotations.Step;

public class ExecutionValidationSteps {
	ExecutionValidationPage executionValidationPage;
	AccionesWeb accionesWeb;
	@Step
	public void okexecution() {
		accionesWeb.bordearValdScren(executionValidationPage.valid);
		//accionesWeb.esperasegundos(4);
	}
	@Step
	public void checkPrice() {
		accionesWeb.bordearValdScren(executionValidationPage.price);
		//accionesWeb.validarVisib(executionValidationPage.price);
		//accionesWeb.esperasegundos(4);
	}
}

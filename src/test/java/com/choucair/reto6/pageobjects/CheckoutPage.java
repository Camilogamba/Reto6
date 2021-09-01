package com.choucair.reto6.pageobjects;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckoutPage extends PageObject {
	@FindBy(id = "button-account")
	public WebElementFacade btnContinue;
	@FindBy(name = "firstname")
	public WebElementFacade fname;
	@FindBy(name = "lastname")
	public WebElementFacade lname;
	@FindBy(id = "input-payment-email")
	public WebElementFacade email;
	@FindBy(id = "input-payment-telephone")
	public WebElementFacade telephone;
	@FindBy(id = "input-payment-password")
	public WebElementFacade strpass;
	@FindBy(id = "input-payment-confirm")
	public WebElementFacade strrpass;
	@FindBy(id = "input-payment-address-1")
	public WebElementFacade address;
	@FindBy(id = "input-payment-city")
	public WebElementFacade city;
	@FindBy(id = "input-payment-postcode")
	public WebElementFacade postCode;
	@FindBy(id = "input-payment-country")
	public WebElementFacade country;
	@FindBy(id = "input-payment-zone")
	public WebElementFacade zone;
	@FindBy(name = "agree")
	public WebElementFacade check;
	@FindBy(id = "button-register")
	public WebElementFacade btnreg;	
}

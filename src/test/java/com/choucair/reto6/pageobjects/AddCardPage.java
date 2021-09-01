package com.choucair.reto6.pageobjects;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AddCardPage extends PageObject {
	@FindBy(id="button-cart")
	public WebElementFacade addCard;
	@FindBy(xpath = "//a[@href='http://opencart.abstracta.us:80/index.php?route=checkout/cart']")
	public WebElementFacade totalCard;
	@FindBy(xpath = "//div[@class='pull-right']")
	public WebElementFacade checkout;
	@FindBy(id = "details-button")
	public WebElementFacade segu;
	@FindBy(id = "proceed-link")
	public WebElementFacade segu2;
	@FindBy(id = "button-cart")
	public WebElementFacade addCard2;
	@FindBy(xpath = "//ul[@class='breadcrumb']")
	public WebElementFacade ubcard;
	@FindBy(name = "quantity")
	public WebElementFacade quantity;
	@FindBy(id = "cart")
	public WebElementFacade btncard;
	@FindBy(id = "content")
	public WebElementFacade btncontent;	
	@FindBy(xpath = "//div/table/tbody[1]/tr[4]/td[@class='text-right'][2]")
	public WebElementFacade price;
	@FindBy(id = "button-account")
	public WebElementFacade btncont;
}

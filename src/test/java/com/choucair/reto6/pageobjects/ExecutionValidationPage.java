package com.choucair.reto6.pageobjects;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ExecutionValidationPage extends PageObject {
	@FindBy(xpath = "//*[contains(text(),'Add Comments About Your Order')]")
	public WebElementFacade valid;
	@FindBy(name = "comment")
	public WebElementFacade comment;
	@FindBy(name = "agree")
	public WebElementFacade agree;
	@FindBy(xpath = "//div/table/tbody[1]/tr[4]/td[@class='text-right'][2]")	
	public WebElementFacade price;
}

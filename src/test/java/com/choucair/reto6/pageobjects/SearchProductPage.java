package com.choucair.reto6.pageobjects;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SearchProductPage extends PageObject {
	@FindBy(name = "search")
	public WebElementFacade inSearch;
	@FindBy(xpath = "//button[contains(@class,'btn btn-default btn-lg')]")
	public WebElementFacade btnSearch;
	@FindBy(xpath = "//a[@href='http://opencart.abstracta.us:80/index.php?route=product/category&path=33']")
	public WebElementFacade camSear;
	@FindBy(xpath = "//a[contains(text(),'Nikon D300')]")	
	public WebElementFacade btcam; 
	@FindBy(xpath = "//a[@href='http://opencart.abstracta.us:80/index.php?route=product/product&product_id=43&search=macbook']")
	public WebElementFacade openMac;
	@FindBy(xpath = "//h2[contains(text(),'Search')]")
	public WebElementFacade search;
	@FindBy(xpath = "//ul[@class='breadcrumb']")
	public WebElementFacade ubcam;
}
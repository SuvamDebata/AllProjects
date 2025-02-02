package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {

WebDriver driver;
	
	public LeadsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@title='Create Lead...']")
	private WebElement createNewLeadButton;
	
	@FindBy(name = "search_text")
	private WebElement searchtextEdit;
	
	@FindBy(id = "bas_searchfield")
	private WebElement searchDd;
	
	@FindBy(name = "submit")
	private WebElement searchBtn;

	public WebElement getsearchBtn() {
		return searchBtn;
	}

	public WebElement getSearchDd() {
		return searchDd;
	}

	public WebElement getSearchtextEdit() {
		return searchtextEdit;
	}

	public WebElement getCreateNewLeadsButton() {
		return createNewLeadButton;
	}

}

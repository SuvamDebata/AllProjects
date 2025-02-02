package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsLinkOrgPage {
	
	WebDriver driver;
	public ContactsLinkOrgPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@name='search_text']")
	private WebElement searchEdt;
	
	@FindBy(xpath="//input[@name='search']")
	private WebElement searchBtn;
	
	public WebElement getsearchEdt() {
		return searchEdt;
	}
	public WebElement getsearchBtn() {
		return searchBtn;
	}

	
	
}

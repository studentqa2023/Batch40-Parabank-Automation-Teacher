package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	public MasterPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy (xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy (xpath="//input[@class='button']")
	private WebElement loginbtn;
	
	@FindBy (xpath="//a[contains(text(), 'Log Out')]")
	private WebElement logoutbtn;
	
	@FindBy (xpath="//p[contains(text(), 'Please enter a username and password.')]")
	private WebElement errormsg;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}

	public WebElement getErrormsg() {
		return errormsg;
	}
	
	

}

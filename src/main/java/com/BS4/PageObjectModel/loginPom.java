package com.BS4.PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPom {

	
	
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement login;
	
	public WebElement getlogin(){
		return login;
	
	  }
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	private WebElement password;
	public WebElement getpass() {
		return password;
	}
}

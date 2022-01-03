package com.BS4.Utility;

import org.openqa.selenium.WebElement;

public class Library extends BaseClass {
	
	public void Custom_Sendkeys(WebElement element,String value) {
		try {
			element.sendKeys(value);
		}
		catch(Exception e) {
			System.out.println("unable to send value"+e);
		}
	}
	public void Custom_Sendkeys(WebElement element) {
		element.click();
	}

}

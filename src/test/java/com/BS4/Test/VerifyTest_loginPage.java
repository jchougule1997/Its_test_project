package com.BS4.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.BS4.PageObjectModel.loginPom;
import com.BS4.Utility.BaseClass;

public class VerifyTest_loginPage extends BaseClass {
@Test
public void verify() {
	
	  loginPom email=PageFactory.initElements(driver, loginPom.class);
	email.getlogin();
	       loginPom pass=PageFactory.initElements(driver,loginPom.class);
      pass.getpass();	
}
}

package com.BS4.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class configDataProvider {

	private Properties pro;
	public configDataProvider() throws Exception {
		     String configdatapath=System.getProperty("user.dir")+"\\config\\Config.Properties";
		     File src=new File(configdatapath);
		     FileInputStream file=new FileInputStream(src);
		     pro=new Properties();
		     pro.load(file);
		     
	}
	public String Stage_URL() {
		return pro.getProperty("Stage_URL");
	}
	public String Email() {
		return pro.getProperty("Email");
		
	}
	public String Password() {
		return pro.getProperty("Password");
	}
}

package com.BS4.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
  public static ExtentReports extent;
  
  public static ExtentReports extentrepots() {
	
	    String reportpath=System.getProperty("user.dir")+"\\Reports";
	    ExtentSparkReporter report=new ExtentSparkReporter(reportpath);
	    report.config().setDocumentTitle("my first framework");
	    report.config().setReportName("Automation Test Report ");
	    report.config().setTheme(Theme.DARK);
	    
	    
	    extent=new ExtentReports();
	    extent.attachReporter(report);
	    extent.setSystemInfo("name","team achievers");
	  extent.setSystemInfo("QA","Auto");
	  extent.setSystemInfo("Enviro","Stage");
	  
	return extent;
	  
  }
}

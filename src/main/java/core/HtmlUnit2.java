package core;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class HtmlUnit2 {

	public static void main(String[] args) {
		WebDriver driver = new HtmlUnitDriver(); 
       
       String text_case_id = "WT-LP.01-05";
       String url = "https://ww2.wetravel.to/trips";
       String expected_result = "Small Group Tours, Group Trips | Wetravel";
	
       driver.get(url);
       driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);
       String actual_result = driver.getTitle();
       
       if (expected_result.equals(actual_result)) {
    	   System.out.println("Test Case ID: \t\t" + text_case_id);
    	   System.out.println("URL: \t\t\t" + url);
    	   System.out.println("Expected Result: \t" + expected_result);
	       System.out.println("Actual Result: \t\t" + actual_result);	
    	   System.out.println("Test Case Result: \t" + "CONGRATS,YOU PASSED");
       } else {
    	   System.out.println("Test Case ID: \t\t" + text_case_id);
    	   System.out.println("URL: \t\t\t" + url);
    	   System.out.println("Expected Result: \t" + expected_result);
	   System.out.println("Actual Result: \t" + actual_result);
    	   System.out.println("Test Case Result: \t" + "SORRY, YOU FAILED");
       }
       driver.quit();
	}
}

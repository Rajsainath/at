package com.raj.selbasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Helper {
	
	public static WebDriver driver;
	
	public static void launchBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public static void verifyTitle(String expectedhomepagetitle) {
		
		String actualhomepagetitle = driver.getTitle();
		if(actualhomepagetitle.equals(expectedhomepagetitle)) {
			
			System.out.println("actual and expected matched");
			System.out.println("both are "+actualhomepagetitle);
			
		}else {
			System.out.println("actual and expected dont match");
		}
		
	}
	public static void clickMobileMenu(String mobilemenubuttonxpath) {
		
		WebElement mobilemenubutton =driver.findElement(By.xpath(mobilemenubuttonxpath));
		mobilemenubutton.click();
		
	}
	
	public static void dropDown(String xpathdropdown, String text) {
		
		WebElement wl=driver.findElement(By.xpath(xpathdropdown));
		Select sel = new Select(wl);
		sel.selectByVisibleText(text);
		
	}
	
	public static void sortproducts(String xpathproducts) {
		
		List<WebElement> wl=driver.findElements(By.xpath(xpathproducts));
		for(WebElement w :wl)
		{
			String s =w.getText();
			System.out.println(s);
		}
	}
	
       public static void closeBrowser() {
    	   
    	   driver.close();
    	   
       }
}

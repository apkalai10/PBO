package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsers {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://msme.gov.in/"); //Load a new webpage but it doesn't maintain the browser History and cookies.
		
		String Url = driver.getCurrentUrl();//This method gets a string defining the current URL.
		
		String PageTitle = driver.getTitle();//This method fetches the title of the current web. 
		
		String source = driver.getPageSource(); //This method returns the source code of the current web page loaded on the current browser.
		
		WebElement element = driver.findElement(By.xpath("")); //This command is used to uniquely identify a (one) web element within the web page.
		
		List<WebElement> elements = driver.findElements(By.xpath(""));//This command is used to uniquely identify the list of web elements within the web page.
		
		driver.close();//This method terminates the current browser window operating by WebDriver at the current time.
		
		driver.quit(); //This method terminates all windows operating by WebDriver.
		
		driver.getWindowHandle(); //It fetches the handle of the web page which is in focus. It gets the address of the active browser.
		
		driver.getWindowHandles(); //It stores the set of handles for all the pages opened simultaneously.
		
		driver.manage();
		
		driver.navigate();
		
		driver.switchTo();
		
		
		
		

	}

}

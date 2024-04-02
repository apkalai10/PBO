package com.selenium;

import java.security.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		
		
		//Explicit wait is only applied on the specified element by the user
		//It is a conditional wait strategy 
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		
		Boolean b = wait.until(ExpectedConditions.titleContains("oogle"));
		System.out.println(b);
		WebElement searchbox = driver.findElement(By.xpath("//textarea[@name='q']"));
		
		wait.until(ExpectedConditions.visibilityOf(searchbox)).sendKeys("Amazon"+Keys.ENTER);
		
		driver.close();
		
		
	
		

	}

}

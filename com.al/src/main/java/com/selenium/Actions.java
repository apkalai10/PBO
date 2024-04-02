package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		org.openqa.selenium.interactions.Actions act = new org.openqa.selenium.interactions.Actions(driver);
		WebElement img = driver.findElement(By.xpath("//*[@class='Gdd5U']"));
		act.moveToElement(img).build().perform();
		

	}

}

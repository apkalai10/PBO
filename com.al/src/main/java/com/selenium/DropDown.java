package com.selenium;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.automationtesting.in/Register.html");
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//WebElement scroll = driver.findElement(By.xpath("//label[@for='days']"));
		//js.executeScript("arguments[0].scrollIntoView();", scroll ); 
		
		WebElement option = driver.findElement(By.xpath("//select[@id='stateID']"));
		Select select = new Select(option);
		//select.selectByIndex(2);
		select.selectByValue("S22");
		select.deselectByValue("S22");
		
		
		List<WebElement> values = select.getOptions();
		System.out.println("Total number of value in the Country DropDown Size "+values.size());
		
		System.out.println("Values");
		for (WebElement value : values) {
			System.out.println(value.getText());
		}
		
		System.out.println("Is it multiselect dropdown "+select.isMultiple());
		

		

	}

}

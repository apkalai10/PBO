package com.selenium;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MobileView {

	public static void main(String[] args) {
		Map<String, String> mobilem = new HashMap<String,String>();
		mobilem.put("deviceName", "Nexus 5");
		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("mobileEmulation", mobilem);
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.amazon.in/");

	}

}

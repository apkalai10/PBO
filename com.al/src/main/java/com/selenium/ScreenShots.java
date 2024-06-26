package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class ScreenShots {
		
	public void SnapUsing(WebDriver driver) //To take a screenshot Without header and footer using takesScreenshot.
	{
		 Calendar cal = Calendar.getInstance();
		 Date time  = cal.getTime();
		 String sub = RandomStringUtils.randomAlphabetic(4).toUpperCase();
		 String timeStamp = time.toString().replace(":", "").replace(" ", "").concat(sub);
		 TakesScreenshot screen = (TakesScreenshot) driver;
	     File  src = screen.getScreenshotAs(OutputType.FILE);
	     File desc  =  new File("C:\\Users\\aravinthprasath.e\\Desktop\\"+timeStamp+".png");
	     try {
	     FileHandler.copy(src, desc);
	     }catch(IOException e)
	     {
	    	 e.printStackTrace();
	     }
	}
	
	public void CaptureAnElement(WebDriver driver) //To take a screenshot of a particular element using takesScreenshot.
	{
		Calendar cal = Calendar.getInstance();
		Date time = cal.getTime();
		String sub  = RandomStringUtils.randomAlphabetic(4).toUpperCase();
		String timeStamp = time.toString().replace(":","").replace(" ","").concat(sub);
		WebElement element = driver.findElement(By.xpath("//img[@class='national_emblem']"));
		File src = element.getScreenshotAs(OutputType.FILE);
		File desc  =  new File("C:\\Users\\aravinthprasath.e\\Desktop\\"+timeStamp+".png");
		try{
			FileUtils.copyFile(src, desc);
		}catch(IOException e)
		{
			e.getMessage();
		}
				
	}
	
	public void fullcapture(WebDriver driver) //To take a screenshot of the full page Using ROBOT.
	{
		Calendar cal = Calendar.getInstance();
		Date time = cal.getTime();
		String sub  = RandomStringUtils.randomAlphabetic(4).toUpperCase();
		String timeStamp = time.toString().replace(":","").replace(" ","").concat(sub);
		try{
			Robot robot = new Robot();
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect = new Rectangle(screen);
		BufferedImage img = robot.createScreenCapture(rect);
		File desc  =  new File("C:\\Users\\aravinthprasath.e\\Desktop\\"+timeStamp+".png"); 
		try{
			ImageIO.write(img, "png", desc);
		}catch(IOException e)
		{
		 e.printStackTrace();
		}
		}catch (AWTException e) {
			e.getStackTrace();
		}
		
		
	}
	
	public void ShootFull(WebDriver driver) //To take a full screenshot using AShot().
	{
		//
		Calendar cal = Calendar.getInstance();
		Date time = cal.getTime();
		String sub  = RandomStringUtils.randomAlphabetic(4).toUpperCase();
		String timeStamp = time.toString().replace(":","").replace(" ","").concat(sub);
		ShootingStrategy shoot = ShootingStrategies.viewportPasting(200);
		Screenshot shootimg = new AShot().shootingStrategy(shoot).takeScreenshot(driver);
		BufferedImage img = shootimg.getImage();
		File desc  =  new File("C:\\Users\\aravinthprasath.e\\Desktop\\"+timeStamp+".png"); 
		try {
			ImageIO.write(img, "png", desc);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public void ShootAnElement(WebDriver driver) //To take a screenshot of a particular element using AShot().
	{
		Calendar cal = Calendar.getInstance();
		Date time = cal.getTime();
		String sub  = RandomStringUtils.randomAlphabetic(4).toUpperCase();
		String timeStamp = time.toString().replace(":","").replace(" ","").concat(sub);
		WebElement element = driver.findElement(By.xpath("//img[@class='national_emblem']"));
		ShootingStrategy shoot = ShootingStrategies.viewportPasting(200);
		Screenshot shootimg = new AShot().shootingStrategy(shoot).takeScreenshot(driver, element);
		BufferedImage img = shootimg.getImage();
		File desc  =  new File("C:\\Users\\aravinthprasath.e\\Desktop\\"+timeStamp+".png"); 
		try {
			ImageIO.write(img, "png", desc);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {		
		ScreenShots obj = new ScreenShots();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://msme.gov.in/");
		obj.SnapUsing(driver);
		obj.CaptureAnElement(driver);
		obj.fullcapture(driver);
		obj.ShootFull(driver);
		obj.ShootAnElement(driver);
		driver.close();	

	}

}

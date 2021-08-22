package com.SeleniumMaven;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestScreenShot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		//file
		
	File sourceFile = driver.getScreenshotAs(OutputType.FILE);
	File destFile = new File("./Screenshots/img1.jpg");
	FileUtils.copyFile(sourceFile, destFile);
	System.out.println("ss saved Succcesfully");
	driver.quit();

	}

}

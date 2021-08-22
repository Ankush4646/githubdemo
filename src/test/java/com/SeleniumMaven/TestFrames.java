package com.SeleniumMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFrames {

	public static void main(String[] args) throws  Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.id("name")).sendKeys("Text1");
		Thread.sleep(3000);
		driver.switchTo().frame("frm1");
		
		Select courseName_dd = new Select(driver.findElement(By.id("course")));
		courseName_dd.selectByVisibleText("Java");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frm2");
		driver.findElement(By.id("firstName")).sendKeys("Ankushavali");
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();//main
		
		driver.switchTo().frame("frm1");
		courseName_dd.selectByVisibleText("Dot Net");
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Text2");
		Thread.sleep(3000);
		
		driver.switchTo().frame("frm3");
		driver.findElement(By.id("name")).sendKeys("Mohammed");
		Thread.sleep(5000);
//		driver.switchTo().defaultContent();
//		
//		driver.findElement(By.id("name")).clear();
//		driver.findElement(By.id("name")).sendKeys("Text1");
//		


	}

}

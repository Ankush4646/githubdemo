package com.SeleniumMaven;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowTabs {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		//single window
		String ParentWindowHandle = driver.getWindowHandle();
		System.out.println("parent window handle -"+ParentWindowHandle + driver.getTitle());
		driver.findElement(By.id("newTabBtn")).click();
		Thread.sleep(3000);
	Set<String>	windowHandles = driver.getWindowHandles();
	for (String windowHandle: windowHandles) {
		if(!windowHandle.equals(ParentWindowHandle)) {
			driver.switchTo().window(windowHandle);
			System.out.println(driver.findElement(By.id("output")).getText());
			driver.findElement(By.id("alertBox")).click();
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
			System.out.println(driver.findElement(By.id("output")).getText());

Thread.sleep(3000);
driver.close();
			
		}
		
		//System.out.println(windowHandle + driver.getTitle());
		
	}
driver.switchTo().window(ParentWindowHandle);
driver.findElement(By.id("name")).sendKeys("Ankushavali");
Thread.sleep(3000);

	driver.quit();
	}

}

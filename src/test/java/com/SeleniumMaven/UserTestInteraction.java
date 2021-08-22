package com.SeleniumMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserTestInteraction {

	public static void main(String[] args) throws InterruptedException {  
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	      // Puts a Implicit wait, Will wait for 10 seconds before throwing exception
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
     driver.navigate().to("http://www.calculator.net/mortgage-calculator.html");
     driver.manage().window().maximize();
     
     //Click on check Box
     driver.findElement(By.id("caddoptional")).click();
     
     System.out.println("The Output of the IsSelected " +
        driver.findElement(By.id("caddoptional")).isSelected());      
     System.out.println("The Output of the IsEnabled " +
        driver.findElement(By.id("caddoptional")).isEnabled());
     System.out.println("The Output of the IsDisplayed " +
        driver.findElement(By.id("caddoptional")).isDisplayed());
     
     driver.close();
	}
	}
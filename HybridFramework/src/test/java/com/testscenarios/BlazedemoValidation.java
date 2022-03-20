package com.testscenarios;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.objectrepository.Locators;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BlazedemoValidation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//Create reference for locators class
		Locators loc =new Locators();
		
		driver.get("https://blazedemo.com/");
	//	driver.findElement(loc.Fblogin_Email_Editbox).sendKeys("abcdefgh@gmail.com");
	//	driver.findElement(loc.Fblogin_Password_Editbox).sendKeys("pqrstuvw");
	//	driver.findElement(loc.Fblogin_login_Button).click();
		Thread.sleep(1500);
		Select nameFrom = new Select(driver.findElement(By.name("fromPort")));	
		nameFrom.selectByValue("Boston");
		
		
		Thread.sleep(1000);
		Select nameTo = new Select(driver.findElement(By.name("toPort")));	
		nameTo.selectByValue("London");
		
	//	driver.findElement(loc.Fblogin_login_Button).click();
		
		driver.findElement(By.xpath("//input[@type='submit']")).click()	;	
		
		driver.findElement(By.xpath("//input[@type='submit']")).click()	;	
		
		//driver.findElement(loc.Fblogin_Email_Editbox).sendKeys("abcdefgh@gmail.com");
		Thread.sleep(1000);
		driver.findElement(loc.BlazedemoValidation_inputName).sendKeys("Aaryan");

		driver.findElement(loc.BlazedemoValidation_inputAddress).sendKeys("123, Carol Street");
		
		driver.findElement(loc.BlazedemoValidation_inputcity).sendKeys("Toronto");
		driver.findElement(loc.BlazedemoValidation_inputstate).sendKeys("Ontario");
		driver.findElement(loc.BlazedemoValidation_inputzipCode).sendKeys("N2T0G5");
		driver.manage().window().maximize();
		Thread.sleep(1500);
	    Select cardType = new Select(driver.findElement(By.name("cardType")));	
		cardType.selectByVisibleText("American Express");
		driver.findElement(loc.BlazedemoValidation_creditCardNumber).sendKeys("3333111122224444");
		
		driver.findElement(loc.BlazedemoValidation_creditCardMonth).sendKeys("12");
		driver.findElement(loc.BlazedemoValidation_nameOnCard).sendKeys("Aaryan");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@type='submit']")).click()	;	
		
	}

}

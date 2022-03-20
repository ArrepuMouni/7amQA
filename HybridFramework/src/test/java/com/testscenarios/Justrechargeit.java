package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.objectrepository.JrcLocators;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Justrechargeit{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//Create reference for locators class
		JrcLocators loc =new JrcLocators();
		
		
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		driver.findElement(loc.Justrechargeit_login_Email_Editbox).sendKeys("test@gmail.com");
		driver.findElement(loc.Justrechargeit_login_password_Editbox).sendKeys("xyz");
		driver.findElement(loc.Justrechargeit_login_entercaptcha_Editbox).sendKeys("10");
		driver.findElement(loc.Justrechargeit_login_securesignin_Button).click();
		}
		

	}


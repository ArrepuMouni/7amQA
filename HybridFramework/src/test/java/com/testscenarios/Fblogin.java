package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.objectrepository.Locators;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Fblogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//Create reference for locators class
		Locators loc =new Locators();
		
		
		driver.get("https://www.facebook.com/");
		driver.findElement(loc.Fblogin_Email_Editbox).sendKeys("abcdefgh@gmail.com");
		driver.findElement(loc.Fblogin_Password_Editbox).sendKeys("pqrstuvw");
		driver.findElement(loc.Fblogin_login_Button).click();

	}

}

package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.objectrepository.Locators;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FBEmailEdit {
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.facebook.com/");
		
	  String alertTextResult=driver.findElement(By.id("email")).getAttribute("placeholder");
		
	  System.out.println("alert message is : " + alertTextResult);
  }
}

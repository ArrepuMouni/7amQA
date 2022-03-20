package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.objectrepository.Locators;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fbText {
  @Test
  public void f() throws InterruptedException {
	  
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//Create reference for locators class
		Locators loc =new Locators();
		driver.get("https://google.com/");
		Thread.sleep(1500);
		String text = new String();
		driver.findElement(By.name("btnI")).getAttribute(text);
		System.out.println(text);
  }
}

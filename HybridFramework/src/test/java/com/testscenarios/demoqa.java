package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.objectrepository.Locators;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoqa {
  @Test
  public void f() throws Exception {
  
	// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://demoqa.com/alerts");
			driver.findElement(By.id("alertButton")).click();
			
			//1st alert message
			String alertText1=driver.switchTo().alert().getText();
			System.out.println("1st alert message is : " + alertText1);
			Thread.sleep(5000);
			
			driver.switchTo().alert().accept();
			
			Thread.sleep(5000);
			driver.navigate().refresh();
			
			driver.findElement(By.id("timerAlertButton")).click();
			Thread.sleep(5000);
			
			//2nd alert message
			String alertText2 = driver.switchTo().alert().getText();
			System.out.println("2nd alert message is : " + alertText2);
	        
			driver.switchTo().alert().accept();
	        Thread.sleep(6000);
	        
	        driver.findElement(By.id("confirmButton")).click();
	        Thread.sleep(5000);
	        
            //3rd alert message
			String alertText3 = driver.switchTo().alert().getText();
			System.out.println("3rd alert message is : " + alertText3);
	        
	        driver.switchTo().alert().accept();
	        Thread.sleep(5000);
	   	       
	    	
			String alertTextResult=driver.findElement(By.id("confirmResult")).getText();
			System.out.println("alert message is : " + alertTextResult);
	        
			
	        driver.findElement(By.id("confirmButton")).click();
	        Thread.sleep(5000);
	        
	        driver.switchTo().alert().dismiss();
	     	String alertTextResultCancel=driver.findElement(By.id("confirmResult")).getText();
			System.out.println("alert message is : " + alertTextResultCancel);
	     
			Thread.sleep(5000);
			
			driver.findElement(By.id("promtButton")).click();
			
			//Need to complete enter text 
			
  }
  
  
}

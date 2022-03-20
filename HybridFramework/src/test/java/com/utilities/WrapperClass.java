package com.utilities;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WrapperClass extends  BaseClass  { 

	//Browser launch
	
	public void chromeBrowserLaunch() {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		
	}
}

	
	


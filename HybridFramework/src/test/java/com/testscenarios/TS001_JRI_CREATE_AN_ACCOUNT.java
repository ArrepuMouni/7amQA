package com.testscenarios;

import org.testng.annotations.Test;

import com.objectrepository.Locators;
import com.utilities.BaseClass;
import com.utilities.WrapperClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;


public class TS001_JRI_CREATE_AN_ACCOUNT extends  WrapperClass {
  
	Locators loc= new Locators();
	@Test
	public void f() {
  
	  chromeBrowserLaunch();
	  driver.get("");
  
  }
  

}

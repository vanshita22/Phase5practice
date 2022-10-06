package com.simplilearn.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class FacebookLogin {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("vanshitamittal@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("vanshita@123");
		driver.findElement(By.name("login")).submit();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\amit\\Downloads\\chromedriver_win32/chromedriver.exe");
	//instance webdriver with chrome driver object
			 driver = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  driver=null;
  }

}

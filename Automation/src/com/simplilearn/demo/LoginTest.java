package com.simplilearn.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amit\\Downloads\\chromedriver_win32/chromedriver.exe");
		//instance webdriver with chrome driver object
				WebDriver driver = new ChromeDriver();
				String url="https://profile.oracle.com/myprofile/account/create-account.jspx";
				driver.get(url);
				
				driver.manage().window().maximize();
				
				System.out.println("Title:"+driver.getTitle());
				
				System.out.println("------------------------");
				
				
				
				WebElement email=driver.findElement(By.name("sView1:r1:0:email"));
				System.out.println(email.getAttribute("name"));
				email.sendKeys("uchihaitachi@gmail.com");
				
				
				WebElement pass=driver.findElement(By.name("sView1:r1:0:password"));
				System.out.println(pass.getAttribute("name"));
				pass.sendKeys("uzumakiNaruto@Hokage");
				
				WebElement repass=driver.findElement(By.name("sView1:r1:0:retypePassword"));
				System.out.println(repass.getAttribute("name"));
				repass.sendKeys("uzumakiNaruto@Hokage");
				
				WebElement country=driver.findElement(By.name("sView1:r1:0:country"));
				System.out.println(country.getAttribute("name"));
				country.sendKeys("India");
				
				WebElement fname=driver.findElement(By.name("sView1:r1:0:firstName"));
				System.out.println(fname.getAttribute("name"));
				fname.sendKeys("Vanshita");
				
				WebElement lname=driver.findElement(By.name("sView1:r1:0:lastName"));
				System.out.println(lname.getAttribute("name"));
				lname.sendKeys("Mittal");

				WebElement jobtitle=driver.findElement(By.name("sView1:r1:0:jobTitle"));
				System.out.println(jobtitle.getAttribute("name"));
				jobtitle.sendKeys("Engineer");
				
				WebElement phone=driver.findElement(By.name("sView1:r1:0:workPhone"));
				System.out.println(phone.getAttribute("name"));
				phone.sendKeys("1234567890");
				
				WebElement company=driver.findElement(By.name("sView1:r1:0:companyName"));
				System.out.println(company.getAttribute("name"));
				company.sendKeys("mphasis"); 
				
				WebElement address=driver.findElement(By.name("sView1:r1:0:address1"));
				System.out.println(address.getAttribute("name"));
				address.sendKeys("avinash pride");
				
				
				WebElement city=driver.findElement(By.name("sView1:r1:0:city"));
				System.out.println(city.getAttribute("name"));
				city.sendKeys("Raipur");
				
				WebElement state=driver.findElement(By.name("sView1:r1:0:state"));
				System.out.println(state.getAttribute("name"));
				state.sendKeys("Chhatisgarh");
				
				WebElement zipcode=driver.findElement(By.name("sView1:r1:0:postalCode"));
				System.out.println(zipcode.getAttribute("name"));
				zipcode.sendKeys("494099");
				
				
				
				
				System.out.println("successfully submitted");
				
			}
				

	}



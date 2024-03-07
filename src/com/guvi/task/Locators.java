package com.guvi.task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.guvi.in/register");		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));
		
		// locating by id
		WebElement fname= driver.findElement(By.id("name"));
		fname.sendKeys("Mani");
		
		//locating by xpath
		WebElement email= driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("testusernew416@gmail.com");
		
		// locating by cssselector
		WebElement pwrd= driver.findElement(By.cssSelector("input[class='form-control password-err']"));
		pwrd.sendKeys("Password@1");
	 
		//locating by classname
		WebElement country= driver.findElement(By.className("iti__selected-flag"));
		country.click();
		
		WebElement selcountry= driver.findElement(By.xpath("//span[contains(text(),'United States')]"));
		selcountry.click();
		
		WebElement phn= driver.findElement(By.xpath("//input[@class='form-control countrycode-left']"));
		phn.sendKeys("0761234568");
		
		System.out.println("All fileds are filled");
		
		//locating by linktext
		WebElement signup= driver.findElement(By.linkText("Sign Up"));
		signup.click();
		
		System.out.println("Clicked on sign up button");
	
	}

}

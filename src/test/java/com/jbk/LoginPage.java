package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public void Testdta() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		WebElement TxtUserName = driver.findElement(By.id("user-name"));
		TxtUserName.sendKeys("standard_user");
		WebElement TxtPassword = driver.findElement(By.id("password"));
		TxtPassword.sendKeys("secret_sauce");
		WebElement clickbtn = driver.findElement(By.id("login-button"));
		clickbtn.click();
		
		driver.quit();
	}
}

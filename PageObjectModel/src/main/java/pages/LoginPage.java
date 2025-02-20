package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage enterUser() {
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		return this;
	}
	
	public LoginPage enterPwd() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		return this;
	}
	
	public WelcomePage clickLogin() {
		
		driver.findElement(By.className("decorativeSubmit")).click();

		return new WelcomePage();
		
	}

}

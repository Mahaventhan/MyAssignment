package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class CreateAccountPage extends BaseClass{
	
	public ViewAccountPage createAccount() {
		
		driver.findElement(By.partialLinkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("ABC Inc");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		driver.findElement(By.id("numberEmployees")).sendKeys("200");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.className("smallSubmit")).click();
		String titleActual = driver.getTitle();
		System.out.println("Account Title \"" +titleActual+"\"");
		if(titleActual.contains("Account")) {
			System.out.println("Title verification Pass");
		
		}else {
			System.out.println("Title verification Fail");
		}
		
		return new ViewAccountPage();
	}

}

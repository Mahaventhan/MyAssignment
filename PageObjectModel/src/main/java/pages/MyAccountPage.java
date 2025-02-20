package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class MyAccountPage extends BaseClass {
	
	public CreateAccountPage accountPage() {
		
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		
		return new CreateAccountPage();
	}

}

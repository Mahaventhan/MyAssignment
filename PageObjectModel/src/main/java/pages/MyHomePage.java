package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class MyHomePage extends BaseClass {
	
	public MyAccountPage homePage() {
		
		WebElement pageName = driver.findElement(By.id("sectionHeaderTitle_myHome"));
		if((pageName.getText()).contains("Home")) {
		System.out.println("The Home page is verified");	
		}
		else {
			System.out.println("The page is not match");
		}
		
		return new MyAccountPage();
	}

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class ViewAccountPage extends BaseClass {

	public ViewAccountPage viewAccount() {
		
		WebElement accountName = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]"));
		if ((accountName.getText().contains("ABC"))) {
			System.out.println("The account name is verified ");
		}else {
			System.out.println("The account name is not match");
			
		}
		
		return this;
	}
}

package week5.assignment_W5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 extends ProjectSpecificMethod {
	@Test
	public void createLegal() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@name='Name']/parent::div"))
				.sendKeys("Salesforce Automation by Mahaventhan");
		driver.findElement(By.xpath("//button[@name='SaveEdit']/parent::lightning-button")).click();

		String entityText = driver
				.findElement(By.xpath("(//lightning-formatted-text[contains(text(),'Mahaventhan')])[2]")).getText();
		String acrualText = "Salesforce Automation by Mahaventhan";
		Assert.assertEquals(entityText, acrualText);
	
	}
}
		




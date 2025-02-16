package week5.assignment_W5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase2 extends ProjectSpecificMethod {

	@Test
	public void testCase2() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@name='Name']/parent::div"))
				.sendKeys("Salesforce Automation by Mahaventhan");
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
		WebElement status = driver
				.findElement(By.xpath("//button[contains(@class,'slds-combobox__input slds-input_faux')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", status);
		Thread.sleep(3000);
		status.click();
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Active']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']/parent::lightning-button")).click();
		String message = driver
				.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"))
				.getText();
		System.out.println("Message: " + message);
		if (message.contains("Mahaventhan")) {
			System.out.println("Pass: The name is displayed for this Alert");
		} else {
			System.out.println("Fail: The name is not displayed for this Alert");
		}
	}
}

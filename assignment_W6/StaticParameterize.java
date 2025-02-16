package week6.assignment_W6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import TestNG.BaseClass;

public class StaticParameterize  {
	public RemoteWebDriver driver;
	
	@Test
	@Parameters({"browser","url","userName","password"})
	public  void createEntity(String browser,String url,String uname,String pwd) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver(option);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		driver.findElement(By.xpath("//div[@id='username_container']/input[1]")).sendKeys(uname);
		driver.findElement(By.xpath("//form[@id='login_form']/input[1]")).sendKeys(pwd);
		driver.findElement(By.xpath("//form[@id='login_form']/input[2]")).click();
		Thread.sleep(3000);
		WebElement button = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
		button.click();
		driver.findElement(By.xpath("(//div[@class='DESKTOP uiContainerManager']//button)[2]")).click();Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Legal Entities"); //Legal Entities
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[@class='slds-truncate']/mark")).click();

		// click on the dropdown
		WebElement dropDown = driver.findElement(By.xpath(
				"//div[@class='slds-context-bar__label-action slds-p-left_none slds-p-right_x-small']//a[@role='button']//lightning-primitive-icon[@exportparts='icon']//*[name()='svg']"));
		dropDown.click();
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("(//*[name()='svg'][@class='slds-icon slds-icon-text-default slds-icon_x-small'])[1]"))
				.click();
		
		//Enter the details
		
		driver.findElement(By.xpath("//input[@name='Name']/parent::div"))
				.sendKeys("Mahaventhan");
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		//driver.findElement(By.xpath("//button[@name='SaveEdit']/parent::lightning-button")).click();
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

package week5.assignment_W5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class ProjectSpecificMethod {
	
	public  ChromeDriver driver;
	
	@BeforeMethod
	public void preCondition() throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//div[@id='username_container']/input[1]")).sendKeys("vidyar@testleaf.com");
		driver.findElement(By.xpath("//form[@id='login_form']/input[1]")).sendKeys("Sales@123");
		driver.findElement(By.xpath("//form[@id='login_form']/input[2]")).click();
		Thread.sleep(3000);
		WebElement button = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']/parent::button"));
		button.click();
		driver.findElement(By.xpath("(//div[@class='DESKTOP uiContainerManager']//button)[2]")).click();
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Legal Entities");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[@class='slds-truncate']/mark")).click();

		// clcik on the dropdown
		WebElement dropDown = driver.findElement(By.xpath(
				"//div[@class='slds-context-bar__label-action slds-p-left_none slds-p-right_x-small']//a[@role='button']//lightning-primitive-icon[@exportparts='icon']//*[name()='svg']"));
		dropDown.click();
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("(//*[name()='svg'][@class='slds-icon slds-icon-text-default slds-icon_x-small'])[1]"))
				.click();
		
	}
	
	//@AfterMethod
	public void postCondition() {
		
		driver.close();
		
	}

}

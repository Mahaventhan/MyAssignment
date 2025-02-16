package week6.assignment_W6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class dynamicParamterize {
	
	public RemoteWebDriver driver;
	@Test(dataProvider = "fetchdata")
	//@Parameters({"browser","url","userName","password"})
	public void dynamic(String name) throws InterruptedException {
		
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
		WebElement button = driver.findElement(By.xpath("(//button[@title='App Launcher'])[1]"));
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
		.sendKeys(name);
driver.findElement(By.xpath("//button[@name='SaveEdit']/parent::lightning-button")).click();

String entityText = driver
		.findElement(By.xpath("(//lightning-formatted-text[@slot='outputField'])[1]")).getText();
//String acrualText = "Salesforce Automation by Mahaventhan";
//String acrualText1 = "Salesforce Automation by Mithran";
if (entityText.contains("Mahaventhan")) {
System.out.println("The Name is :" +entityText);	
	
}else if (entityText.contains("Mithran")) {
	System.out.println("The Name is: "+entityText);
}
	else {
		System.out.println("The Name is not found");
}
//Assert.assertEquals(entityText, acrualText);
driver.close();
	}
//dynamic values

@DataProvider(name="fetchdata")
public String[][] sendData() {
	
	String [] [] data = new String [2] [1];
	data [0][0]="Salesforce Automation by Mahaventhan";
	
	data [1][0]="Salesforce Automation by Mithran";
	
	return data;
}


}

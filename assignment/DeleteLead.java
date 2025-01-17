package week2.assignment;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.id("button")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		
		//Delete lead
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneCountryCode")).clear();
		driver.findElement(By.name("phoneCountryCode")).sendKeys("91");
		driver.findElement(By.name("phoneAreaCode")).sendKeys("123");
		driver.findElement(By.name("phoneNumber")).sendKeys("456789");
		WebElement buttonClick = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		buttonClick.click();
		WebElement leadID =  driver.findElement(By.partialLinkText("103"));
		String leadNo = leadID.getText();
		System.out.println("Lead ID :" +leadNo);
		
		//View lead
		leadID.click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadNo);
		driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();  Thread.sleep(3000);
		
		//verified message
		String verifiedMessage = "No records to display";
		String verified = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println("Verified Message :" +verified);

		assertEquals(verified, verifiedMessage);
		driver.close();
		
	}

}

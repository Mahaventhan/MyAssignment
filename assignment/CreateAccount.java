package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class CreateAccount {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.id("button")).click();
		driver.findElement(By.partialLinkText("Accounts")).click();
		driver.findElement(By.partialLinkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("ABC Inc");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		driver.findElement(By.id("numberEmployees")).sendKeys("200");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.className("smallSubmit")).click();
		String titleActual = driver.getTitle();
		System.out.println("Account Title \"" +titleActual+"\"");
		String titleExpected ="Create Account | opentaps CRM";
		if(titleActual.equals(titleExpected)) {
			System.out.println("Title verification Pass");
		
		}else {
			System.out.println("Title verification Fail");
			
			System.out.println("Expected title :" +titleExpected+ " But got actual title :" +titleActual);
		}
		
		driver.close();
		
		
	}

}

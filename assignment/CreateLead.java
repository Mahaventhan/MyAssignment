package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {
	
public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.id("button")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Alex");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Carol");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("XYZ Ltd");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("MR");
		driver.findElement(By.className("smallSubmit")).click();
		String titleActual = driver.getTitle();
		System.out.println("Account Title \"" +titleActual+"\"");
		String titleExpected ="View Lead | opentaps CRM";
		if(titleActual.equals(titleExpected)) {
			System.out.println("Title verification Pass");
		
		}else {
			System.out.println("Title verification Fail");
			
			System.out.println("Expected title :" +titleExpected+ " But got actual title :" +titleActual);
		}
		
		driver.close();

}

}


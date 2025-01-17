package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountSelectClass {

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
		driver.findElement(By.id("accountName")).sendKeys("Test Inc");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select ind = new Select(industry);
		ind.selectByIndex(3);
		
		WebElement ownerShip = driver.findElement(By.name("ownershipEnumId"));
		Select own = new Select(ownerShip);
		own.selectByVisibleText("S-Corporation");
		
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select s = new Select(source);
		s.selectByValue("LEAD_EMPLOYEE");
		
		WebElement campaign = driver.findElement(By.id("marketingCampaignId"));
		Select cam = new Select(campaign);
		cam.selectByIndex(6);
		
		WebElement province = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select p = new Select(province);
		p.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		 String accountNameActual = driver.findElement(By.id("accountName")).getAttribute("value");
		 System.out.println("Account Name :" +accountNameActual);
		 String accountNameExpected = "Test Inc";
		 
		 if(accountNameActual.equals(accountNameExpected)) {
				System.out.println("Account name verification Pass");
			
			}else {
				System.out.println("Title verification Fail");
				
				System.out.println("Expected Account name :" +accountNameExpected+ " But got actual account name :" +accountNameActual);
			}
			
			driver.close();
		
	
}
}

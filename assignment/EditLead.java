package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		// Mandatory details
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Php Inc");
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Jack");
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("William");
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("JackW");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Accounts");
		WebElement description = driver.findElement(By.id("createLeadForm_description"));
		description.sendKeys("They are currently using Quickbooks");
		driver.findElement(By.xpath("(//input[@name='primaryEmail'])[4]")).sendKeys("JackW@php.com");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select option = new Select(state);
		option.selectByVisibleText("South Carolina");
		driver.findElement(By.className("smallSubmit")).click();
		// Edit lead
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("they have more than 90 reps");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		String currentPage = driver.getTitle();
		System.out.println("Current page title :" + currentPage);
		driver.close();

	}

}

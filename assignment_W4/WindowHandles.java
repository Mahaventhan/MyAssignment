package week4.assignment_W4;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.id("button")).click();
		driver.findElement(By.partialLinkText("Contacts")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
	String mainWindow = driver.getWindowHandle();
		for (String windowHandle : driver.getWindowHandles()) {
			
			driver.switchTo().window(windowHandle);
		}
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		
		driver.switchTo().window(mainWindow);
		
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		for (String string : driver.getWindowHandles()) {
			driver.switchTo().window(string);
		}
		driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
		
		driver.switchTo().window(mainWindow);
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		
		String title = driver.getTitle();
		if(title.contains("View Contact")) {
			System.out.println("Merge successful");
		}else {
			System.out.println("Merge failed");
		}
	}

}

package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class InteractionsWithCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		String expectedMsg = "Checked";
		String actualMsg = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		Assert.assertEquals(actualMsg,expectedMsg);
		
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[6]")).click();
		String expectedMsg1 = "State = 1";
		String actualMsg1 = driver.findElement(By.xpath("(//p[text()='State = 1'])[1]")).getText();
		Assert.assertEquals(actualMsg1,expectedMsg1); Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//div[@class='ui-toggleswitch-slider'])[1]")).click();
		String expectedMsg2 = "Checked";
		String actualMsg2 = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		Assert.assertEquals(actualMsg2,expectedMsg2);
		
		boolean disable = driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[3]")).isEnabled();
		if (disable) {
			System.out.println("The button is disable");
		} else {
		}
		
		driver.findElement(By.xpath("//ul[@class='ui-selectcheckboxmenu-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-all']")).click();
		driver.findElement(By.xpath("(//label[text()='Miami'])[2]")).click();
		driver.findElement(By.xpath("(//a[@aria-label='Close'])[1]")).click();
		
		
	 String countryNameActual = driver.findElement(By.xpath("//span[@class='ui-selectcheckboxmenu-token-label']")).getText();
	 String countryNameExpected ="Miami";
	 Assert.assertEquals(countryNameActual,countryNameExpected);
	 driver.close();
	}

}

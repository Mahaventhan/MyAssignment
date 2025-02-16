package week5.assignment_W5;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.bson.assertions.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Action1 {
@Test
	public  void amazon() throws InterruptedException, IOException {
	
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-aruguments");
		option.addArguments("--start-maximized");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		WebElement searchBox = driver.findElement(By.id("nav-search-submit-button"));
	//	searchBox.click();
		Actions actions = new Actions(driver);
		actions.moveToElement(searchBox).click().perform();
		
		//First product price
		String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("First product price: "+price);
		
		//first product review
		String rating = driver.findElement(By.xpath("(//span[@class='a-icon-alt'])[1]")).getText();
		System.out.println("First product rating: "+rating);
		
		//click first product
		WebElement firstProduct = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]"));
		firstProduct.click();
		
	
			Set<String> windowHandles = driver.getWindowHandles();
	        for (String windowHandle : windowHandles) {
	            if (!windowHandle.equals(driver.getWindowHandle())) {
	                driver.switchTo().window(windowHandle); // Switch to the new window
	                break;
	            }
	        }
			Thread.sleep(3000);

			//Take screenshot
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(screenshotFile, new File("product_screenshot.png"));
	       
	        
	        //click on the add cart
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
	        
	        String subTotal = driver.findElement(By.xpath("(//span[@id='attach-accessory-cart-subtotal'])[1]")).getText();
	        System.out.println("Subtotal price: " +subTotal);  
	        if (price.contains(subTotal)) {
				System.out.println("Subtotal is match");
			} else {
				System.out.println("Subtotal is not match");
			}
	        
	        
	        
}
		
		
      
		

	
}

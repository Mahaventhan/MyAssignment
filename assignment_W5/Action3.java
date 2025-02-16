package week5.assignment_W5;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Action3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-aruguments");
		option.addArguments("--start-maximized");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.snapdeal.com/");

		WebElement mensFashion = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(mensFashion).perform();

		WebElement sportsShoes = driver.findElement(By.xpath("//span[text()='Sports Shoes']"));
		sportsShoes.click();

		List<WebElement> shoeCount = driver.findElements(By.xpath("//p[@class='product-title']"));
		System.out.println("Total Sports Shoes: " + shoeCount.size());

		WebElement trainingShoes = driver.findElement(By.xpath("//div[text()='Training Shoes']"));
		trainingShoes.click();

		WebElement sortDropdown = driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']"));
		sortDropdown.click();
		WebElement lowToHigh = driver.findElement(By.xpath("//li[@data-sorttype='plth']"));
		lowToHigh.click();

Thread.sleep(3000);		
		  WebElement product1 =
		  driver.findElement(By.xpath("//span[contains(@class,'lfloat product-desc-price')]/following-sibling::span"));
		  String productPrice1 = product1.getText(); 
		  System.out.println(productPrice1);
			
			  String trimPrice1 = productPrice1.replace("Rs.", "").replace(",", "").trim();
			  System.out.println(trimPrice1); int int1 = Integer.parseInt(trimPrice1);
			  WebElement product2 =
			  driver.findElement(By.xpath("(//span[@class='lfloat product-price'])[2]"));
			  String productPrice2 = product2.getText(); String trimPrice2 =
			  productPrice2.replace("Rs.", "").replace(",", "").trim();
			  System.out.println(trimPrice2); int int2 = Integer.parseInt(trimPrice2);
			 
		  
		  
			
			  if (int1<int2) { System.out.println("The items are sorted correctly"); } else
			  { System.out.println("The items are not sorted correctly"); }
			  
			  
			  WebElement from =
			  driver.findElement(By.xpath("(//input[@name='fromVal'])[1]")); from.clear();
			  from.sendKeys("500");
			  
			  WebElement to = driver.findElement(By.xpath("(//input[@name='toVal'])[1]"));
			  to.clear(); to.sendKeys("700");
			  
			  driver.findElement(By.
			  xpath("(//div[@class='price-go-arrow btn btn-line btn-theme-secondary'])[1]")
			  ).click();
			  
			  List<WebElement> appliedFilters =
			  driver.findElements(By.xpath("//div[@class='navFiltersPill']")); for
			  (WebElement filter : appliedFilters) { System.out.println("Applied Filter: "
			  + filter.getText()); }
			  
			  WebElement firstShoe =
			  driver.findElement(By.xpath("(//img[@class='product-image wooble'])[1]"));
			  actions.moveToElement(firstShoe).perform();
			  
			  WebElement quickView =
			  driver.findElement(By.xpath("(//div[contains(text(),'Quick View')])[1]"));
			  quickView.click();
			  
			  
			  WebElement cost = driver.findElement(By.xpath("//span[@class='payBlkBig']"));
			  WebElement discount =
			  driver.findElement(By.xpath("//span[@class='percent-desc ']"));
			  System.out.println("Cost: " + cost.getText());
			  System.out.println("Discount: " + discount.getText());
			  
			  File screenshot = ((TakesScreenshot)
			  driver).getScreenshotAs(OutputType.FILE); FileUtils.copyFile(screenshot, new
			  File("screenshot.png"));
			  
			  driver.close();
			 
		  
		 
	}

}

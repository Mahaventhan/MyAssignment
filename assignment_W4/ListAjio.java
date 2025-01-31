package week4.assignment_W4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListAjio {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//label[@for='Men']")).click(); Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		int size = driver.findElements(By.xpath("//div[@class='nameCls']")).size();
		System.out.println("itemCount -" +size);
		List<WebElement> brandName = driver.findElements(By.xpath("//div[@class='brand']//strong"));
		
		for (WebElement name : brandName) {
			System.out.println("Brand Name - "+name.getText());
		}
		
		List<WebElement> bagName = driver.findElements(By.xpath("//div[@class='nameCls']"));
		for (WebElement webElement : bagName) {
			
			System.out.println("Bag Name - " +webElement.getText());
		}
		
		
				}
}

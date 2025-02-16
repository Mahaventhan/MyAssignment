package week5.assignment_W5;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action2 {
	@Test
	public void bigbasket() throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-aruguments");
		option.addArguments("--start-maximized");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bigbasket.com/");

		driver.findElement(By.xpath("(//button[@id='headlessui-menu-button-:R5bab6:'])[1]")).click();

		WebElement category1 = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		Actions a = new Actions(driver);
		Thread.sleep(1000); 
		a.moveToElement(category1).perform();

		Thread.sleep(3000);

		WebElement riceMenu = driver.findElement(By.xpath("//a[contains(text(),'Rice & Rice Products')]"));
		a.moveToElement(riceMenu).perform();

		WebElement boiledRice = driver.findElement(By.xpath("//a[contains(text(),'Boiled & Steam Rice')]"));
		boiledRice.click();

		driver.findElement(By.xpath("(//input[@placeholder='Search here'])[1]")).sendKeys("bb Roya");
		driver.findElement(By.id("i-BBRoyal")).click();
		Thread.sleep(5000);

		  
		WebElement tamilPonniRice = driver
				.findElement(By.xpath("(//h3[contains(text(),'Tamil Ponni Boiled - Rice')])[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", tamilPonniRice);

		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
			if (!windowHandle.equals(driver.getWindowHandle())) {
				driver.switchTo().window(windowHandle); 
				break;
			}
			Thread.sleep(3000);

			   WebElement fiveKgBag = driver.findElement(By.xpath("//span[text()='5 kg']"));
		        fiveKgBag.click();

		        WebElement ricePrice = driver.findElement(By.xpath("//span[@class='Label-sc-15v1nk5-0 PackSizeSelector___StyledLabel5-sc-l9rhbt-5 gJxZPQ bvikaK']"));
		        System.out.println("Price rate: " + ricePrice.getText());

		        WebElement addToBasketButton = driver.findElement(By.xpath("(//button[text()='Add to basket'])[1]"));
		        addToBasketButton.click();

		  
		        WebElement successMessage = driver.findElement(By.xpath("//p[@class='mx-4 flex-1']"));
		        System.out.println("Product Added Message: " + successMessage.getText());

		       
		        driver.close();

		      
		        driver.quit();
		 
	}

}
	
}

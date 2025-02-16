package week5.assignment_W5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class WebTable {
	public static void main(String[] args) {
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://finance.yahoo.com/");
		WebElement moreTab = driver.findElement(By.xpath("//span[text()='More']"));
		Actions a = new Actions(driver);
		a.moveToElement(moreTab).build().perform();
		driver.findElement(By.xpath("(//a[text()='Crypto '])[3]")).click();
		//Locate table
		WebElement table = driver.findElement(By.xpath("//table[@class='markets-table freeze-col yf-paf8n5 fixedLayout']"));
		//Row Count 
		List<WebElement> rowCount = driver.findElements(By.xpath("//table[@class='markets-table freeze-col yf-paf8n5 fixedLayout']/tbody/tr"));
		 int size = rowCount.size();
		 System.out.println("Row Count: "+size);
		 //Header Name
		 List<WebElement> headValues = driver.findElements(By.xpath("//table[@class='markets-table freeze-col yf-paf8n5 fixedLayout']/thead/tr/th"));
		 for (WebElement headers : headValues) {
			String headerName = headers.getText();
		//	System.out.println("Header Name: "+headerName);
		}
		 //Crypto Name
		 List<WebElement> cryptoName = driver.findElements(By.xpath("//td[@class='cell tw-h-10 tw-py-0 tw-text-left yf-paf8n5']"));
		 for (WebElement Name : cryptoName) {
			String crypto = Name.getText();
			System.out.println("Crypto Name: "+crypto);
		}
		 
		 
	}

}

package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Test");
		driver.findElement(By.name("lastname")).sendKeys("A");
		driver.findElement(By.name("reg_email__")).sendKeys("test@ab.com");	
		driver.findElement(By.id("password_step_input")).sendKeys("12345678");
		
		WebElement day = driver.findElement(By.id("day"));
		Select option = new Select(day);
		option.selectByIndex(6);
		
		WebElement month = driver.findElement(By.id("month"));
		Select option2 = new Select(month);
		option2.selectByValue("12");
		
		WebElement year = driver.findElement(By.id("year"));
		Select option3 = new Select(year);
		option3.selectByVisibleText("1999");
		
		 WebElement gender = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		 gender.click();
		if( gender.isSelected()) {
			System.out.println("Gender is selected");
		}else {
			System.out.println("Gender is not selected");
		}
		
		
		
		

	}

}

package week4.assignment_W4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_List {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert a=driver.switchTo().alert();
		a.accept();
		String nameActual = driver.findElement(By.id("demo")).getText();
		System.out.println(nameActual);
		String nameExpected ="Hello Harry Potter! How are you today?";
		
		if(nameActual.contains(nameExpected)) {
			System.out.println("The name is match");
		}
		
		

	}

}

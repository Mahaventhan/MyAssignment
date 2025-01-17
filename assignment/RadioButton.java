package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		 WebElement browserButton = driver.findElement(By.xpath("(//label[text()='Chrome'])[1]"));
		 browserButton.click();

		 browserButton.click();
		 boolean selected = driver.findElement(By.xpath("(//input[@type='radio'])[12]")).isSelected();
		if(selected==true) {
			System.out.println("The radio button remains selected.");
		}else {
			System.out.println("The radio button is unselected.");
		}
		 
		WebElement ageGroup = driver.findElement(By.xpath("(//input[@type='radio'])[24]"));
		boolean selectedDef = ageGroup.isSelected();
		if(selectedDef) {
			System.out.println("The radio button remains selected by default.");
		}else {
			System.out.println("The radio button is unselected.");
		}
	}


}

package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonInteraction {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/button.xhtml");
		// 1.Verify that the title of the page is ‘dashboard.’
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String titleActual = driver.getTitle();
		System.out.println("Current title :\"" + titleActual + "\"");
		String titleExpected = "Dashboard";
		if (titleExpected.equals(titleActual)) {

			System.out.println("Title verification Pass");
		} else {
			System.out.println("Title verification Fail");

			System.out.println("Expected title :" + titleExpected + " But got actual title :" + titleActual);
		}
		driver.navigate().back();
		// 2.Check if the button with the text ‘Confirm if the button is disabled’ is
		// disabled.
		boolean disable = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).isEnabled();
		if (disable) {
			System.out.println("The button is disabled");
		} else {
			System.out.println("The button is not disable");
		}

		// 3.Find and print the position of the button with the text ‘Submit.’
		int xAxis = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).getLocation().getX();
		int yAxis = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).getLocation().getY();
		System.out.println("X Axis for 'Submit.' -" + xAxis);
		System.out.println("Y Axis for 'Submit.' -" + yAxis);

		// 4.Find and print the background color of the button with the text ‘Find the
		// Save button color.’
		WebElement saveButton = driver.findElement(By.xpath(
				"//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left ui-button-secondary mr-2 mb-2']"));
		String backgroundColor = saveButton.getCssValue("background");
		System.out.println("Background color for the save button :" + backgroundColor);

		// 5.Find and print the height and width of the button with the text ‘Find the
		// height and width of this button.’
		int height = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]")).getSize().height;
		int width = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]")).getSize().width;
		System.out.println("Height for the submit button :" + height);
		System.out.println("Width for the submit button :" + width);

		driver.close();
		
		
	}
	
	}



package week3.assignment_W3;

public class BasePage {
	
	public void  findElement(String element) {
		System.out.println("Finding the element :" +element);
	}
	
	public void clickElement(String element) {
		System.out.println("Clicking the element :" +element);
	}
	
	public void enterText(String text) {
		System.out.println("Message :" +text);
	}
	
	public void  performCommonTasks() {
		
		System.out.println("Perform - BasePage task");
		
	}
}

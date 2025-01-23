package week3.assignment_W3;

public class LoginPage extends BasePage {

public void  performCommonTasks() {
		
	System.out.println("Perform - LoginPage task");
		
	}

public static void main(String[] args) {
	
	BasePage page = new BasePage();
	page.findElement("SearchBox");
	page.clickElement("SearchButton");
	page.enterText("Matches record shown");
	page.performCommonTasks();
	System.out.println();
	LoginPage login = new LoginPage();
	login.findElement("Enter user name and password");
	login.clickElement("Click on the login button");
	login.enterText("Login Successfull");
	login.performCommonTasks();
}
}

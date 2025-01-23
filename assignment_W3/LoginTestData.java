package week3.assignment_W3;

public class LoginTestData extends TestData {
	
	public void enterUsername() {
		System.out.println("Enter UserName");
	}

	public void enterPassword() {
		System.out.println("Enter Password");
	}
	
	public static void main(String[] args) {
		
		LoginTestData test = new LoginTestData();
		test.enterUsername();
		test.enterPassword();
		test.enterCredentials();
		test.navigateToHomePage();
	
	}

}

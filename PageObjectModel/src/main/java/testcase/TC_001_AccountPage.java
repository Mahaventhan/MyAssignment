package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

@Test
public class TC_001_AccountPage  extends BaseClass{

	public void runLogin() {
		LoginPage login = new LoginPage();
		login.enterUser().enterPwd().clickLogin().welcome().homePage().accountPage().createAccount().viewAccount();
	}
	
}

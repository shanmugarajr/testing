package testRunner;

import org.testng.annotations.Test;

import baseClass.browserInititation;
import pageActions.login;
import pageActions.logout;
import pageActions.uat;

public class testRun extends browserInititation  {
	
	static login lg = new login();
	static uat ut = new uat();
	static logout lot = new logout();

	@Test
	public void TC001() {
		login.signinname(driver, "shanmugaraj.rethinam");
		login.signinpassword(driver, "rajaR%%44");
		login.signinbutton(driver);
		logout.signoutbutton(driver);

	}

}

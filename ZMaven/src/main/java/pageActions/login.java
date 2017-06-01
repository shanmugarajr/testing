package pageActions;

import identifiers.readIdentifiers;

import org.openqa.selenium.WebDriver;

import baseClass.browserInititation;

public class login extends browserInititation {
	

	static readIdentifiers element = new readIdentifiers();

	public static void signinname(WebDriver driver, String value) {
		element.element(driver, "username").sendKeys(value);
	}

	public static void signinpassword(WebDriver driver, String value) {
		element.element(driver, "password").sendKeys(value);
	}

	public static void signinbutton(WebDriver driver) {
		element.element(driver, "signinbutton").click();

	}

}

package pageActions;

import identifiers.readIdentifiers;

import org.openqa.selenium.WebDriver;

import baseClass.browserInititation;

public class uat extends browserInititation {

	readIdentifiers element = new readIdentifiers();

	public static void refresh(WebDriver driver) {
		driver.navigate().refresh();

	}

}

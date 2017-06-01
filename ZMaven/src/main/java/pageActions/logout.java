package pageActions;

import org.openqa.selenium.WebDriver;

import identifiers.readIdentifiers;
import baseClass.browserInititation;

public class logout extends browserInititation {

	static readIdentifiers element = new readIdentifiers();

	public static void signoutbutton(WebDriver driver) {
		element.element(driver, "signoutbutton").click();

	}

}

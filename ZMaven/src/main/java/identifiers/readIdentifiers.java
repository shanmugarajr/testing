package identifiers;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class readIdentifiers {
	public WebElement element(WebDriver driver, String identifierproperty) {
		try {
			FileInputStream fis = new FileInputStream(
					new File(
							System.getProperty(("user.dir"))
									+ "\\src\\main\\java\\propertiesfiles\\identifiers.properties"));

			Properties pro = new Properties();
			pro.load(fis);

			String readValue = pro.getProperty(identifierproperty);

			String[] identifervalue = readValue.split("~");
			String identifertype = identifervalue[0];
			String identifiervalue = identifervalue[1];
			System.out.println(identifertype);
			System.out.println(identifiervalue);

			switch (identifertype) {
			case "id":
				return driver.findElement(By.id(identifiervalue));
			case "xpath":
				return driver.findElement(By.xpath(identifiervalue));
			case "className":
				return driver.findElement(By.className(identifiervalue));
			case "css":
				return driver.findElement(By.cssSelector(identifiervalue));
			case "name":
				return driver.findElement(By.name(identifiervalue));
			}
		} catch (Throwable t) {
			System.out.println(t.getMessage());
		}
		return null;

	}

}

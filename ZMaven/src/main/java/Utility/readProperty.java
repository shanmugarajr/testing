package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readProperty {

	public static void propertyFileRead(String path) {
		try {
			FileInputStream fis = new FileInputStream(new File(
					System.getProperty(("user.dir")) + path));			
		}

		catch (Throwable t) {
			System.out.println(t.getMessage());
		}
		
		
	}
}

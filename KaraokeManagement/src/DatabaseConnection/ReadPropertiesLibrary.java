package DatabaseConnection;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author thanhtri - 1512605
 */
public class ReadPropertiesLibrary {
    
	public Properties readFileProperties(){
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("config.properties"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return properties; 
	}
}

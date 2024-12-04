package Com.Crm.fileutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesVTiger {
	public static String property(String key) throws IOException {
		// TODO Auto-generated method stub
Properties prop=new Properties();
FileInputStream fis=new FileInputStream("..//Com.Crm.vtigerE4//src//test//resources//Login.properties");
prop.load(fis);
String data=prop.getProperty(key);
return data;
	}
}

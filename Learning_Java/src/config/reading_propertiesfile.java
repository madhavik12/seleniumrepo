package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class reading_propertiesfile {

	public static void main(String[] args) throws IOException {
Properties p=new Properties();
System.out.println(System.getProperty("user.dir"));
FileInputStream fp=new FileInputStream(System.getProperty("user.dir")+"\\src\\config\\emp.properties");
p.load(fp);
System.out.println(p.getProperty("name"));


	}

}

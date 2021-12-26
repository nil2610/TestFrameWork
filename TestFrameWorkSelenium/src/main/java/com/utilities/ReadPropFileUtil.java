package com.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropFileUtil {
	
	public Properties prop;
	
	public Properties readProp(String propertiesFilePath) {
		prop = new Properties();
		try {
			FileInputStream fi = new FileInputStream(propertiesFilePath);
			prop.load(fi);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
}

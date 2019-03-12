package com.harish.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	
	protected Properties properties = null;
	protected ApplicationContext context = null;
	
	@BeforeClass
	public void loadConfig() throws IOException {
		if(properties == null) {
			properties = new Properties();
			InputStream input = new FileInputStream("src/main/resources/setup.properties");
			properties.load(input);
		}
		
		String beanType = properties.getProperty("loadbeans");
		
		if("web".equalsIgnoreCase(beanType)) {
			context = new ClassPathXmlApplicationContext("web-objects.xml");
		} else if("mobile".equalsIgnoreCase(beanType)) {
			context = new ClassPathXmlApplicationContext("mobile-objects.xml");
		}
		
	}

}

package webAutomation.support;

import webAutomation.utils.PropertyUtils;

public class Support {

	public String baseUrl;

	// Get the properties file with the baseUrl, user and pass,
	// will be available for any class
	public void getProperties() {
		this.baseUrl = PropertyUtils.getProperty("baseUrl");
	}

}

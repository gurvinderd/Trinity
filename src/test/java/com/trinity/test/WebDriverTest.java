package com.trinity.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.trinity.core.SelTestCase;
import com.trinity.dataobject.RegistrationData;
import com.trinity.pageobject.NewRegistrationPage;
import com.trinity.core.CustomVerification;

public class WebDriverTest extends SelTestCase {
	
	@Test//(dataProvider = "regData", dataProviderClass = RegistrationData.class)
	//public void newRegistration(RegistrationData registrationData)
	public void newRegistration() {
		RegistrationData registrationData = null;
		try {
			registrationData = new RegistrationData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get(appURL);
		NewRegistrationPage registration = PageFactory.initElements(driver, NewRegistrationPage.class);
		registration.registerNewUser(registrationData);
		assert driver.findElement(By.tagName("body"))
		.getText()
		.contains("Thank you for registering. "
				+ "You may now sign-in using the user name and password you've");
	}
	
	@Test
	public void softAssertion() {
		driver.get(appURL);
		CustomVerification customVerification = new CustomVerification();
		customVerification.verifyTrue("first name field is missing", driver.findElements(By.name("firstName")).size()==1);
		customVerification.checkForVerificationErrors();
	}
}

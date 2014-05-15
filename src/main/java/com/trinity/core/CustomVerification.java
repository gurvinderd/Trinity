package com.trinity.core;

import org.testng.Assert;
import org.testng.Reporter;

import com.thoughtworks.selenium.SeleneseTestBase;

public class CustomVerification extends SeleneseTestBase {
	private StringBuffer verificationErrors;
	
	public CustomVerification() {
		verificationErrors = new StringBuffer();
	}
	
	public void verifyTrue(String msg, Boolean b) {
		try {
			Assert.assertTrue(b.booleanValue());
		} catch (Exception e) {
			verificationErrors.append(e);
			Reporter.log(msg + "<b>");
		}
	}

	public void clearVerificationErros() {
		verificationErrors = new StringBuffer();
	}
	
	public void checkForVerificationErrors() {
		String verificationErrorString = verificationErrors.toString();
		// clear verificationErrors so that it is ready to test new verification
		clearVerificationErrors();
		if(!"".equals(verificationErrorString))
			fail(verificationErrorString);
	}
		
	}


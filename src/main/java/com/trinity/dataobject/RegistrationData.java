package com.trinity.dataobject;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.DataProvider;

public class RegistrationData {

	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String userName;
	private String country;
	private String email;
	private String password;
	private String confirmPassword;
	
	private Properties properties = new Properties();
	
	
	public RegistrationData() throws IOException {
		properties.load(RegistrationData.class.getResourceAsStream("/registrationdata.properties"));
		firstName = properties.getProperty(getFirstName());
		lastName = properties.getProperty(lastName);
		phoneNumber = properties.getProperty(phoneNumber);
		userName = properties.getProperty(userName);
		country = properties.getProperty(country);
		email = properties.getProperty(email);
		password = properties.getProperty(password);
		confirmPassword = properties.getProperty(confirmPassword);
	}
	
	/*@DataProvider(name = "regData")
	public static object[] getRegistrationData() throws IOException {
		return RegistrationData.class;
	}
	*/
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the confirmPassword
	 */
	public String getConfirmPassword() {
		return confirmPassword;
	}

	/**
	 * @param confirmPassword the confirnPassword to set
	 */
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	
}

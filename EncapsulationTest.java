/**
 * com.cashapona.oops.encapsulation on 30-may-2022
 */
package com.cashapona.oops.encapsulation.may30;
/**
 * @author Anuradha
 */
class UserMail{
	private String  username;
	private String password;
	/**
	 * @return the username
	 */
	String getUsername() {
		return username;
	}
	/**
	 * @return the password
	 */
	String getPassword() {
		return password;
	}
	/**
	 * @param username the username to set
	 */
	void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @param password the password to set
	 */
	void setPassword(String password) {
		this.password = password;
	}
}
public class EncapsulationTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//create object mail for UserMail class
		UserMail mail=new UserMail();
		//set username and password
		mail.setUsername("Aadvik Ram");
		mail.setPassword("aadvik");
		//get ussername and password
		System.out.println("Username : "+mail.getUsername());
		System.out.println("Password : "+mail.getPassword());
	}
}

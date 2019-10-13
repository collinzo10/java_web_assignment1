package bean;

import java.io.Serializable;

public class User implements Serializable {
	
	private String firstName, lastName, email, address, role, username, password;
	
	public User() {
		firstName = "";
		lastName = "";
		email = "";
		address= "";
		role = "";
		username = "";
		password = "";
	}
	
	public User(String firstName, String lastName, String email, String address, String role, String username, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.role = role;
		this.username = username;
		this.password = password;
	}

}

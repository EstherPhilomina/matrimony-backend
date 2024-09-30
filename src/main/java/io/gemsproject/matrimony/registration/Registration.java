package io.gemsproject.matrimony.registration;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Registration")
public class Registration {
	
	@Id
	private Number stId;
	private String name;
	private String password;
	private Number phonenumber;
	
	
	public Registration() {
		
	}
	
	public Registration(Number stId, String name, String password, Number phonenumber) {
		super();
		this.setUsername(name);
		this.stId = stId;
		this.setPhonenumber(phonenumber);
		this.setPassword(password);
	}

	public String getUsername() {
		return name;
	}

	public void setUsername(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Number getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(Number phonenumber) {
		this.phonenumber = phonenumber;
	}
	
}

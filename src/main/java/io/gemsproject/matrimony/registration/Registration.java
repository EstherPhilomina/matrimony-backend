package io.gemsproject.matrimony.registration;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Registration")
public class Registration {
	
	@Id
	private ObjectId _id;
	private String staffnumber;
	private String username;
	private String password;
	private Number phonenumber;
	
	
	public Registration() {
		
	}
	
	public Registration(String staffnumber, String username, String password, Number phonenumber) {
		super();
		this.setUsername(username);
		this.setStaffnumber(staffnumber);
		this.setPhonenumber(phonenumber);
		this.setPassword(password);
	}
	public String getStaffnumber() {
		return staffnumber;
	}

	public void setStaffnumber(String staffnumber) {
		this.staffnumber = staffnumber;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

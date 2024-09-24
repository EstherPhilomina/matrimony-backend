package io.gemsproject.matrimony.registration;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Registration {
	
	@Id
	private String st_id;
	private String username;
	private String phone_no;
	
	public Registration() {
		
	}
	
	public Registration(String username, String st_id, String phone_no, String password) {
		super();
		this.username = username;
		this.st_id = st_id;
		this.phone_no = phone_no;
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSt_id() {
		return st_id;
	}
	public void setSt_id(String st_id) {
		this.st_id = st_id;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String password;
}

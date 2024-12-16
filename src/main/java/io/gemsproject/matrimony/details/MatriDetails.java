package io.gemsproject.matrimony.details;
import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Matri-Details")


public class MatriDetails {
	@Id
	private Number matriNo;
	private String fullName;
	private String gender;
	private Date dob;
	private Number age;
	private String maritalStatus;
	private Number phoneNumber;
	private String address;
	private String email;
	private String motherTongue;
	private String place;
	private Number height;
	private Number weight;
	private String isChallenged;

	private String education;
	private String occupation;
	private String company;
	private Number salary;
	
	private String fatherName;
	private String fatherOcc;
	private String motherName;
	private String motherOcc;
	private String broSis;
	
	private String hasSaved;
	private Date doBaptism;
	private String denomination;
	private String churchAddr;
	private Number pastorNo;
	
	private String music;
	private String singing;
	private String ministry;

	private String willness;
	private String expectation;
	
	public MatriDetails() {
		
	}
	
	public MatriDetails(Number matriNo, String fullName, String gender, Date dob, Number age, String maritalStatus, Number phoneNumber, String address,
			String email, String motherTongue, String place, Number height, Number weight, String isChallenged, String education, String occupation,
			String company, Number salary, String fatherName, String fatherOcc, String motherName, String motherOcc, String broSis,
			String hasSaved, Date doBaptism, String denomination, String churchAddr, Number pastorNo, String music, String singing,
			String ministry, String willness, String expectation) {
		super();

		this.setAddress(address);
		this.setAge(age);
		this.setBroSis(broSis);
		this.setChurchAddr(churchAddr);
		this.setCompany(expectation);
		this.setDenomination(denomination);
		this.setDob(dob);
		this.setDoBaptism(doBaptism);
		this.setEducation(education);
		this.setEmail(email);
		this.setExpectation(expectation);
		this.setFatherName(fatherName);
		this.setFatherOcc(fatherOcc);
		this.setFullName(fullName);
		this.setGender(gender);
		this.setHasSaved(hasSaved);
		this.setHeight(height);
		this.setIsChallenged(isChallenged);
		this.setMaritalStatus(maritalStatus);
		this.setMinistry(ministry);
		this.setMotherName(motherName);
		this.setMotherOcc(motherOcc);
		this.setMotherTongue(motherTongue);
		this.setMusic(music);
		this.setOccupation(occupation);
		this.setPastorNo(pastorNo);
		this.setPhoneNumber(phoneNumber);
		this.setPlace(place);
		this.setSalary(salary);
		this.setSinging(singing);
		this.setWeight(weight);
		this.setWillness(willness);
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Number getAge() {
		return age;
	}

	public void setAge(Number age) {
		this.age = age;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Number getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Number phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMotherTongue() {
		return motherTongue;
	}

	public void setMotherTongue(String motherTongue) {
		this.motherTongue = motherTongue;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Number getHeight() {
		return height;
	}

	public void setHeight(Number height) {
		this.height = height;
	}

	public Number getWeight() {
		return weight;
	}

	public void setWeight(Number weight) {
		this.weight = weight;
	}

	public String getIsChallenged() {
		return isChallenged;
	}

	public void setIsChallenged(String isChallenged) {
		this.isChallenged = isChallenged;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public Number getSalary() {
		return salary;
	}

	public void setSalary(Number salary) {
		this.salary = salary;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getMotherOcc() {
		return motherOcc;
	}

	public void setMotherOcc(String motherOcc) {
		this.motherOcc = motherOcc;
	}

	public String getFatherOcc() {
		return fatherOcc;
	}

	public void setFatherOcc(String fatherOcc) {
		this.fatherOcc = fatherOcc;
	}

	public String getBroSis() {
		return broSis;
	}

	public void setBroSis(String broSis) {
		this.broSis = broSis;
	}

	public String getHasSaved() {
		return hasSaved;
	}

	public void setHasSaved(String hasSaved) {
		this.hasSaved = hasSaved;
	}

	public Date getDoBaptism() {
		return doBaptism;
	}

	public void setDoBaptism(Date doBaptism) {
		this.doBaptism = doBaptism;
	}

	public String getDenomination() {
		return denomination;
	}

	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}

	public String getChurchAddr() {
		return churchAddr;
	}

	public void setChurchAddr(String churchAddr) {
		this.churchAddr = churchAddr;
	}

	public Number getPastorNo() {
		return pastorNo;
	}

	public void setPastorNo(Number pastorNo) {
		this.pastorNo = pastorNo;
	}

	public String getMusic() {
		return music;
	}

	public void setMusic(String music) {
		this.music = music;
	}

	public String getSinging() {
		return singing;
	}

	public void setSinging(String singing) {
		this.singing = singing;
	}

	public String getMinistry() {
		return ministry;
	}

	public void setMinistry(String ministry) {
		this.ministry = ministry;
	}

	public String getWillness() {
		return willness;
	}

	public void setWillness(String willness) {
		this.willness = willness;
	}

	public String getExpectation() {
		return expectation;
	}

	public void setExpectation(String expectation) {
		this.expectation = expectation;
	}
	
}

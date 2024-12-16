package io.gemsproject.matrimony.registration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

	@Autowired
	private RegistrationRepository registrationRepository;
	
	
	public List<Registration> getRegistartionDetails() {
		//return registration;
		List<Registration> registration = new ArrayList<>();
		return registrationRepository.findAll();
	}
	
	public Registration getRegistartionDetail(String stNo) {
//		return registration.stream().filter(e -> e.getstNo().equals(stNo)).findFirst().get();
		System.out.println(stNo);
		return registrationRepository.findByStaffnumber(stNo);
	}

	public void addUser(Registration user) {
		registrationRepository.save(user);
		
	}
	public void updatePwd(Registration user, String stNo) {
		registrationRepository.save(user);
	}
	public void deleteDetail(String stNo) {
//		registrationRepository.delete(stNo);
	}

}

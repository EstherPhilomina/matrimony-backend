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
	
	public Registration getRegistartionDetail(Number stId) {
//		return registration.stream().filter(e -> e.getstId().equals(stId)).findFirst().get();
		System.out.println(stId);
		return registrationRepository.findBystId(stId);
	}

	public void addUser(Registration user) {
		registrationRepository.save(user);
		
	}
	public void updatePwd(Registration user, Number stId) {
		registrationRepository.save(user);
	}

}

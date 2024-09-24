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
	
	List<Registration> registration = new ArrayList<> (Arrays.asList(
			new Registration("Esther", "3556", "9080780601", "Pwd@123"),
			new Registration("Philomina", "3557", "9874563210", "Pwd@123")
			));
	
	
	public List<Registration> getRegistartionDetails() {
		//return registration;
		List<Registration> registration = new ArrayList<>();
		registrationRepository.findAll().forEach(registration::add);
		return registration;
	}
	
	public Optional<Registration> getRegistartionDetail(String st_id) {
//		return registration.stream().filter(e -> e.getSt_id().equals(st_id)).findFirst().get();
		return registrationRepository.findById(st_id);
	}

	public void addUser(Registration user) {
		registrationRepository.save(user);
		
	}
	public void updatePwd(Registration user, String id) {
		registrationRepository.save(user);
	}
}

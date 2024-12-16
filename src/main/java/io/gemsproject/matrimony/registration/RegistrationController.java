package io.gemsproject.matrimony.registration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class RegistrationController {

	@Autowired
	private RegistrationService registrationService;
	
	@GetMapping("/registration")
	public List<Registration> getRegistrationDetails() {
		return registrationService.getRegistartionDetails();
	}
	
	@GetMapping("/registration/{id}")
	public Registration getRegistrationDetail(@PathVariable("id") String stNo) {
		return registrationService.getRegistartionDetail(stNo);
	}
	
	@PostMapping("/registration")
	public void addUser(@RequestBody Registration user) {
		registrationService.addUser(user);
	}
	
	@PutMapping("/forgetPassword/{id}")
	public void updatePwd(@RequestBody Registration user, @PathVariable("id") String stNo) {
		registrationService.updatePwd(user, stNo);
	}
	@DeleteMapping("/delete/{id}")
	public void updatePwd(@PathVariable("id") String stNo) {
		registrationService.deleteDetail(stNo);
	}
}

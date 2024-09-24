package io.gemsproject.matrimony.registration;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RegistrationController {

	@Autowired
	private RegistrationService registrationService;
	
	@RequestMapping("/registration")
	public List<Registration> getRegistrationDetails() {
		return registrationService.getRegistartionDetails();
	}
	
	@RequestMapping("/registration/{id}")
	public Optional<Registration> getRegistrationDetail(@PathVariable("id") String st_id) {
		return registrationService.getRegistartionDetail(st_id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/registration")
	public void addUser(@RequestBody Registration user) {
		registrationService.addUser(user);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/forgetPassword/{id}")
	public void updatePwd(@RequestBody Registration user, @PathVariable("id") String st_id) {
		registrationService.updatePwd(user, st_id);
	}
}

package io.gemsproject.matrimony.registration;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RegistrationRepository extends MongoRepository<Registration, Number> {
	
	  public Registration findBystId(Number stId);
	  public List<Registration> findByPhonenumber(Number phonenumber);
}

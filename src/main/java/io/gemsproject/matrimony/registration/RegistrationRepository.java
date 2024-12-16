package io.gemsproject.matrimony.registration;

import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RegistrationRepository extends MongoRepository<Registration, ObjectId> {
	
	  public Registration findByStaffnumber(String staffnumber);
//	  public List<Registration> findByPhonenumber(Integer phonenumber);
	  public List<Registration> findAll();
	  public Registration save(Registration user);
//	  public Optional delete(String staffnumber);
}

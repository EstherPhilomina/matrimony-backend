package io.gemsproject.matrimony.details;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MatriDetailsRepository extends MongoRepository<MatriDetails, Object> {
	
//	  public Details findByPhoneNumber(Number phoneNumber);
	  public List<MatriDetails> findAll();
	  public MatriDetails save(MatriDetails user);
}
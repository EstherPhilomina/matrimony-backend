package io.gemsproject.matrimony.details;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriDetailsRepository extends MongoRepository<MatriDetails, Integer> {
	
//	  public Details findByPhoneNumber(Number phoneNumber);
	  public List<MatriDetails> findAll();
	  public MatriDetails save(MatriDetails user);
}
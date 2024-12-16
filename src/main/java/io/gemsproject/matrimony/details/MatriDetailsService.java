package io.gemsproject.matrimony.details;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatriDetailsService {

	@Autowired
	private MatriDetailsRepository detailsRepository;
	
	public List<MatriDetails> getDetails() {
		return detailsRepository.findAll();
	}
}

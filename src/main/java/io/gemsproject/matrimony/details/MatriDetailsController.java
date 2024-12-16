package io.gemsproject.matrimony.details;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/matri")
public class MatriDetailsController {
	@Autowired
	private MatriDetailsService detailsService;
	
	@GetMapping("/details")
	public List<MatriDetails> getMatriDetails() {
		return detailsService.getDetails();
	}
	
}

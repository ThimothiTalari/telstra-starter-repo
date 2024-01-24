package au.com.telstra.simcardactivator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import au.com.telstra.simcardactivator.entity.SimEntity;
import au.com.telstra.simcardactivator.repo.SimRepository;

@RestController
public class SimController 
{
	@Autowired
	private SimRepository repo;
	
	@PostMapping("/activate")
	public ResponseEntity<String> getDeails(@RequestBody SimEntity simEntity)
	{
		ResponseEntity<String> resp=null;
		repo.save(simEntity);
		resp=new ResponseEntity<String>("Saved successfuuly",HttpStatus.OK);
		return resp;
		
		
	}

}

package au.com.telstra.simcardactivator.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import au.com.telstra.simcardactivator.entity.SimCard;
import au.com.telstra.simcardactivator.repo.SimRepository;

@RestController
public class SimController 
{
	@Autowired
	private SimRepository repo;
	
	//private final SimRepository simRepo;
	
	private final SimCardActutator simCardActuator;
	
	public SimController(SimCardActutator simCardActuator)
	{
		this.simCardActuator=simCardActuator;
	}
	
	@PostMapping("/activate")
	public void  getDeails(@RequestBody SimCard simCard)
	{
		/*ResponseEntity<String> resp=null;
		System.out.println("Received Data:"+simEntity.toString());
		//repo.save(simEntity);
		
		SimCardActutator m=new SimCardActutator();
		m.c(simEntity);
		resp=new ResponseEntity<String>("data received  successfuuly",HttpStatus.OK);
		return resp;*/
		
		var result=simCardActuator.actuate(simCard);
		System.out.println(result);
		
	}
	
	@GetMapping("/get/{id}")
	public Optional<SimCard> getDetails(@PathVariable Long id)
	{
		Optional<SimCard> card = repo.findById(id);
		return card;
		
	}
	
	

}

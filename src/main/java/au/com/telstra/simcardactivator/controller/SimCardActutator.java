package au.com.telstra.simcardactivator.controller;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import au.com.telstra.simcardactivator.entity.ActutationResult;
import au.com.telstra.simcardactivator.entity.SimCard;

@Component
public class SimCardActutator 
{
	
	private final RestTemplate template;
	private final String incentiveApiurl;
	
	public SimCardActutator(RestTemplateBuilder builder)
	{
		this.template=builder.build();
		this.incentiveApiurl="http://localhost:8444/actuate";
	}
	
	public ActutationResult actuate(SimCard simCard)
	{
		return template.postForObject(incentiveApiurl,simCard,ActutationResult.class);
	}

		// TODO Auto-generated method stub
	/*public void  callMicroservice2(@RequestBody SimEntity requestData)
	{
		String url="http://localhost:8444/actuate";
		
		HttpHeaders header = new HttpHeaders();
		
		header.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity requestEntity=new HttpEntity<>(requestData,header);
		
		ResponseEntity<String> resp=template.postForEntity(url,requestData,String.class);
		
		
		System.out.println(resp.getStatusCodeValue()); 
		System.out.println(resp.getStatusCode().name());
		System.out.println(resp.getBody());
		
	}*/

}

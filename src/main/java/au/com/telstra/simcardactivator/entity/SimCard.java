package au.com.telstra.simcardactivator.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class SimCard
{
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(unique=true)
	private String iccid;
	
	private String customerEmail;
	
	
	private Boolean active;
}

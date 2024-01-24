package au.com.telstra.simcardactivator.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Data;


@Data
public class SimEntity
{
	@Column(unique=true)
	private String iccid;
	
	private String customerEmail;
}

package com.simpledataappnew.SimpleData;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//@GeneratedValue(strategy=GenerationType.AUTO)
public class SimpleData {

	@Id
	private String id;
	private String say;
	
	
	
	


	public SimpleData() {
		
	}

	public SimpleData(String id,String say) {
		super();
		this.id = id;
		this.say=say;
	}
	
	public String getSay() {
		return say;
	}

	public void setSay(String say) {
		this.say = say;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}

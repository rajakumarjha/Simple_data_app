package com.simpledataappnew.SimpleData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;


@RestController
public class SimpleDataController {

	@Autowired
	private SimpleDataService simpleDataService;
	
	
	@RequestMapping("/")
	public List<SimpleData> getAll(){
		return simpleDataService.getAll();
	}
	
	@RequestMapping("/{id}")
	public Optional<SimpleData> getById(@PathVariable String id){
		return simpleDataService.getById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/")
	public void getById(@RequestBody SimpleData simpleData){
		simpleDataService.addSimpleData(simpleData);
		return;
	}
}

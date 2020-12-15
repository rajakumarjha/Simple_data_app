package com.simpledataappnew.SimpleData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class SimpleDataService {

	@Autowired
	SimpleDataRepo simpleDataRepo;
	
	public List<SimpleData> getAll() {
		// TODO Auto-generated method stub
		List<SimpleData>lst=new ArrayList<>();
		simpleDataRepo.findAll()
		.forEach(lst::add);
		return lst;
	}

	public Optional<SimpleData> getById(String id) {
		// TODO Auto-generated method stub
		return simpleDataRepo.findById(id);
	}

	public void addSimpleData(SimpleData simpleData) {
		simpleDataRepo.save(simpleData);
		return;
	}

}

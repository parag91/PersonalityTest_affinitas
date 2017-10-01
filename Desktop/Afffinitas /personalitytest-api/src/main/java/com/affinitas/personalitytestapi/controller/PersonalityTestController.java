package com.affinitas.personalitytestapi.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.affinitas.personalitytestapi.domain.service.PersonalityTestService;
import com.affinitas.personalitytestapi.dto.SelectedData;

@RestController
public class PersonalityTestController {

	private final PersonalityTestService personalitytestservice ;
	
	
	@Autowired
	PersonalityTestController(PersonalityTestService personalitytestservice){
		this.personalitytestservice = personalitytestservice ;
	}
		
	

	
	@RequestMapping(method = RequestMethod.POST , value = "/savetest")
	public String saveTest(@RequestBody Object[] selections ) {
		
		try {
			
			
			List<Object> selectedData = (List)selections[0];
			String email = selections[1].toString();
			personalitytestservice.saveTest(selectedData , email);
			
		}catch(Exception e ){
			e.printStackTrace();
			
		}
		
	//return ResponseEntity.ok().build();	
		return "SUCCESS" ;
	}
}

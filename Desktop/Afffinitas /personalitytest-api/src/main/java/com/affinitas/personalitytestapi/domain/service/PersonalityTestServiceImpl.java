package com.affinitas.personalitytestapi.domain.service;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.affinitas.personalitytestapi.domain.EmailTestDataSys;
import com.affinitas.personalitytestapi.dto.SelectedData;
import com.affinitas.personalitytestapi.repositories.PersonalityTestRepo;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
@Transactional
public class PersonalityTestServiceImpl implements PersonalityTestService{

	
	@Autowired
	private PersonalityTestRepo personalitytestrepo;
	
	public PersonalityTestServiceImpl(PersonalityTestRepo personalitytestrepo ) {
		
		this.personalitytestrepo = personalitytestrepo;
	}
	
	
	
	public void saveTest(List<Object> selections, String email){
		
		
	    final StringWriter writer =new StringWriter();
	    final ObjectMapper mapper = new ObjectMapper();
	    
	    try {
	    mapper.writeValue(writer, selections);
	    String expectedJson = writer.toString();
	    
	    
	    
	    EmailTestDataSys emaildatasys = new EmailTestDataSys();
	    
	    emaildatasys.setEmailId(email);
	    emaildatasys.setTags(expectedJson);
	    
	  //  personalitytestrepo.delete(email);
	  //  personalitytestrepo.save(emaildatasys);
	    }
	    catch(Exception e) {
	    	e.printStackTrace();
	    }
	}
}

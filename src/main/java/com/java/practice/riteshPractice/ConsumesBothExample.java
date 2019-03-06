package com.ritesh.practice.riteshPractice;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class ConsumesBothExample 
{
	@RequestMapping(value= "/fetchxml/{id}", produces = MediaType.APPLICATION_XML_VALUE)
	public void getForObjectXMLDemo(@PathVariable(value = "id") Integer id) {
		
	} 
	
	
	
}

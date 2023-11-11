package org.ram.controller;

import java.util.List;
import java.util.Map;
import org.ram.domain.Customer; 
import org.ram.service.Customerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/customers")
public class Customercontroller {
	
	@Autowired
   private Customerservice customerservice;

	@PostMapping("/upload-customers-data")
	public ResponseEntity<?>uploadcustomersdata(@RequestParam("file") MultipartFile file){
		this.customerservice.savecustomertodatabase(file);
		return ResponseEntity.ok(Map.of("Message","Data Uploaded and saved to database Successfully"));
	}
 
    @GetMapping
	public ResponseEntity<List<Customer>>getcustomers(){
	return new ResponseEntity<>(customerservice.getCostumers(), HttpStatus.FOUND);	
	}

}

package org.ram.service;

import java.io.IOException;
import java.util.List;

import org.ram.domain.Customer;
import org.ram.repositary.CustomerRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartException;
import org.springframework.web.multipart.MultipartFile;


@Service
public class Customerservice {

	@Autowired
	private CustomerRepositary customerrepositary;
	
	
	public void savecustomertodatabase(MultipartFile file) {
	//	if(Exceluploadservice.isValidExcelFile(file)) {
			try {
				List<Customer> customers= Exceluploadservice.getcustomerdatafromexcel(file.getInputStream());
			  this.customerrepositary.saveAll(customers);
			
			} catch (IOException e) {
				
			
			       throw new IllegalArgumentException("The file is not a valid excel file");
			}
		//}
	}
	
	public List<Customer>getCostumers(){
		return customerrepositary.findAll();
	}
	
}

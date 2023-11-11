package org.ram.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.ram.domain.Customer;
import org.springframework.web.multipart.MultipartFile;

public class Exceluploadservice {

//	public static boolean isValidExcelFile(MultipartFile file) {
//		return Objects.equals(file.getContentType(),"application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
//	}
	
	public static List<Customer>getcustomerdatafromexcel(InputStream inputStream){
		List<Customer>customers=new ArrayList<>();
		
	 
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
			XSSFSheet sheet=workbook.getSheet("Sheet1");
			
			
			int rowIndex=0;
			for(Row row:sheet) {
				if(rowIndex==0) {
					rowIndex++;
					continue;
				}
				Iterator<Cell>celliterator=row.iterator();
				int cellIndex=0;
				Customer customer=new Customer();
				while(celliterator.hasNext()) {
					Cell cell=celliterator.next();
					switch(cellIndex) {
		
					case 0 ->  customer.setMake_ID_PK((int)cell.getNumericCellValue());
					
					case 1 -> customer.setMake_Name(cell.getRichStringCellValue().getString());  
					
					case 2 -> customer.setModel_ID_PK((int)cell.getNumericCellValue());  
					
					case 3 -> customer.setModel_Name(cell.getRichStringCellValue().getString());  
					
					case 4 -> customer.setVariance(cell.getRichStringCellValue().getString());  
					
					case 5 -> customer.setWheels((int)cell.getNumericCellValue());  
					
					case 6 -> customer.setOperated_By(cell.getRichStringCellValue().getString());  
					
					case 7 -> customer.setCC((int)cell.getNumericCellValue());  
					
					case 8 -> customer.setSeating_Capacity((int)cell.getNumericCellValue());  
					
					case 9 -> customer.setCarrying_Capacity((int)cell.getNumericCellValue());  
					
					case 10 -> customer.setVeh_Type_ID_FK((int)cell.getNumericCellValue());  
					
					case 11 -> customer.setVeh_Type_Name(cell.getRichStringCellValue().getString());  
					
					default ->{
						
					}
					}
					cellIndex++;
				}
				customers.add(customer);
			}
			
			
		} catch (IOException e) {
		
			e.printStackTrace();
		} 

		return customers;
	}
}

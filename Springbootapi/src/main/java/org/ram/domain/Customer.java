package org.ram.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
		

	@Id
	private Integer Make_ID_PK;
	
	private String Make_Name;
	private Integer Model_ID_PK;
	private String Model_Name;	
	private String Variance;
	private Integer Wheels;
	private String Operated_By;
	private Integer CC;
	private Integer Seating_Capacity;
	private Integer Carrying_Capacity;
	private Integer Veh_Type_ID_FK;
	private String Veh_Type_Name;

	
	
	
	

	public Customer() {
		super();
	}
	public Customer(Integer make_ID_PK, String make_Name, Integer model_ID_PK, String model_Name, String variance,
			Integer wheels, String operated_By, Integer cC, Integer seating_Capacity, Integer carrying_Capacity,
			Integer veh_Type_ID_FK, String veh_Type_Name) {
		super();
		Make_ID_PK = make_ID_PK;
		Make_Name = make_Name;
		Model_ID_PK = model_ID_PK;
		Model_Name = model_Name;
		Variance = variance;
		Wheels = wheels;
		Operated_By = operated_By;
		CC = cC;
		Seating_Capacity = seating_Capacity;
		Carrying_Capacity = carrying_Capacity;
		Veh_Type_ID_FK = veh_Type_ID_FK;
		Veh_Type_Name = veh_Type_Name;
	}
	@Override
	public String toString() {
		return "Customer [Make_ID_PK=" + Make_ID_PK + ", Make_Name=" + Make_Name + ", Model_ID_PK=" + Model_ID_PK
				+ ", Model_Name=" + Model_Name + ", Variance=" + Variance + ", Wheels=" + Wheels + ", Operated_By="
				+ Operated_By + ", CC=" + CC + ", Seating_Capacity=" + Seating_Capacity + ", Carrying_Capacity="
				+ Carrying_Capacity + ", Veh_Type_ID_FK=" + Veh_Type_ID_FK + ", Veh_Type_Name=" + Veh_Type_Name + "]";
	}
	public Integer getMake_ID_PK() {
		return Make_ID_PK;
	}
	public void setMake_ID_PK(Integer make_ID_PK) {
		Make_ID_PK = make_ID_PK;
	}
	public String getMake_Name() {
		return Make_Name;
	}
	public void setMake_Name(String make_Name) {
		Make_Name = make_Name;
	}
	public Integer getModel_ID_PK() {
		return Model_ID_PK;
	}
	public void setModel_ID_PK(Integer model_ID_PK) {
		Model_ID_PK = model_ID_PK;
	}
	public String getModel_Name() {
		return Model_Name;
	}
	public void setModel_Name(String model_Name) {
		Model_Name = model_Name;
	}
	public String getVariance() {
		return Variance;
	}
	public void setVariance(String variance) {
		Variance = variance;
	}
	public Integer getWheels() {
		return Wheels;
	}
	public void setWheels(Integer wheels) {
		Wheels = wheels;
	}
	public String getOperated_By() {
		return Operated_By;
	}
	public void setOperated_By(String operated_By) {
		Operated_By = operated_By;
	}
	public Integer getCC() {
		return CC;
	}
	public void setCC(Integer cC) {
		CC = cC;
	}
	public Integer getSeating_Capacity() {
		return Seating_Capacity;
	}
	public void setSeating_Capacity(Integer seating_Capacity) {
		Seating_Capacity = seating_Capacity;
	}
	public Integer getCarrying_Capacity() {
		return Carrying_Capacity;
	}
	public void setCarrying_Capacity(Integer carrying_Capacity) {
		Carrying_Capacity = carrying_Capacity;
	}
	public Integer getVeh_Type_ID_FK() {
		return Veh_Type_ID_FK;
	}
	public void setVeh_Type_ID_FK(Integer veh_Type_ID_FK) {
		Veh_Type_ID_FK = veh_Type_ID_FK;
	}
	public String getVeh_Type_Name() {
		return Veh_Type_Name;
	}
	public void setVeh_Type_Name(String veh_Type_Name) {
		Veh_Type_Name = veh_Type_Name;
	}
	}

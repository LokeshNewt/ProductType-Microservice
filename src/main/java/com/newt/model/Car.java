package com.newt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@Entity
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	private String brand;
	private String model;
	private int year;
	private Integer ownerId; 
	
	
public Car(String id, String brand, String model, int year) {
		super();
		this.setId(id);
		this.setbrand(brand);
		this.setModel(model);
		this.setYear(year);
	}
@Override
public String toString(){
	return brand + "" + model +"" + year;
}

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getbrand() {
	return brand;
}
public void setbrand(String brand) {
	this.brand = brand;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public Integer getOwnerId() {
	return ownerId;
}
public void setOwnerId(Integer ownerId) {
	this.ownerId = ownerId;
}
Car(){
	
}

}

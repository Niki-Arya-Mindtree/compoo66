package com.doctor.main.model;

import javax.persistence.*;

@Entity
@Table(name="newdatadata")
public class Modells {
	
	@Id
	private int Id;
	private String Name;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Modells(int id, String name) {
		super();
		Id = id;
		Name = name;
	}
	public Modells() {
		super();
	}
	
	

}

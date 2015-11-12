package com.dorian.wobe;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User {
	private @Id @GeneratedValue Long id;
	
	//Those will be supplied during Registration
	public String firstName;
	public String lastName;
	//Those are 100% optional, used to share 
	public String[] groups;
	
	//Information might optionally be saved at later steps
	public String ausbilder;
	//Sub 18 years different rules apply
	public String alter;
	//Multiple places should be made possible later
	public String lernOrt;
	
	public User(){};
	
	public User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public User(String firstName, String lastName, String group) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.groups[0] = group;
	}
}

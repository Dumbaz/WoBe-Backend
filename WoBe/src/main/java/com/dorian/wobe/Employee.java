package com.dorian.wobe;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class Employee {
	private @Id @GeneratedValue Long Id;
	private String firstName;
	private String lastName;
	private String description;

	@Deprecated
	private Employee() {}

	public Employee(String firstName, String lastName, String description) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.description = description;
	}
}
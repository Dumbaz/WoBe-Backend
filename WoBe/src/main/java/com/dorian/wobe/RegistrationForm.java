package com.dorian.wobe;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;

@Data
public class RegistrationForm {
	@NotEmpty(message="{RegistrationForm.firstName.NotEmpty}")
	private String firstName;

	@NotEmpty(message="{RegistrationForm.lastName.NotEmpty}")
	private String lastName;

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}

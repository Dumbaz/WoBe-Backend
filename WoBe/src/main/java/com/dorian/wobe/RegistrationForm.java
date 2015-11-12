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
	
	public String getLastName() {
		return lastName;
	}
}

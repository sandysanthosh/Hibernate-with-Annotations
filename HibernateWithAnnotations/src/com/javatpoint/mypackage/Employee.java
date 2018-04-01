package com.javatpoint.mypackage;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	 @Column(name = "id")
	private int id;
	 @Column(name = "firstname")
	private String firstName;
	 @Column(name = "lastName")
	 private String lastName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

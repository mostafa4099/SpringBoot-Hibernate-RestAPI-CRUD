package com.mostafa.sna.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.*;

@Entity
@Table(name = "student")
public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4610357975030965572L;

	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "prod-generator")
    @GenericGenerator(name = "prod-generator", 
      strategy = "com.mostafa.sna.entity.MyGenerator")
	private int id;
	
	@Column(name="first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;

	public Student() {

	}

	public Student(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}

}

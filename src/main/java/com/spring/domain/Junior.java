package com.spring.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="junior")
@PrimaryKeyJoinColumn(name="user_id")
public class Junior extends User {
	@Column(name="department")

	String	department;
	@Column(name="batch")

	Integer	batch;
	@OneToOne
	@JoinColumn(name="id")
	User user;	
	public Junior(Integer id, String firstName, String lastName, String password, String email, Long mobileNumber,
			String gender, Integer collegeId, Date dateOfBirth, String department, Integer batch) {
		super(id, firstName, lastName, password, email, mobileNumber, gender, collegeId, dateOfBirth);
		this.department = department;
		this.batch = batch;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Integer getBatch() {
		return batch;
	}
	public void setBatch(Integer batch) {
		this.batch = batch;
	}
	public Junior(String department, Integer batch) {
		super();
		this.department = department;
		this.batch = batch;
	}

}

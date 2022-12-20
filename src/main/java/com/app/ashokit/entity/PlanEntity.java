package com.app.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="PLAN_TABLE")
public class PlanEntity {
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Integer id;
	@Column(name="NAME")
	private String name;
	@Column(name="EMAIL")
	private String email;
	@Column(name="MOBILE NUMBER")
	private Long mobileNumber;
	@Column(name="GENDER")
	private String gender;
	@Column(name="SSN")
	private Long ssn;
	
	

}

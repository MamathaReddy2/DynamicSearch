package com.app.ashokit.entity;

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
	private Integer planId;
	
	private String planName;
	private String planStatus;
	
	

}

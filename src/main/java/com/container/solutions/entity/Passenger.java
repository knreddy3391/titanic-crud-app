package com.container.solutions.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Passenger {
	@Id
	@Column(name="id")
	private Integer id;

	@Column(name="survived")
	private Integer survived;
	
	@Column(name="pclass")
	private Integer pClass;
	
	@Column(name="passenger_name")
	private String Name;
	
	@Column(name="sex")
	private String sex;
	
	@Column(name="age")
	private Integer age;	
	
	@Column(name="SIBLINGS_SPOUSES_ABOARD")
	private Integer spousSbilingsAboard;
	
	@Column(name="PARENTS_CHILDREN_ABOARD")
	private Integer parentsChildrenAboard;
	
	@Column(name="Fare")
	private Float fare;
}

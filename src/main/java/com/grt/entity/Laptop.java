package com.grt.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Laptop {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int laptopId;
	private String brand;
	private String model;
	
	
	/* one to one */
//	@OneToOne(mappedBy = "laptop")
//	@JsonIgnore
//	private Employee employee;
	
	/* many to one */	
//	
//	@ManyToOne(fetch = FetchType.EAGER , cascade = CascadeType.ALL)
//	@JoinColumn(name = "fk_empId")
//	private Employee employee;
	
	
	/* many to many */
	
//	@ManyToMany(mappedBy = "laptopList")
//	@JsonIgnore
//	private List<Employee> employeeList;
	
	
}

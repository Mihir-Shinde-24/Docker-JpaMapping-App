package com.grt.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String empName;
	private String empEmail;
	
	/* one to one */
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "lap_id")
//	private Laptop laptop;
	
	/* one to many */	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "fk_empId")
//	@JsonManagedReference
	private List<Laptop> laptopList;
	
	/* many to many */
	
//	@ManyToMany(cascade = CascadeType.ALL)
//	@JsonIgnore
//	private List<Laptop> laptopList;
	
	
	
}

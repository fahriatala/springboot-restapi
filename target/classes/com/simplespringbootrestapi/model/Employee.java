package com.simplespringbootrestapi.model;

@Entity
@Table(name="Employees")
@EntityListeners(AuditingEntityListener.class)

public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.Auto)
	private Long id;
	
	@NotBlank
	private String name;
	
	@NotBlank
	private String designation;
	
	@NotBlank
	private String expertise;
	
	@NotBlank
	private Date createdAt;
	
}

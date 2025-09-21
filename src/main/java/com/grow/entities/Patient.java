package com.grow.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data

	public class Patient extends User
{
	@Column(name = "patient_name", nullable = false)
	private String name;
	@Column(name = "gender",nullable = false)
	private String gender;
	@Column(name = "email",nullable = true)
	private String email;
	@Column(name = "dob",nullable = true)
	private LocalDate dob;

}

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

public class Receptionist extends User {
	@Column(name = "name", nullable = false)
	private String name;
	@Column(name = "joining_date", nullable = false)
	private LocalDate joiningDate;
	@Column(name = "leaving_date", nullable = true)
	private LocalDate leavingDate;

}

package com.grow.entities;

import java.time.LocalDate;
import java.time.LocalTime;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data

public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "appointment_id")
	private Integer appId;
	
	@ManyToOne
	@JoinColumn(name = "patient",nullable = false)
	private Patient patient;
	
	@Column(name = "appointment_date",nullable = false)
	private LocalDate appointmentDate;
	
	@Column(name = "reject_date",nullable = true)
	private LocalDate rejectDate;
	
	@Column(name = "appointment_time",nullable = false)
	private LocalTime appointmentTime;
	
	@ManyToOne
	@JoinColumn(name = "doctor",nullable = false)
	private Doctor doctor;

	@Column(name = "type",nullable = false)
	private String type;
	
	@OneToOne
	@JoinColumn(name = "request",nullable = true)
	private AppointmentRequest request;
	
	@Column(name = "active_status",nullable = false)
	private Boolean activeStatus;
	
	@Column(name = "status",nullable = false)
	private String status;
	
	@Column(name = "reject_description",nullable = true)
	private String rejectDescription;
}

package com.grow.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DoctorModel {
	
	private String name;
	private String mobile;
	private String specs;
	private String timing;
	private Float fess;
}

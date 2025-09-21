package com.grow.utils;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ApiResponse {
	private String status;
	private String message;
	private String errorMessage;
	private Object data;
	public ApiResponse(String status, String message, Object data) {
		super();
		this.status = status;
		this.message = message;
		this.data = data;
	}
	public ApiResponse(String status, String errorMessage) {
		super();
		this.status = status;
		this.errorMessage = errorMessage;
	}
}

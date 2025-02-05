package com.wipro.boot.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiError {
	private String message;
	private String type;
	private String date;
	private String path;
}

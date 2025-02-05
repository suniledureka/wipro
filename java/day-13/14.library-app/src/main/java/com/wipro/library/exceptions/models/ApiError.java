package com.wipro.library.exceptions.models;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ApiError {
	private String message;
	private String type;
	private LocalDateTime time;
}

package com.pdf.Exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;


@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionDetails {

	private LocalDateTime timeStamp;
	
	private String message;
	
	private String description;


	
	
}

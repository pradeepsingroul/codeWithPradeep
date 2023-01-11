package com.masaifir.exception;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MyErrorDetails {

	private LocalDate localDate;
	
	private String Message;
	
	private String Description;
	
}

package com.masaifir.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class CurrentSessionUsers {
	
	@Id
	private Integer id;
	private LocalDate localDate = LocalDate.now();
	private String UUID;
	private String mobileNumber;

}

package com.masaifir.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Fir {

	
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Integer id;
	
	private String crimeDetail;
	private LocalDateTime timeStamp;
	private String policeStation;
	

	@JsonIgnore
	@ManyToOne(cascade =  CascadeType.ALL)
	private User user;
}

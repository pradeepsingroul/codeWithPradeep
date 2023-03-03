package com.pdf.Model;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Buyer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer buyer_Id;
	private String buyer;
	
	private String buyerGstin;
	
	private String buyerAddress;
	
	
	
	
	
}

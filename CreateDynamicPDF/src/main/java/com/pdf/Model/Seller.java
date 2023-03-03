package com.pdf.Model;

import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Seller {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sellerId;
	
	private String seller;
	
	private String sellerGstin;
	
	private String sellerAddress;

	@OneToOne(cascade = CascadeType.ALL)
	private Buyer buyer;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Item> items;
	

}

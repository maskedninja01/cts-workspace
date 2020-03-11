package com.cts.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bill extends OrderT{

	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long billId;
	private double grossTotalAmount;
	
}

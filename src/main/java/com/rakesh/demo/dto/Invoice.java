package com.rakesh.demo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Invoice {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private Double amount;
	private Double finalAmount;
	private String number;
	private String receivedDate;
	private String type;
	private String vendor;
	private String comments;
}

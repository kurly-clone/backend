package com.kurlyclone.backend.entities;

import org.hibernate.annotations.ColumnDefault;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ProductInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	@ColumnDefault("0")
	private double reward;
	@Column(nullable = false)
	private String seller;
	@Column(nullable = false)
	@ColumnDefault("''")
	private String shortDescription;

	@Column(nullable = true)
	private String image;
	@Column(nullable = true)
	private String packagingType;
	@Column(nullable = true)
	private String sellingUnit;
	@Column(nullable = true)
	private String weight;
	@Column(nullable = true)
	private String origin;
	@Column(nullable = true)
	private String allergy;
	@Column(nullable = true)
	private String expirationDate;
}

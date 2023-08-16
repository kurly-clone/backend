package com.kurlyclone.backend.entities;

import org.hibernate.annotations.ColumnDefault;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String name;

	@ManyToOne
	@JoinColumn(name = "main_category_id")
	private MainCategory mainCategoryId;
	@ManyToOne
	@JoinColumn(name = "sub_category_id")
	private SubCategory subCategoryId;

	@Column(nullable = false)
	private String deliveryType;
	@Column(nullable = false)
	private String storageType;

	@Column(nullable = false)
	private String brand;
	@Column(nullable = false)
	@ColumnDefault("0")
	private double price;
	@Column(nullable = false)
	@ColumnDefault("0")
	private double discount;
}

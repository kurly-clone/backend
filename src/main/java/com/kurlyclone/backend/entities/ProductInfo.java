package com.kurlyclone.backend.entities;

import org.hibernate.annotations.ColumnDefault;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ProductInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne
	@JoinColumn(name = "product_id")
	private Product productId;
	@Column(nullable = false)
	@ColumnDefault("false")
	private boolean reward;
	@Column(nullable = false)
	private String seller;
	@Column(nullable = false)
	@ColumnDefault("''")
	private String shortDescription;

	@Column(nullable = true)
	private String image_url;
	@Column(nullable = true)
	private String detail_image_url;
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

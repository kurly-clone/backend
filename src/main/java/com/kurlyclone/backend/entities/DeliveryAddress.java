package com.kurlyclone.backend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("checkstyle:RegexpMultiline")
@Entity
@Getter
@Setter
public class DeliveryAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User userId;

	@Column(nullable = false)
	private String address;
	@Column(columnDefinition = "BOOLEAN DEFAULT false")
	private Boolean isBasic;
	@Column(nullable = true)
	private String receiverName;
	@Column(nullable = true)
	private String phoneNumber;
}

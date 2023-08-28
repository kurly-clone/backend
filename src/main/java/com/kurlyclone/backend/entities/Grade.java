package com.kurlyclone.backend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Grade {
	@Id
	private String grade;
	@Column
	private float reward;
	@Column
	private int performance;
}

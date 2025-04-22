package com.sunbeam.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "orders")
@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class Order {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name="uid")
	private User user;
	@ManyToOne
	@JoinColumn(name="mid")
	private Mobile mobile;
}

package com.sunbeam.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "dept")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Dept {
	@Id
	private int deptno;
	private String dname;
	private String loc;
}

package com.sunbeam.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="dept")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@ToString(exclude = "empList")
public class Dept {
	@Id
	private int deptno;
	private String dname;
	private String loc;
	@OneToMany(mappedBy = "dept")
	private List<Emp> empList;
}



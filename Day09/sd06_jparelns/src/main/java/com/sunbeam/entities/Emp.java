package com.sunbeam.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
@ToString(exclude = "meetingList")
@Entity
@Table(name="emps")
public class Emp {
	@Id
	private int empno;
	private String ename;
	private int deptno;
	@ManyToMany
	@JoinTable(name = "emp_meeting",joinColumns = @JoinColumn(name="empno"),inverseJoinColumns = @JoinColumn(name="meetno"))
	private List<Meeting> meetingList;
}

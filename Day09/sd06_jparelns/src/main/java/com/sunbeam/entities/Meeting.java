package com.sunbeam.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
@ToString(exclude = "empList")
@Entity
@Table(name="meeting")
public class Meeting {
	@Id
	private int meetno;
	private String topic;
	private String venue;
	@ManyToMany(mappedBy = "meetingList")
	private List<Emp> empList;
}

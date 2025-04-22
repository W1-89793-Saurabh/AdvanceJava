package com.sunbeam.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.entities.Emp;

public interface EmpDao extends JpaRepository<Emp, Integer> {

}

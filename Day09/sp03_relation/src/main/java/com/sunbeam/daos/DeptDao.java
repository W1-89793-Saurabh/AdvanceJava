package com.sunbeam.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.entities.Dept;

public interface DeptDao extends JpaRepository<Dept, Integer>{

}

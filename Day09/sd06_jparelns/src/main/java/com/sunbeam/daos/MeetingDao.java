package com.sunbeam.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.entities.Meeting;

public interface MeetingDao extends JpaRepository<Meeting, Integer> {

}

package com.nilatech.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nilatech.entity.Timing;

public interface TimingRepository extends JpaRepository<Timing, Serializable>{

}

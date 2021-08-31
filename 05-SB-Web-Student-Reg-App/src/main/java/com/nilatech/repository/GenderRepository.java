package com.nilatech.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nilatech.entity.Gender;

public interface GenderRepository extends JpaRepository<Gender, Serializable>{

}

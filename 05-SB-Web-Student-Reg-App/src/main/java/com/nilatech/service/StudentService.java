package com.nilatech.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nilatech.entity.Cources;
import com.nilatech.entity.Gender;
import com.nilatech.entity.Timing;
import com.nilatech.repository.CourcesRepository;
import com.nilatech.repository.GenderRepository;
import com.nilatech.repository.TimingRepository;

@Service
public class StudentService {

	@Autowired
	private GenderRepository genderRepository;
	@Autowired
	private CourcesRepository courcesRepository;
	@Autowired
	private TimingRepository timingRepository;

	public List<String> getGenders() {

		List<Gender> findAll = genderRepository.findAll();

		List<String> genders = new ArrayList<>();

		findAll.forEach(gender -> {
			genders.add(gender.getGenderName());
		});
		return genders;

	}

	public List<String> getCources() {
		
		List<Cources> findAll = courcesRepository.findAll();
		
		List<String> cources=new ArrayList<>();
		
		findAll.forEach(course->{
			cources.add(course.getCourcesName());
		});
		return cources;
	}
	public List<String> getTimings() {

		List<Timing> findAll = timingRepository.findAll();

		List<String> timings = new ArrayList<>();

		findAll.forEach(timing -> {
			timings.add(timing.getTimingName());
		});
		return timings;

	}

}

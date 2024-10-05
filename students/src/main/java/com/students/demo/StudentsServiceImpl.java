package com.students.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;






@Service
public class StudentsServiceImpl implements StudentsService {
	@Autowired
	private StudentsRepository studrepo;

	@Override
	public StudentsEntity save(StudentsEntity studentity) {
		StudentsEntity name=studrepo.save(studentity);
		return name;
	}

	@Override
	public StudentsEntity update(StudentsEntity studentity) {
		StudentsEntity empupdated=studrepo.save(studentity);
		return empupdated;
	}

	@Override
	public List<StudentsEntity> getalldata() {
		List<StudentsEntity>  alldata=studrepo.findAll();
		return alldata;
	}

	@Override
	public Optional<StudentsEntity> getstudid(int id) {
		Optional<StudentsEntity> studupdated=studrepo.findById(id);
		return Optional.empty();
	}

	@Override
	public String delestud(int id) {
		studrepo.deleteById(id);
		return "Deleted Successfully";	
	}
	


}

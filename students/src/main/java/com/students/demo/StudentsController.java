package com.students.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class StudentsController {
@Autowired
	private StudentsService studservice;
@SuppressWarnings("unused")
@Autowired
	private StudentsRepository studrepo;

@PostMapping("/addStud")
public StudentsEntity createstudent(@RequestBody Studentspojo Studpojo) {
	
	StudentsEntity studentity=new StudentsEntity();
	studentity.setId(Studpojo.getId());
	studentity.setName(Studpojo.getName());
	studentity.setEmail(Studpojo.getEmail());
	studentity.setGpa(Studpojo.getGpa());
	studentity.setMajor(Studpojo.getMajor());
	
	StudentsEntity studname=studservice.save(studentity);
	return studname;
	
	
}

@PutMapping("/updateStud")
public StudentsEntity updatestudents(@RequestBody Studentspojo Studpojo) {
	StudentsEntity studentity=new StudentsEntity();
	studentity.setId(Studpojo.getId());
	studentity.setName(Studpojo.getName());
	studentity.setEmail(Studpojo.getEmail());
	studentity.setGpa(Studpojo.getGpa());
	studentity.setMajor(Studpojo.getMajor());
	
	StudentsEntity studname=studservice.update(studentity);
	return studname;
	
	
}
@GetMapping("/getstud")
public List<StudentsEntity> getstudents(){
	List<StudentsEntity> getstud=studservice.getalldata();
	return getstud;
	
}

@GetMapping("/getstud/{id}")
public Optional<StudentsEntity> getstudentid(@PathVariable("id") int id){
	Optional<StudentsEntity> getstudid=studservice.getstudid(id);
	return getstudid;
}

@DeleteMapping("/deletestud/{id}")
	public String deletestudent(@PathVariable("id") int id) {
		String deletestud=studservice.delestud(id);
		return deletestud;
	}

}


	


package com.students.demo;

import java.util.List;
import java.util.Optional;

public interface StudentsService {

	StudentsEntity save(StudentsEntity studentity);

	StudentsEntity update(StudentsEntity studentity);

	List<StudentsEntity> getalldata();

	Optional<StudentsEntity> getstudid(int id);

	String delestud(int id);

}

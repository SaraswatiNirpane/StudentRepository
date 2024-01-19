package com.crudoperation.studentinfo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudoperation.studentinfo.entity.StudentEntity;
import com.crudoperation.studentinfo.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;

	public StudentEntity addStud(StudentEntity stud) {
		return studentRepository.save(stud);
	}

	public StudentEntity getStudById(Long id) {
		return studentRepository.findById(id).get();
	}

	public void deleteStudById(Long id) {
		studentRepository.deleteById(id);
	}

	public StudentEntity updateStudent(StudentEntity stud, Long id) {
		StudentEntity studEntity = studentRepository.findById(id).get();
		if (studEntity.getName() != null) {
			studEntity.setName(stud.getName());
		}
		if (studEntity.getAddress() != null) {
			studEntity.setAddress(stud.getAddress());
		}

		if (studEntity.getMobNo() != null) {
			studEntity.setMobNo(stud.getMobNo());
		}

		if (studEntity.getCourse() != null) {
			studEntity.setCourse(stud.getCourse());
		}

		return studentRepository.save(studEntity);

	}

}

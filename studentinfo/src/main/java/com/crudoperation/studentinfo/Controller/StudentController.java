package com.crudoperation.studentinfo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crudoperation.studentinfo.entity.StudentEntity;
import com.crudoperation.studentinfo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;

	@PostMapping("/savestud")
	public StudentEntity save(@RequestBody StudentEntity stud) {
		return studentService.addStud(stud);

	}

	@GetMapping("/findstudbyid/{id}")
	public StudentEntity getById(@PathVariable Long id) {
		return studentService.getStudById(id);
	}

	@DeleteMapping("/deletestudbyid/{id}")
	public String deleteById(@PathVariable Long id) {
		studentService.deleteStudById(id);
		return " Student Data deleted successfully";

	}

	@PutMapping("/updatestud/{id}")
	public StudentEntity updateDataById(@RequestBody StudentEntity stud, @PathVariable Long id) {
		return studentService.updateStudent(stud, id);
	}
}

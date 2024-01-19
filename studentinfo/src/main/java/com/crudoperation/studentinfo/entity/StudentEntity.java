package com.crudoperation.studentinfo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class StudentEntity {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String address;
	private String course;
	private Long mobNo;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Long getMobNo() {
		return mobNo;
	}
	public void setMobNo(Long mobNo) {
		this.mobNo = mobNo;
	}
	
	

}

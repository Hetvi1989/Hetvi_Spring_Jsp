package com.greatlearning.springMvcdemo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.springMvcdemo.dao.StudentDao;
import com.greatlearning.springMvcdemo.model.Students;

@Service
public class StudentService {
	@Autowired
	StudentDao studentDao;
	
	public ArrayList<Students> getStudents(){
		
		ArrayList<Students> students = studentDao.getStudentDao();
		return students;
		
	}

}

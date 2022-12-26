package com.greatlearning.springMvcdemo.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.greatlearning.springMvcdemo.model.Students;

@Repository
public class StudentDao {

	ArrayList<Students> students;
	
	public ArrayList<Students> getStudentDao(){
		
		students = new ArrayList<Students>();
		
		students.add(new Students("S01","Harsh",87));
		students.add(new Students("S02","Darsh",81));
		students.add(new Students("S03","Harsha",67));
		students.add(new Students("S04","Maharsh",91));
		students.add(new Students("S05","Sunita",86));
		students.add(new Students("S06","Vinita",77));
		students.add(new Students("S07","Raman",90));
		return students;
	}
}

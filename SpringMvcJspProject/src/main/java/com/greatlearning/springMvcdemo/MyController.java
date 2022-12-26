package com.greatlearning.springMvcdemo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.greatlearning.springMvcdemo.model.Students;
import com.greatlearning.springMvcdemo.service.StudentService;

@Controller
@RequestMapping("/hello")
public class MyController {
	
	@Autowired
	StudentService studentService;

	@RequestMapping("/greet")
	public String sayHello(Model model) {
		 
		String greeting = "Hi..!!! Welcome to Spring MVC JSP demo..";
				model.addAttribute("greetings", greeting);
				return "welcome";
	}
	
	@RequestMapping("/students")
	public String getStudentData(Model model) {
		 ArrayList<Students> mystudents = studentService.getStudents();
		 model.addAttribute("students", mystudents);
		 return "student-list";
	}
}

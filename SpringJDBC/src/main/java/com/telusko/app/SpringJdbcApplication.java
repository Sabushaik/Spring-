package com.telusko.app;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.telusko.app.Service.StudentService;
import com.telusko.app.model.Student;



@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(SpringJdbcApplication.class, args);
		
		System.out.println("Hey sabu u did it with dependencies ");
		
		Student s = context.getBean(Student.class);
		s.setID(4);
		s.setName("kuluu");
		s.setMarks(89);
		
		StudentService service = context.getBean(StudentService.class);
		
		service.addstudent(s);
		
		List<Student> std = service.getallStudents();
		
		System.out.println(std);
	
	}

}

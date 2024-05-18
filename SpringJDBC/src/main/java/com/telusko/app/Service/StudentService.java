package com.telusko.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.telusko.app.model.Student;
import com.telusko.app.rep.Studentrepo;

@Service
public class StudentService {


	private JdbcTemplate jdbc;
	
	
	
	public JdbcTemplate getJdbc() {
		return jdbc;
	}

	@Autowired 
	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	private Studentrepo repo ;
	
	public Studentrepo getRepo() {
		return repo;
	}

	@Autowired
	public void setRepo(Studentrepo repo) {
		this.repo = repo;
	}

	public void addstudent(Student s) {
		
		String sql ="Insert into student (id , name , marks) values(? , ? ,?)";
		
		int row =jdbc.update(sql ,s.getID(),s.getName(),s.getMarks());
		
		System.out.println("No of rows effected "+ row);
		// TODO Auto-generated method stub
		
	}

	public List<Student> getallStudents() {
		
		return repo.findAll();
	}
	
	


}

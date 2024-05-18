package com.telusko.app.rep;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.telusko.app.model.Student;

@Repository
public class Studentrepo {
	
	private JdbcTemplate jdbc;

	public JdbcTemplate getJdbc() {
		return jdbc;
	}
	
	
	@Autowired 

	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	public void save(Student s) {
		
		System.out.println("Student saved ");
		// TODO Auto-generated method stub
		
	}

	public List<Student> findAll() {
		
		String sql ="select * from student";
		
		RowMapper<Student> mapper= new RowMapper<Student>()
				{

					@Override
					public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
						Student st = new Student();
						
						st.setID(rs.getInt("id"));
						st.setName(rs.getString("name"));
						st.setMarks(rs.getInt("marks"));
						
						return st;
						
					}
			
				};
		
		
		return  jdbc.query(sql,mapper);
	}

	
	
	
	
}

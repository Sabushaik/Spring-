package com.telusko.Spring.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.telusko.Spring.Model.Shikari;

@Repository
public class ShikariRepo
{
	
	private JdbcTemplate jdbc ;
	
	
	public JdbcTemplate getJdbc() {
		return jdbc;
	}
    
	@Autowired
	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	public void save(Shikari shikari)
	{
		String sql="insert into Shikari (Name , Age, PhoneNumber , Package) values (? , ? , ? , ?)";
		 
	int rows =	jdbc.update(sql  , shikari.getName(),shikari.getAge(), shikari.getPhonenumber(),shikari.getPackage());
		
	System.out.println(rows+" effected ");
//		System.out.println("Added");
	}

	public List<Shikari> findall() {
		
		
		String sql="select * from Shikari";
		
		RowMapper <Shikari > mapper = new RowMapper<Shikari>() {

			@Override
			public Shikari mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Shikari s = new Shikari();
				s.setName(rs.getString("Name"));
				s.setAge(rs.getInt("Age"));
				s.setPhonenumber(rs.getLong("Phonenumber"));
				s.setPackage(rs.getInt("Package"));
				
				
		
				return s;
			}
			
		};
 		
		return jdbc.query(sql, mapper);
	}
}
package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Student;

public class StudentDaoimpl implements StudentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {
		// inserting record 
        
        String query = "insert into student values(?,?,?)";
        
        int result = this.jdbcTemplate.update(query,student.getId(), student.getName(), student.getCity());
		return result;
	}
	
	public int update(Student student) {
		// update record
		
		String query = "update student set name=?, city=? where id=?";
		
		int r =this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		
		return r;
	}
	
	public int delete(int studentID) {
		// delete records
		
		String query ="delete from student where id =?";
		
		int r = this.jdbcTemplate.update(query,studentID);
		
		return r;
	}

	public Student getStudent(int studentId) {
		// selecting single object
		String query = "select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student =this.jdbcTemplate.queryForObject(query, rowMapper,studentId);
		return student;
	}

	public List<Student> getAllStudent() {
		// selecting all student data
		
		String query ="select * from student";
		List<Student> student = this.jdbcTemplate.query(query, new RowMapperImpl());
		return student;
	}

	

	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	
	
	
}

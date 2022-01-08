package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        // spring JDBC => template 
        
        /* not recommended way of doing DML operation */
       
        /*ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        
        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
        
        // inserting record 
        
        String query = "insert into student values(?,?,?)";
        
        // fire the query
        int result = template.update(query,956,"Rishu","GRN");
        
        System.out.println("Inserted successfully. count: "+result); */
        
        
        
        /* recommended way of doing */
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        
        StudentDao studentdao = context.getBean("studentDao", StudentDao.class);
        
        Student s = new Student(10,"Nikhil","Rajh");
        
       // int r = studentdao.insert(s);
       // int r = studentdao.update(s);
        
        int r = studentdao.delete(10);
        System.out.println(r);
        
    }
}

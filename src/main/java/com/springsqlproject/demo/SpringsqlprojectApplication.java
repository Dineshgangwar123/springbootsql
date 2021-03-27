package com.springsqlproject.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringsqlprojectApplication implements CommandLineRunner  {
	
	@Autowired
	private JdbcTemplate jdbctemplate;

	public static void main(String[] args) {
		SpringApplication.run(SpringsqlprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql= "INSERT INTO user(name,age) VALUES(?,?)";
		
		int a= jdbctemplate.update(sql,"dinesh","24");
		if(a>0)
		{
			System.out.println("new row inserted");
		}
		
	}

}

package com.springsqlproject.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomemsz {
	
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	@GetMapping(path="/hello-worldsss")
	public String HelloWorld() {
		return "Hello Worldsssssssssss";
	}
	
	@PostMapping(path="/insert-user/{name}/{age}")
	public String InsertUser(@PathVariable String name,@PathVariable int age ) {
		
        String sql= "INSERT INTO user(name,age) VALUES(?,?)";
		
		int a= jdbctemplate.update(sql,name,age);
		if(a>0)
		{
			return "new row inserted";
		}
		return "Something went wrong";
		 
	}
	
	@GetMapping(path="/hello")
	public String Hello() {
		return "Hello dinesh gangwar welcome to spring bood world";
	}

}

package com.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

	@RequestMapping("/courses")
	public List<Course> listAllCourses() {
		
		return Arrays.asList(
				new Course(1, "Spring Boot"),
				new Course(2, "AWS"),
				new Course(3, "DevOps"),
				new Course(4, "Azure"),
				new Course(5, "YAML")
				);
	}
	
}

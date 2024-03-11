package com.cistech.SpringDemoApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.neo4j.ConfigBuilderCustomizer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.ConfigurableWebApplicationContext;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		ConfigurableWebApplicationContext run= (ConfigurableWebApplicationContext) SpringApplication.run(SpringDemoApplication.class, args);
		Student s1 = run.getBean(Student.class);
		Student s2 = run.getBean(Student.class);
		s1.setId(1);
		s1.setName("Jhon");
		s1.setEmail("Jhon@gmail.com");
		s1.printStudentDetails();
		s2.setId(2);
		s2.setName("King");
		s2.setEmail("King@gmail.com");

@PostMapping (path = '/users')
		public ResponseEntity<User> addUser(@RequestBody User u){
	User user = service.addNewuser(u);
	URI uri = ServletUriComponentsBuilder
			.fromCurrentRequest()
			.path('/{id}')
			.buildAndExpand(user.getId())
			.toUri();
	return ResponseEntity.created(uri)
		}

		@ResponseStatus(code = HttpStatus.NOT_FOUND)
		class UserNotFoundException extends RuntimeException {
	String message;
	public UserNotFoundException (String message){
		super(message);
	}
		}
	}

}

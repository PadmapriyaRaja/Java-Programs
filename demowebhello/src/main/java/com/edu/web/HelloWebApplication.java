package com.edu.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWebApplication {
	
	//To send data to web - @GetMapping(select)
	//To insert data      - @PostMapping(insert)
	//To update           - @PutMapping(update)
	//Delete the data     -@DeleteMapping(delete)
	
	@GetMapping("/hello")  //http://localhost:8080/hello
	public String Hello(){
		return "Hello My SPRING web";
		
	}

}

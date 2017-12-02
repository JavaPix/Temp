package com.javathread.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class FirstRestController {

	@RequestMapping(value="/",method= {RequestMethod.GET})
	public String sayHello(String input) {
		 return "Hello World";
	}
}

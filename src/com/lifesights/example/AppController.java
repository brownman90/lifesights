package com.lifesights.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String get() {
		return "ExampleApp";
	}
}

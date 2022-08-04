package com.myapp.spring

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import org.springframework.web.bind.annotation.GetMapping

@SpringBootApplication
class DevopsGroovyProducts1Application extends SpringBootServletInitializer{

	static void main(String[] args) {
		SpringApplication.run(DevopsGroovyProducts1Application, args)
	}

	 
	@GetMapping
	def sayHello() {
		return "Hello"
	}
}

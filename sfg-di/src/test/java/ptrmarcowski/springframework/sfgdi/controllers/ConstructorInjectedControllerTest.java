package ptrmarcowski.springframework.sfgdi.controllers;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ptrmarcowski.springframework.sfgdi.services.GreetingServiceImpl;

class ConstructorInjectedControllerTest {

	
	ConstructorInjectedController controller;
	
	@BeforeEach
	void setUp() {
		
		controller = new ConstructorInjectedController(new GreetingServiceImpl());
		
	}

	@Test
	void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}

}

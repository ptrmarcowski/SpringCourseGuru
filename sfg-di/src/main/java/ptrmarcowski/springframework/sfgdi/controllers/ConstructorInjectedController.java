package ptrmarcowski.springframework.sfgdi.controllers;

import ptrmarcowski.springframework.sfgdi.services.GreetingService;
import ptrmarcowski.springframework.sfgdi.services.GreetingServiceImpl;

public class ConstructorInjectedController {

	private final GreetingService greetingService;

	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
	
}

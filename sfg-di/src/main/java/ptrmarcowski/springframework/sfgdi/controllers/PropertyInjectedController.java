package ptrmarcowski.springframework.sfgdi.controllers;

import ptrmarcowski.springframework.sfgdi.services.GreetingService;

public class PropertyInjectedController {

	
	public GreetingService greetingService;
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
	
}
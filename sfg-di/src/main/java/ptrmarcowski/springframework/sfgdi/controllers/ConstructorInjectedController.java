package ptrmarcowski.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import ptrmarcowski.springframework.sfgdi.services.GreetingService;
import ptrmarcowski.springframework.sfgdi.services.ConstructorGreetingService;

@Controller
public class ConstructorInjectedController {

	private final GreetingService greetingService;

	@Autowired
	public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
	
}

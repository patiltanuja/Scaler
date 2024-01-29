package pay.in.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
	@GetMapping("/")
	public String SayHello() {
		return "Hello from qount";
	}
}

package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	@GetMapping("/login")
	public String login() {
		return "Login page loading....";
	}

	@GetMapping("/contact")
	public String contact() {
		return "Call us:: +918658852701";
	}

	@GetMapping("/hi")
	public String sayHi() {
		return "Hi,How are You ?..";

	}

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello,How are You ?...";
	}

}

package br.com.martinsdev.team_draw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TeamDrawApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeamDrawApplication.class, args);
	}

	@GetMapping("/")
	public String root() {
		return "It works!";
	}

}

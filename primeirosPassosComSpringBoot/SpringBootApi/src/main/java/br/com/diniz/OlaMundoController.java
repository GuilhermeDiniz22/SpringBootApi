package br.com.diniz;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class OlaMundoController {
	
	private static String template = "Olá, %s!";
	
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping("/saudacao")
	public OlaMundo Ola(@RequestParam(value = "nome", defaultValue = "Mundo") String nome) {
		return new OlaMundo(counter.incrementAndGet(), String.format(template, nome));
	}
	
	
}

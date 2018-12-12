package br.com.motorize.provider_resource.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import br.com.motorize.provider_resource.dtos.MenssagemDTO;
import br.com.motorize.provider_resource.services.MenssagemService;

@RestController
public class MenssagemResource {

	@Autowired
	private MenssagemService service;

	@HystrixCommand(fallbackMethod = "fallback")
	@GetMapping("/menssagem")
	public MenssagemDTO getMenssagem() {
		System.out.print("ERRROU");
		throw new RuntimeException("ERROOOUUU");
	}
	
	public MenssagemDTO fallback() {
		return service.getMenssagem();
	}
	
}

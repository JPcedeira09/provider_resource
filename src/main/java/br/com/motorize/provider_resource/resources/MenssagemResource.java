package br.com.motorize.provider_resource.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.motorize.provider_resource.dtos.MenssagemDTO;
import br.com.motorize.provider_resource.services.MenssagemService;

@RestController
public class MenssagemResource {

	@Autowired
	private MenssagemService service;

	@GetMapping("/menssagem")
	public MenssagemDTO getMenssagem() {
		return service.getMenssagem();
	}
}

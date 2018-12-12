package br.com.motorize.provider_resource.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import br.com.motorize.provider_resource.dtos.MenssagemDTO;

@Service
public class MenssagemService {

	@Autowired
	private Environment environment;
	
	public MenssagemDTO getMenssagem() {
		return new MenssagemDTO("Mensagem",Integer.valueOf(environment.getProperty("local.server.port")));
	}
}

package com.br.bebida;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BebidaIdConfig {
	@Bean(name = "Coca")
	public Bebida obterCoca() {
		return new CocaCola();
	}

	@Bean(name = "Guarana")
	public Bebida obterGuarana() {
		return new Guarana();
	}

}

package com.br.bebida;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ProgramaApp {
	public static void main(String[] argumentos) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BebidaIdConfig.class);
		Copo copo= new Copo((Bebida)context.getBean("Coca"));
		copo.quantidadePrint();
		context.close();
		
	
	}

}

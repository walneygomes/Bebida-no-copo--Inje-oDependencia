package com.br.bebida;

import org.springframework.beans.factory.annotation.Autowired;

public class Copo {
	@Autowired
	Bebida bebida;
	public Copo(Bebida b){
		this.bebida=b;
	}
	public void quantidadePrint(){
		System.out.print(bebida.quantidadeLitros());
		
	}
	
	

}

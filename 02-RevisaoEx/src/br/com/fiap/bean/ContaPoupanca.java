package br.com.fiap.bean;

import java.util.Calendar;

public class ContaPoupanca extends Conta implements ContaInvestimento {

	private float taxa;
	public static final float RENDIMENTO = (float) 0.4;

	public ContaPoupanca(int agencia,
			int numero, 
			Calendar dataAbertura, 
			double saldo, int i) {
		
		super(agencia, numero, dataAbertura, saldo);
		
	}

	@Override
	public double retirar(double valor) throws Exception {
		if(saldo < valor) {
			throw new Exception("Saldo insulficiente");
		}
		return saldo -= valor + taxa;
	}
	
	@Override
	public double calculaRetornoInvestimento() {
		
		return saldo * RENDIMENTO;
	}

}

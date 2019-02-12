package br.com.fiap.bean;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, 
			int numero, 
			Calendar dataAbertura, 
			double saldo, TipoConta conta) {
		super(agencia, numero, dataAbertura, saldo);
	}
	
	private TipoConta tipo;

	public TipoConta getTipo() {
		return tipo;
	}

	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}

	@Override
	public double retirar(double valor) throws Exception {

		if(tipo == TipoConta.COMUM && saldo < valor) {
			throw new Exception("Saldo insuficiente");
		}
		return 0;
	}
	@Override
	public String toString() {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return "Agencia: " + getAgencia() + "\n" +
				"Número: " + getNumero() + "\n" +
				"Tipo: " + getTipo() + "\n" +
				"Saldo: " + getSaldo() + "\n" +
				"Data Abertura: " + sdf.format(getDataAbertura().getTime())
				;
	}
}

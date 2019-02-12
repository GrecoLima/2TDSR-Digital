package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import br.com.fiap.bean.ContaCorrente;
import br.com.fiap.bean.TipoConta;

public class Exercicio6 {

	public static void main(String[] args) {
		List<ContaCorrente> lista = new ArrayList<>();
		lista.add(new ContaCorrente(1,
				2,
				new GregorianCalendar(2010,Calendar.AUGUST,2),
				1000,
				TipoConta.PREMIUM));
		
		lista.add(new ContaCorrente(1,
				3,
				new GregorianCalendar(2015,Calendar.AUGUST,2),
				1000,
				TipoConta.PREMIUM));
		
		lista.add(new ContaCorrente(1,
				4,
				Calendar.getInstance(),
				1000,
				TipoConta.PREMIUM));
	
	}
	
	
}

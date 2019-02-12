package br.com.fiap.loja.TerminalConsulta;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LojaApp {

public static void main(String[] args) {
	
	int codigo;
	Scanner scn = new Scanner(System.in);
	System.out.println("Digite o código do produto: ");
	codigo = scn.nextInt();
	
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date date = new Date();
	
	switch (codigo) {
	case 401:
		System.out.println("Camiseta Branca");
		break;

	case 402:
		System.out.println("Camiseta Azul");
		break;
		
	case 403:
		System.out.println("Camiseta Rosa");
		break;
		
	default:
		System.out.println("Produto não encontrado");
		break;
	}

	System.out.println("Nome da loja: Mockito");

	System.out.println("Data atual: " + dateFormat.format(date) );
	scn.close();
		
	}
	
}

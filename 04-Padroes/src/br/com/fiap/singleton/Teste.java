package br.com.fiap.singleton;

public class Teste {

	public static void main(String[] args) {
	
		String idioma = ConfiguracaoSingleton.getInstance().getProperty("idioma");
		
		System.out.println(idioma);
	}
	
}

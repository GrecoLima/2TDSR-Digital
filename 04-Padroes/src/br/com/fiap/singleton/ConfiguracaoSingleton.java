package br.com.fiap.singleton;

import java.io.IOException;
import java.util.Properties;

public class ConfiguracaoSingleton {

	private static Properties props;
	
	public static Properties getInstance() {
		
		if(props == null) {
			props = new Properties();
			try {
				props.load(ConfiguracaoSingleton.class.getResourceAsStream("/app.properties"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return props;		
	} 

	
	
}

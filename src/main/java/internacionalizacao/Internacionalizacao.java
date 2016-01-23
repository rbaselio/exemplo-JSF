package internacionalizacao;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="msg")
public class Internacionalizacao {
	
	private static String language = "_pt_BR";
	
	private static Properties prop;
	
	public static Properties getProp() {
		return prop == null ? prop = new Properties() : prop;
	}
	
	public String get(String chave) throws IOException {
		ClassLoader loader = getClass().getClassLoader();
		String path = "messages/messages" + language + ".properties";
		InputStream in = loader.getResourceAsStream(path); 
		
		getProp().load(in);
		
		return (String) prop.get(chave);
	}
	
	public void setPtBR() {
		language = "_pt_BR";
	}
	
	public void setEnUS() {
		language = "_en_US";
	}
	
}

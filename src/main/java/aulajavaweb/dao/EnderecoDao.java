package aulajavaweb.dao;

import java.util.ArrayList;
import java.util.List;

import aulajavaweb.model.Endereco;

public class EnderecoDao {

	private static EnderecoDao dao;
	private List<Endereco> enderecos = new ArrayList<>();
	
	private EnderecoDao() {
	}
	
	public static EnderecoDao singleton() {
		return dao == null ? new EnderecoDao() : dao;
	}
	
	public void cadastrar(Endereco endereco) {
	}
	
	public List<Endereco> getEnderecos() {
		return enderecos;
	}
	
}

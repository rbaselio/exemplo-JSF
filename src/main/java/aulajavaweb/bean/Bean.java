package aulajavaweb.bean;

import java.util.List;

public interface Bean<T> {

	public void inserir();
	
	public void excluir();
	
	public T buscar();
	
	public List<T> buscarTodos();
	
	public void atualizar();
	
}

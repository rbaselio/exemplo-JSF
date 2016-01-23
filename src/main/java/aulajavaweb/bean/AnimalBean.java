package aulajavaweb.bean;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import aulajavaweb.dao.AnimalDao;
import aulajavaweb.model.Animal;
import aulajavaweb.model.enums.Especie;

@ManagedBean
@ApplicationScoped
public class AnimalBean implements Bean<Animal> {
	
	private Animal animal = new Animal();
	private AnimalDao dao = AnimalDao.singleton(); 
	
	public AnimalBean() {
	}
	
	public Especie[] getEspecies() {
		return Especie.values();
	}
	
	public Animal getAnimal() {
		return animal;
	}

	@Override
	public void inserir() {
		dao.inserir(animal);
	}

	@Override
	public void excluir() {
		dao.excluir(animal);
	}
	
	public void cadastrar() {
		
	}
	
	@Override
	public Animal buscar() {
		return dao.buscar(animal.getId());
	}

	@Override
	public List<Animal> buscarTodos() {
		return dao.buscarTodos();
	}

	@Override
	public void atualizar() {
		dao.atualizar(animal);
	}
		
}

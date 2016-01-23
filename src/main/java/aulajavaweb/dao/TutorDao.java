package aulajavaweb.dao;

import java.util.ArrayList;
import java.util.List;

import aulajavaweb.model.Tutor;

public class TutorDao {

	private static TutorDao dao;
	private List<Tutor> tutores = new ArrayList<Tutor>();
	
	private TutorDao() {
	}
	
	public static TutorDao singleton() {
		return dao == null ? new TutorDao() : dao;
	}
	
	public void cadastrar(Tutor tutor) {
	}
	
	public List<Tutor> getTutores() {
		return tutores;
	}
	
}

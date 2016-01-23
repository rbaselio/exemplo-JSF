package aulajavaweb.dao;

public class QualquerCoisaDao {

	private static QualquerCoisaDao dao;
	
	private QualquerCoisaDao() {
	}
	
	public QualquerCoisaDao singleton() {
		return dao == null ? new QualquerCoisaDao() : dao;
	}
	
}

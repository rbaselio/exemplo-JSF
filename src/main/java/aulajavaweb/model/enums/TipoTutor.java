package aulajavaweb.model.enums;

public enum TipoTutor {

	PROPRIETARIO((byte) 1, "proprietario"),
	ENTIDADE((byte) 2, "entidade");
	
	private byte code;
	private String description;
	
	TipoTutor(byte code, String description) { 
		this.code = code;
		this.description = description;
	}
	
	public byte getCode() {
		return code;
	}
	
	public String getDescription() {
		return description;
	}
	
}

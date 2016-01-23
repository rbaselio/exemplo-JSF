package aulajavaweb.model.enums;

public enum Raca {

	AFFENPINSCHER((byte) 1, "AFFENPINSCHER"), 
	AFGHAN_HOUND((byte) 2, "AFGHAN_HOUND"), 
	AFRICANIS((byte) 3, "AFRICANIS"), 
	AIDI((byte) 4, "AIDI"), 
	AIREDALE_TERRIER((byte) 5, "AIREDALE_TERRIER"), 
	AKITA_INU((byte) 6, "AKITA_INU"); 
	
	private byte code;
	private String description;
	
	private Raca(byte code, String description) {
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

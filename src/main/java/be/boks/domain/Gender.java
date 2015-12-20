package be.boks.domain;

public enum Gender {
	MAN("man"),
	VROUW("vrouw");
	
	private String name;
	
	private Gender(String genderName) {
		this.name = genderName;
	}

	public String getName() {
		return name;
	}
	
}

package be.boks.domain;

public enum Category {
	CHILD("kind"),
	WHEELCHAIR("rolstoel"),
	SPORTS_WHEELCHAIR("sport rolstoel"),
	SICK("ziek"),
	ADULT("volwassene");
	
	private String categoryName;
	
	private Category(String categoryName) {
		this.categoryName = categoryName;
	}
	
	public String getCategoryName() {
		return categoryName;
	}
}

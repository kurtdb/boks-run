package be.boks.domain;

public enum Category {
	KIDS_RUN_1("kids_run_1"),
	KIDS_RUN_2("kids_run_2"),
	ROLSTOEL_RACE("rolstoelrace"),
	HANDBIKE_RACE("handbikerace"),
	FIVE_KM("5km"),
	TEN_KM("10km");
	
	private String categoryName;
	
	private Category(String categoryName) {
		this.categoryName = categoryName;
	}
	
	public String getCategoryName() {
		return categoryName;
	}
}

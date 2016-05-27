package be.boks.domain;

public enum Category {
	KIDS_RUN_1("kids_run_1", 2),
	KIDS_RUN_2("kids_run_2", 2),
	ROLSTOEL_RACE("rolstoelrace", 1),
	HANDBIKE_RACE("handbikerace", 3),
	FIVE_KM("5km", 5),
	TEN_KM("10km", 7);
	
	private String categoryName;
	
	private Integer price;
	
	private Category(String categoryName, Integer price) {
		this.categoryName = categoryName;
		this.price = price;
	}
	
	public String getCategoryName() {
		return categoryName;
	}

	public Integer getPrice() {
		return price;
	}
	
}

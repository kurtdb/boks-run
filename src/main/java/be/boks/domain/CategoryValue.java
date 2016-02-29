package be.boks.domain;

import java.io.Serializable;

public class CategoryValue implements Serializable {

	private static final long serialVersionUID = 9184297556922627201L;

	private String name;
	
	private Category category;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
}

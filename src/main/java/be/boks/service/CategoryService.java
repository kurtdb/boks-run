package be.boks.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import be.boks.domain.Category;
import be.boks.domain.CategoryValue;

@Service
public class CategoryService {

	public List<CategoryValue> getAll() {
		Category[] values = Category.values();
		List<CategoryValue> results = new ArrayList<>();
		for (Category category : values) {
			CategoryValue value = new CategoryValue();
			value.setCategory(category);
			value.setName(category.getCategoryName());
			results.add(value);
		}
		return results;
	}
}

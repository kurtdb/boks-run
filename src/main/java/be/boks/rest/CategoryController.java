package be.boks.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import be.boks.domain.CategoryValue;
import be.boks.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

	private static final Logger LOGGER = LoggerFactory.getLogger(CategoryController.class);
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<CategoryValue> getClubs() {
		LOGGER.info("Getting the clubs information.");
		return categoryService.getAll();
	}
}

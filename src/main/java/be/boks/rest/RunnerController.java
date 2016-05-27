package be.boks.rest;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import be.boks.domain.Category;
import be.boks.domain.Runner;
import be.boks.service.RunnerService;

@RestController
@RequestMapping("/loper")
public class RunnerController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(RunnerController.class);
	
	@Autowired
	private RunnerService runnerService;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Runner> getAll() {
		LOGGER.info("Getting all the runners");
		return runnerService.getAll();
	}
	
	@RequestMapping(method=RequestMethod.POST, path="/registreer")
	public void register(@Valid @RequestBody Runner runner) {
		LOGGER.info("Saving runner: " +runner);
		Runner saved = runnerService.insert(runner);
		LOGGER.info("Saved runner: " + saved);
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/berekenPrijs")
	public int calculatePrice(@Valid Runner runner) {
		int price = 0;
		List<String> categories = runner.getCategories();
		Category[] values = Category.values();
		for(String categoryName : categories) {
			for (Category category : values) {
				if (category.getCategoryName().equals(categoryName)) {
					price += category.getPrice();
				}
			}
		}
		return price;
	}
}

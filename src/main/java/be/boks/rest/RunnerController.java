package be.boks.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.boks.domain.Runner;
import be.boks.repository.RunnerRepository;

@RestController
@RequestMapping("/runner")
public class RunnerController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(RunnerController.class);
	
	@Autowired
	private RunnerRepository runnerRepository;
	
	public List<Runner> getAll() {
		return runnerRepository.findAll();
	}
	
	public void register(Runner runner) {
		Runner saved = runnerRepository.insert(runner);
		LOGGER.info("Saved runner: " + saved);
	}
}

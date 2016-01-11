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

import be.boks.domain.Runner;
import be.boks.repository.RunnerRepository;

@RestController
@RequestMapping("/loper")
public class RunnerController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(RunnerController.class);
	
	@Autowired
	private RunnerRepository runnerRepository;
	
	
	public List<Runner> getAll() {
		LOGGER.info("Getting all the runners");
		return runnerRepository.findAll();
	}
	
	@RequestMapping(method=RequestMethod.POST, path="/registreer")
	public void register(@Valid @RequestBody Runner runner) {
		LOGGER.info("Saving runner: " +runner);
		//Runner saved = runnerRepository.insert(runner);
		//LOGGER.info("Saved runner: " + saved);
	}
}

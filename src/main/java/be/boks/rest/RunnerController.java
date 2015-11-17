package be.boks.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.boks.domain.Runner;
import be.boks.repository.RunnerRepository;

@RestController
@RequestMapping("/runner")
public class RunnerController {
	
	@Autowired
	private RunnerRepository runnerRepository;
	
	public List<Runner> getAll() {
		return runnerRepository.findAll();
	}
}

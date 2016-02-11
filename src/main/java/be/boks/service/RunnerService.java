package be.boks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.boks.domain.Runner;
import be.boks.repository.RunnerRepository;

@Service
public class RunnerService {

	@Autowired
	private RunnerRepository runnerRepository;
	
	public Runner insert(Runner runner) {
		runnerRepository.add(runner);
		return runner;
	}
	
	public List<Runner> getAll() {
		return runnerRepository.getAll();
	}
}

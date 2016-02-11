package be.boks.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.test.util.ReflectionTestUtils;

import be.boks.domain.Runner;
import be.boks.repository.RunnerRepository;
import be.boks.service.RunnerService;

public class RunnerServiceTest {
	
	private RunnerRepository runnerRepository;
	
	private RunnerService runnerService;
	
	@Before
	public void setUp() throws Exception {
		runnerService = new RunnerService();
		runnerRepository = Mockito.mock(RunnerRepository.class);
		ReflectionTestUtils.setField(runnerService, "runnerRepository", runnerRepository);
	}
	
	@Test
	public void testGetAll() throws Exception {
		List<Runner> input = new ArrayList<>();
		Runner runner = new Runner();
		runner.setFirstName("test");
		input.add(runner);
		Mockito.when(runnerRepository.getAll()).thenReturn(input);
		List<Runner> results = runnerService.getAll();
		Mockito.verify(runnerRepository).getAll();
		Mockito.verifyNoMoreInteractions(runnerRepository);
		Assert.assertEquals("The results are correct", input, results);
	}
	
	@Test
	public void testInsert() throws Exception {
		Runner runner = new Runner();
		runner.setFirstName("test");
		runnerService.insert(runner);
		Mockito.verify(runnerRepository).add(runner);
		Mockito.verifyNoMoreInteractions(runnerRepository);
	}
}


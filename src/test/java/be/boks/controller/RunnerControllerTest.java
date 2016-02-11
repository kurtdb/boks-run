package be.boks.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.test.util.ReflectionTestUtils;

import be.boks.domain.Runner;
import be.boks.rest.RunnerController;
import be.boks.service.RunnerService;

public class RunnerControllerTest {

	private RunnerController runnerController;
	
	private RunnerService runnerService;
	
	@Before
	public void setUp() {
		runnerController = new RunnerController();
		runnerService = Mockito.mock(RunnerService.class);
		ReflectionTestUtils.setField(runnerController, "runnerService", runnerService);
	}
	
	@Test
	public void testGetAll() throws Exception {
		List<Runner> input = new ArrayList<>();
		Runner runner = new Runner();
		runner.setFirstName("test");
		input.add(runner);
		Mockito.when(runnerService.getAll()).thenReturn(input);
		List<Runner> results = runnerController.getAll();
		Mockito.verify(runnerService).getAll();
		Assert.assertEquals("The results should be correct", input, results);
		Mockito.verifyNoMoreInteractions(runnerService);		
	}
	
	@Test
	public void testRegister() throws Exception {
		Runner runner = new Runner();
		runner.setFirstName("test");
		Mockito.when(runnerService.insert(runner)).thenReturn(runner);
		runnerController.register(runner);
		Mockito.verify(runnerService).insert(runner);
		Mockito.verifyNoMoreInteractions(runnerService);
	}
}

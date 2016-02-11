package be.boks.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.test.util.ReflectionTestUtils;

import be.boks.domain.Club;
import be.boks.rest.ClubController;
import be.boks.service.ClubService;

public class ClubControllerTest {

	private ClubController clubController;
	
	private ClubService clubService;
	
	@Before
	public void setUp() {
		clubService = Mockito.mock(ClubService.class);
		clubController = new ClubController();
		ReflectionTestUtils.setField(clubController, "clubService", clubService);
	}
	
	@Test
	public void testGetAll() {
		List<Club> input = new ArrayList<>();
		Club club = new Club();
		club.setName("club");
		input.add(club);
		Mockito.when(clubService.getAll()).thenReturn(input);
		List<Club> results = clubController.getClubs();
		Mockito.verify(clubService).getAll();
		Assert.assertEquals("The results should be correct", input, results);
		Mockito.verifyNoMoreInteractions(clubService);
	}
}

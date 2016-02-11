package be.boks.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.test.util.ReflectionTestUtils;

import be.boks.domain.Club;
import be.boks.repository.ClubRepository;
import be.boks.service.ClubService;

public class ClubServiceTest {

	private ClubService clubService;
	
	private ClubRepository clubRepository;
	
	@Before
	public void setUp() throws Exception {
		clubService = new ClubService();
		clubRepository = Mockito.mock(ClubRepository.class);
		ReflectionTestUtils.setField(clubService, "clubRepository", clubRepository);
	}
	
	@Test
	public void testGetAll() throws Exception {
		List<Club> input = new ArrayList<>();
		Club club = new Club();
		club.setName("club");
		input.add(club);
		Mockito.when(clubRepository.getAll()).thenReturn(input);
		List<Club> results = clubService.getAll();
		Mockito.verify(clubRepository).getAll();
		Mockito.verifyNoMoreInteractions(clubRepository);
		Assert.assertEquals("The result should be correct", input, results);
	}
}

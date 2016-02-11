package be.boks.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import be.boks.domain.Club;
import be.boks.service.ClubService;

@RestController
@RequestMapping("/club")
public class ClubController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ClubController.class);
	
	@Autowired
	private ClubService clubService;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Club> getClubs() {
		LOGGER.info("Getting the clubs information.");
		return clubService.getAll();
	}
}

package be.boks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.boks.domain.Club;
import be.boks.repository.ClubRepository;

@Service
public class ClubService {

	@Autowired
	private ClubRepository clubRepository;
	
	public List<Club> getAll() {
		return clubRepository.getAll();
	}
}

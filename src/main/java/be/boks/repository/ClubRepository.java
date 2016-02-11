package be.boks.repository;

import java.util.List;

import org.ektorp.support.GenericRepository;

import be.boks.domain.Club;

public interface ClubRepository extends GenericRepository<Club> {

	List<Club> getClubs();
}

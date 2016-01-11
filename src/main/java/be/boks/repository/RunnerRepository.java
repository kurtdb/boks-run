package be.boks.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import be.boks.domain.Runner;

@Repository
public interface RunnerRepository extends MongoRepository<Runner, Long> {
	
	public List<Runner> findByFirstNameAndLastName(String firstName, String lastName);
	
	public List<Runner> findByLastName(String lastName);
}

package be.boks.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import be.boks.domain.Runner;

@RepositoryRestResource
public interface RunnerRepository extends MongoRepository<Runner, Long> {
	
	public List<Runner> findByFirstNameAndLastName(String firstName, String lastName);
	
	public List<Runner> findByLastName(String lastName);
	
	public List<Runner> findByDateOfBirth(LocalDate dateOfBirth);
}

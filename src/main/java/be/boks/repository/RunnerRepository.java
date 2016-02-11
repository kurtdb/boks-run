package be.boks.repository;

import java.util.List;

import org.ektorp.support.GenericRepository;

import be.boks.domain.Runner;

public interface RunnerRepository extends GenericRepository<Runner> {

	List<Runner> getAll();
}

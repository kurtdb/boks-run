package be.boks.repository;

import java.util.List;

import org.ektorp.CouchDbConnector;
import org.ektorp.support.CouchDbRepositorySupport;
import org.ektorp.support.View;
import org.ektorp.support.Views;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import be.boks.domain.Runner;

@Repository
@Views({
    @View(name = "all", map = "function(doc) { if (doc.type == 'runner' ) emit( null, doc )}")
})
public class RunnerRepositoryImpl extends CouchDbRepositorySupport<Runner> implements RunnerRepository {
	

    @Autowired
    public RunnerRepositoryImpl(CouchDbConnector db) {
        super(Runner.class, db);
        initStandardDesignDocument();
    }
    
    @Override
    public List<Runner> getAll() {
    	return queryView("all");
    }
}

package be.boks.repository;

import java.util.List;

import org.ektorp.CouchDbConnector;
import org.ektorp.support.CouchDbRepositorySupport;
import org.ektorp.support.View;
import org.ektorp.support.Views;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import be.boks.domain.Club;

@Repository
@Views({
    @View(name = "all", map = "function(doc) { if (doc.type == 'club' ) emit( null, doc )}")
})
public class ClubRepositoryImpl extends CouchDbRepositorySupport<Club> implements ClubRepository {

    @Autowired
    public ClubRepositoryImpl(CouchDbConnector db) {
        super(Club.class, db);
        initStandardDesignDocument();
    }

	@Override
	public List<Club> getClubs() {
		return queryView("all");
	}	
    
    
}

package be.boks;

import java.io.IOException;

import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbConnector;
import org.ektorp.impl.StdCouchDbInstance;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RunApplication {
	
	private static final String DATABASE_NAME = "boks-run";
	@Value("${vcap.services.boks-run-cloudant.credentials.host:}")
	private String host;
	@Value("${vcap.services.boks-run-cloudant.credentials.username:}")
	private String username;
	@Value("${vcap.services.boks-run-cloudant.credentials.password:}")
	private String password;

    public static void main(String[] args) {
        SpringApplication.run(RunApplication.class, args);
    }
    
	@Bean
	public CouchDbConnector couchDb() throws IOException {
		HttpClient httpClient = new StdHttpClient.Builder()
				.url("https://" + host).port(443).username(username)
				.password(password).build();

		CouchDbInstance dbInstance = new StdCouchDbInstance(httpClient);

		CouchDbConnector db = new StdCouchDbConnector(DATABASE_NAME, dbInstance);
		db.createDatabaseIfNotExists();

		return db;
	}    
}
 
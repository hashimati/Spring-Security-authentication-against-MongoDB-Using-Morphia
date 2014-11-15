package demo;



import java.net.UnknownHostException;

import org.mongodb.morphia.Morphia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mongodb.MongoClient;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {
	@Bean
	@Autowired
	public MongoClient mongoClient() throws UnknownHostException {

		final String host = "localhost";
		final int port = 27017;

		return new MongoClient(host, port);

	}
	@Bean
	@Autowired
	public Morphia morphia(){
		return new Morphia();
	}
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

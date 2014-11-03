package demo.config;


import java.net.UnknownHostException;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.springframework.beans.factory.annotation.Autowired;

import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;

public class UserRepositoryDAO 
{


	private Morphia morphia; 

	private MongoClient client; 

	

	public UserRepositoryDAO(Morphia m , MongoClient client)
	{
		
		this.morphia = m; 
		this.client = client; 
	}
	public Person findByUsername(String username)
	{
//		 Morphia morphia = new Morphia();; 
//		
//		
//		
//		 MongoClient client = null;
//		try {
//			client = new MongoClient(new ServerAddress("localhost", 27017));
//		} catch (UnknownHostException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//		
		
		morphia.map(Person.class); 
		System.out.println("I'm here"); 
		
		Datastore ds  = morphia.createDatastore(client, "authDB");; 
		Person p =
		 ds.find(Person.class, "username", username).get();  
		
		
		
		
		return p; 
		
		
	}
}

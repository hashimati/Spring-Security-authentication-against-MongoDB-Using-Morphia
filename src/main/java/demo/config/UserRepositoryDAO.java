package demo.config;


import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import com.mongodb.MongoClient;

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
		morphia.map(Person.class); 
		System.out.println("I'm here"); 
		
		
		//Set database;
		Datastore ds  = morphia.createDatastore(client, "authDB");; 
		
		
		Person p =
		 ds.find(Person.class, "username", username).get();  
			
		return p; 
		
		
	}
}

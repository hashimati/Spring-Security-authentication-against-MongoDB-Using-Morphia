package demo.config;

import java.util.ArrayList;
import java.util.List;

import org.mongodb.morphia.Morphia;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.mongodb.MongoClient;



public class MongoUserDetails implements UserDetailsService{

	private Morphia morphia; 

	private MongoClient client; 
	/**
	 * @param morphia
	 * @param client
	 */
	public MongoUserDetails(Morphia morphia, MongoClient client) {
		super();
		this.morphia = morphia;
		this.client = client;
	}


	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		// TODO Auto-generated method stub
	Person user = getUser(username); 
		
		org.springframework.security.core.userdetails.User userDetails = new org.springframework.security.core.userdetails.User(user.getUsername(),
				user.getPassword(), 
				true,
				true,
				true,
				true,
				getAuthorities(user.getRole()));
		return userDetails; 
	}
	
	
	public List<GrantedAuthority> getAuthorities(Integer role) {
		 List<GrantedAuthority> authList = new ArrayList<GrantedAuthority>();
		 switch(role)
		 {
		 	case 1:
		 		authList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
		 		break; 
		 	case 2: 
		 		authList.add(new SimpleGrantedAuthority("ROLE_OWNER_USER"));
		 		break; 
		 	case 3: 
		 		authList.add(new SimpleGrantedAuthority("ROLE_USER"));
		 		break;
		 }
		 return authList;
	}
	public Person getUser(String username)
	{
		
			Person p = new UserRepositoryDAO(morphia, client).findByUsername(username); 
			return p; 
			
	}

}

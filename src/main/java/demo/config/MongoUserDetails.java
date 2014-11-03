package demo.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;



public class MongoUserDetails implements UserDetailsService{

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
		
			Person p = new UserRepositoryDAO().findByUsername(username); 
			return p; 
			
	}

}

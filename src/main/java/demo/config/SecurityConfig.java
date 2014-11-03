package demo.config;

import org.mongodb.morphia.Morphia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.stereotype.Service;

import com.mongodb.MongoClient;

@Configuration
@EnableWebMvcSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
@Service(value = "never")
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private Morphia morphia; 

	@Autowired
	private MongoClient client; 
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth)
			throws Exception {
		
	//this.getHttp().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS); 
		auth.userDetailsService(new MongoUserDetails(morphia, client)); 	
		
	//	auth.inMemoryAuthentication().withUser("SysAdmin").password("HelloAhmed").roles("ROLE_ADMIN"); 
	}
}
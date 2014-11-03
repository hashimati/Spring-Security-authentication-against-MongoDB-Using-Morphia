package demo;

import javax.servlet.http.HttpServletRequest;





import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainController 
{
	
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@RequestMapping("/")
	public @ResponseBody String hello(HttpServletRequest request)
	{
		request.getSession().setMaxInactiveInterval(15 * 60);
		return "Hello"; 
	}
	
	
}

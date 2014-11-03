package demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainController 
{
	
	@RequestMapping("/")
	public @ResponseBody String hello(HttpServletRequest request)
	{
		request.getSession().setMaxInactiveInterval(15 * 60);
		return "Hello"; 
	}


}

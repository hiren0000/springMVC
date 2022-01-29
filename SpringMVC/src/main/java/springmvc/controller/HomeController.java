package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.Model.User;

@Controller
public class HomeController 
{
	@RequestMapping("/home")
	public String home()
	{
		System.out.println("home page is running :) ");
		
		return "home";
	}
	
/*Here I am using @RequestParam but we can also fetch the value from input using our HttpServletRequest as we do
 * 	it in the servlet, i.e. using req.getParameter();
*/	
	
	@RequestMapping(path = "/process", method = RequestMethod.POST)
	public String handler(@RequestParam("name") String uName, @RequestParam("e") String email, Model m)
	{
		m.addAttribute("uname", uName);
		m.addAttribute("em", email);
		
		return "submit";
	}
	
/*I am using @ModelAttribute annotation and that's really fantastic it would save a many lines of code
 * a use u can see in the conHandler function but to use that we must remember that our form input's name and
 * Model class variables name have to be same or else it can be failed to put the values into it.
 */
	
	
	
	@RequestMapping("/contact")
	public String cont()
	{
		System.out.println("contact page is running");
		return "contact";
		
	}
	
	@RequestMapping(path = "/cdata", method = RequestMethod.GET)
	public String conHandler(@ModelAttribute("user") User user, Model m)
	{
		System.out.println(user.getName());
		return "success";
	}
	
}

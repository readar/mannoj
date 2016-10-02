package com.base.Controller;

import java.security.Principal;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.base.model.User;
import com.base.service.UserService;

@Controller
public class LogiController {
	
	@Autowired
	UserService us;
		
	@RequestMapping("/RegisterPage")
	public ModelAndView displayReg(){
		ModelAndView r1=new ModelAndView("RegisterPage","user",new User());
		System.out.println("reg page is from logicontroller");
		return r1;
	}
	

	@RequestMapping("/log")
	public ModelAndView Logicontroller()
	{
		ModelAndView mv= new ModelAndView("login");
		System.out.println("Registration control called");
		
		
		return mv;
	}
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView register(@Valid@ModelAttribute("user") User user,BindingResult bindingResult)
    {	
		if(bindingResult.hasErrors())
		{
			return new ModelAndView("RegisterPage");
		}
		System.out.println("in register controller");
		us.saveOrUpdate(user);
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/login_session_attributes")
	public String login_session_attributes(HttpSession session,ModelMap model) {
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
	session.setAttribute("username", name);
    	session.setAttribute("LoggedIn", "true");

		Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) SecurityContextHolder.getContext()
		.getAuthentication().getAuthorities();
		String role="ROLE_USER";
		for (GrantedAuthority authority : authorities) 
		{
		  
		     if (authority.getAuthority().equals(role)) 
		     {
		    	 session.setAttribute("UserLoggedIn", "true");
		    
		    	 return "Welcomepage";
		     }
		     else 
		     {
		    	 session.setAttribute("Administrator", "true");
	
			 }
		}
		return "Admin";
	}
	
	@RequestMapping("/do_out")
	public ModelAndView doout(){
		ModelAndView mv=new ModelAndView("Novels");
		return mv;
	}
	
	
	
/*	@RequestMapping("/UserCheck")
	public ModelAndView usercheck(Principal principal){
		System.out.println("it is of usercheck");
		return new ModelAndView("Welcomepage");
	}
	@RequestMapping("/AdminCheck")
	public ModelAndView admincheck(Principal principal){
		System.out.println("it is of admincheck");
		return new ModelAndView("Admin");
	}
	@RequestMapping("/logout")
	public ModelAndView logout(Principal principal,HttpServletRequest request){
		
	//	session.invalidate();
		request.getSession().invalidate();
		
		return new ModelAndView("logout");
	}
	
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request)
	{
	request.getSession().invalidate();
	System.out.println("logout page called");

	return "Log";
	}*/
/*	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(
		@RequestParam(value = "error", required = false) String error,
		@RequestParam(value = "logout", required = false) String logout){
    
	ModelAndView mv=new ModelAndView("login");
	return mv;
}*/
}

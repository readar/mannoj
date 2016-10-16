package com.niit.controller;



import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.Principal;
import java.util.Collection;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
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
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.UserDAO;
import com.niit.model.Blog;
import com.niit.model.Message;
import com.niit.model.OutputMessage;
import com.niit.model.User;

@Controller
public class MyController {
	
	
	@Autowired
	UserDAO ud;

	
	    @RequestMapping("/")
	    public ModelAndView land(){
	 	ModelAndView mv=new ModelAndView("home");
		return mv;
		
	    }
	    
		@RequestMapping("/sign")
		public ModelAndView displayReg(){
			ModelAndView r1=new ModelAndView("signup","user",new User());
			System.out.println("reg page is from logicontroller");
			return r1;
		}
		
		@RequestMapping("/login")
		public ModelAndView displayglog(){
			ModelAndView r1=new ModelAndView("login");
			System.out.println("log page is from logicontroller");
			return r1;
		}
		
		@RequestMapping("/getchat")
		public ModelAndView displaychat(){
			ModelAndView r1=new ModelAndView("chatpage");
			System.out.println("log page is from logicontroller");
			return r1;
		}
		
		  @MessageMapping("/chat")
		  @SendTo("/topic/message")
		  public OutputMessage sendMessage(Message message) {
		    return new OutputMessage(message, new Date());
		  }
		
		
		@RequestMapping("/do_out")
		public ModelAndView displayout(){
			ModelAndView r1=new ModelAndView("home");
			System.out.println("logout done is from logicontroller");
			return r1;
		}
		
		
		@ModelAttribute("user")
		public User returnObject()
		{
			return new User();
		}
		
/*		@RequestMapping(value="/signupdate",method=RequestMethod.POST)
		public ModelAndView register( @ModelAttribute("user") User user,BindingResult bindingResult)
	    {	
			if(bindingResult.hasErrors())
			{
				return new ModelAndView("signup");
			}
			System.out.println("in register controller");
		//	user.setRole(username);
			user.setRole("ROLE_USER");
			user.setAdmin(false);
			user.setEnabled(true);
			ud.saveOrUpdate(user);
			ModelAndView mv = new ModelAndView("login");
			return mv;
		}*/
		
		 @RequestMapping(value="/signupdate",method=RequestMethod.POST)
			public String createUser(@Valid @ModelAttribute("user") User users,
					@RequestParam("file") MultipartFile file,Model model,
					HttpServletRequest request,BindingResult bindingResult,Principal p)throws IOException
			{
			 
				if(bindingResult.hasErrors())
				{
					return "signup";
				}
			 	String filename;
			 	byte[]bytes;
			 	
			 			 users.setRole("ROLE_USER");
			 			
			 			 users.setAuthority("ROLE_USER");
			 			 users.setEnabled(true);
			 			 users.setAdmin(true);
			 			ud.saveOrUpdate(users);
			 			
			 			
			 			System.out.println("image");
			 			MultipartFile image=users.getFile();
			 			Path path;
			 			path=Paths.get("D:/project 2/FriendSter/src/main/webapp/resources/images//"+users.getId()+".jpg");
			 			//String path = request.getSession().getServletContext().getRealPath("/resources/images/" + user.getUser_id() + ".jpg");
			            System.out.println("Path = " + path);
			            System.out.println("File name = " + users.getFile().getOriginalFilename());
		
			            if(image!=null && !image.isEmpty())
			            {
			            	try
			            	{
			            	   image.transferTo(new File(path.toString()));
			            	   System.out.println("Image Saved in:"+path.toString());
			            	}
			            	catch(Exception e)
			            	{
			            		e.printStackTrace();
			            		System.out.println("Image not saved");
			            	}
			            }
	

			            
				return "login";
			}

/*		@RequestMapping("/loggedcheck")
		public ModelAndView displaylog(@RequestParam(value="username") String usernme,@RequestParam(value="password") String pwd){
			ModelAndView mv = new ModelAndView("index");;
			if(ud.isvaliduser(usernme, pwd)==true)
			{
				mv = new ModelAndView("index");
			}
			else
			{
				mv=new ModelAndView("errorpage");
			}
		
			System.out.println("index is from logicontroller");
			return mv;
		}*/
		
		 @RequestMapping(value = "/login_session_attributes")
			public String login_session_attributes(HttpSession session,ModelMap model) {
				String name = SecurityContextHolder.getContext().getAuthentication().getName();
				System.out.println("1");
				
				//User user = userService.getUserByName(name);
				
				System.out.println("2");
				
				//session.setAttribute("userId", user.getId());
				System.out.println("3");
				
			session.setAttribute("username",name);
				
			session.setAttribute("LoggedIn", "true");

				@SuppressWarnings("unchecked")
				Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) SecurityContextHolder.getContext()
				.getAuthentication().getAuthorities();
				
				String role="ROLE_USER";
				for (GrantedAuthority authority : authorities) 
				{
				  
				     if (authority.getAuthority().equals(role)) 
				     {
				    	 
				 
				    	System.out.println("success user login");
				    	return "index";
				     
				     }
				     
				    

				}
				return "home";
		 }
		 
		 
		 
}

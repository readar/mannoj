package com.niit.controller;

import java.io.IOException;
import java.security.Principal;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.niit.dao.BlogDAO;

import com.niit.dao.UserDAO;
import com.niit.model.Blog;







@Controller
public class BlogController {
	
	@Autowired
	UserDAO ud;
	
	@Autowired
	BlogDAO bd;
	
	@Autowired
	SessionFactory sessionFactory;
	
	@RequestMapping("/newblog") // from user / admin success login page
	public ModelAndView displayBlogPage(){
		System.out.print("\nBlogController - displayBlogPage()");
		ModelAndView mv = new ModelAndView("blogPage");
	//	session.setAttribute("uname",);
		return mv;
	}
	
/*	@RequestMapping("/addBlogRecordRequest") // from add blog page
	public String addBlogDataRequest(@RequestParam(value="blogtitle")String title,@RequestParam(value="blogcontent")String content,@ModelAttribute("user") User user,Principal p){
		System.out.print("\nBlogController - addBlogDataRequest()");
		
		Blog blog = new Blog();
		blog.setBlogTitle(title);
		blog.setBlogContent(content);
		p.getName();

		Date dt = new Date();
		//String date = dt.getYear()+"-"+dt.getMonth()+"-"+dt.getDate();	
		System.out.println(dt);
		blog.setBlogCreationDate(dt);
		blog.setBlogStatus("valid");
		
	
	
		
		bd = new BlogDAOImpl(sessionFactory);
		bd.createBlog(blog);
		
	//	ModelAndView mv = new ModelAndView("blogPage");
	//	mv.addObject("uname", CommonData.loginUserName);
		return "blogPage";
	}*/
	
	@ModelAttribute("blog")
	public Blog returnObject()
	{
		return new Blog();
	}
	
	@RequestMapping("/bpost")
	public String createBlog(@ModelAttribute("blog") Blog blog,Model model,Principal p,HttpSession session)throws IOException
	{
	

    	blog.setBlogCreatedUser(p.getName());
		
		blog.setBlogStatus("valid");
		blog.setBlogCreationDate(new java.util.Date());
		bd.createBlog(blog);
		return "blogPage";
	}
	
	@RequestMapping("/getBlogData")
	public @ResponseBody String getValues() {			
		String devs="";
		System.out.println("gson all blogs...");
		List <Blog> listdev = bd.getBlogList();
		Gson gson = new Gson();
		devs=gson.toJson(listdev);	
		return devs;
	}	
	
	@RequestMapping("/getBlogDataInd")
	public @ResponseBody String getfullValues() {			
		String devs="";
		System.out.println("gson all blogs...");
		List <Blog> listdev = bd.getBlogList();
		Gson gson = new Gson();
		devs=gson.toJson(listdev);	
		return devs;
	}	
	
/*	@RequestMapping("/getblog") // from user / admin success login page
	public ModelAndView displaygetBlogPage(){
		System.out.print("\nBlogController - displaygetBlogPage()");
		ModelAndView mv = new ModelAndView("fullBlogPage");
	//	session.setAttribute("uname",);
		return mv;
	}*/

}

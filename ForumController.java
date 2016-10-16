package com.niit.controller;

import java.io.IOException;
import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.niit.dao.ForumDAO;
import com.niit.model.Forum;


@Controller
public class ForumController {

	@Autowired
	private ForumDAO forumdao;
	
	
	@RequestMapping("/newforum")
	public ModelAndView showForum()
	{
		System.out.println("forum page");
		ModelAndView mv= new ModelAndView("forum");
		return mv;
	}
	@ModelAttribute("forum")
	public Forum returnObject()
	{
		return new Forum();
	}
	@RequestMapping("/fpost")
	public String createBlog(@ModelAttribute("forum") Forum forum,Model model,Principal p )throws IOException
	{
		
	//	forum.setUser_name("kaushik");
		forum.setForumCreatedUser(p.getName());
		forum.setForumStatus("valid");
		forum.setForumCreationDate(new java.util.Date());
		forumdao.createForum(forum);
		return "forum";
	}

	String setName;
	List<Forum> flist;
	@SuppressWarnings("unchecked")
	@RequestMapping("/GsonCon1")
	public @ResponseBody String getValues()throws Exception
	{
		String result = "";
			flist = forumdao.getForumList();
			Gson gson = new Gson();			  
			result = gson.toJson(flist);			
			return result;
	}




}

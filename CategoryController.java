package com.base.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.base.model.Category;

import com.base.service.CategoryService;

@Controller
public class CategoryController {
	
	@Autowired
	CategoryService cs;
	
	@RequestMapping("/cat")
	public ModelAndView displaycatpage()
	{
		ModelAndView r1=new ModelAndView("categorypage");
		System.out.println("catgy page is from catcontroller");
		return r1;
	}
	
	
	@RequestMapping("/catgry")
	public ModelAndView catgry(
			@ModelAttribute Category category,
			@RequestParam(value = "tgname") String name,
			@RequestParam(value = "tgdescription") String desc
			 ) {
		
		category.setTgname(name);
		category.setTgdescription(desc);



		System.out.println("in category controller");
		cs.saveOrUpdate(category);
		ModelAndView mv = new ModelAndView("categorypage");
		return mv;
	}
	
}
	

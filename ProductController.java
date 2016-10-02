package com.base.Controller;


import java.io.File;

import java.io.IOException;

import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.base.model.Category;
import com.base.model.Product;
import com.base.model.Supplier;
import com.base.service.CategoryService;
import com.base.service.ProductService;
import com.base.service.SupplierService;

import com.google.gson.Gson;


@Controller
public class ProductController  {
	
	@Autowired
	private ProductService productService; 
	
	@Autowired
	private SupplierService supplierService;
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("/add")
	public ModelAndView displaprdPage(@ModelAttribute("product")Product product,Model model){
		model.addAttribute("product", new Product());
		model.addAttribute("category", new Category());
		model.addAttribute("supplier", new Supplier());
		model.addAttribute("productList", this.productService.list());
		model.addAttribute("categoryList", this.categoryService.list());
		model.addAttribute("supplierList", this.supplierService.list());
		System.out.print("\nMyController - displayHomePage as landpage()");
		System.out.println(product.getPtname());
		ModelAndView mv = new ModelAndView("Products");		
		return mv;
	}
	
	
     @RequestMapping(value="/products", method=RequestMethod.POST)
	
    	public String CreateProduct(@ModelAttribute("product")Product product,HttpServletRequest request)
    	{		
    	 	System.out.println("in product controller11");

    		@SuppressWarnings("unused")
			String filename;
    	 	@SuppressWarnings("unused")
			byte[]bytes;
    	 	System.out.println(product.getPtdescription());
    	 	
    	 	//--------notepadcopy-------------//
    	 	
    	 		System.out.println("image uploaded");
    	 		
    	///////////notepad/////////////
    	
    	
    	System.out.println("product controller called");
    	MultipartFile image=product.getImg();
    	Path path;
    	path=Paths.get("D:/project/base/src/main/webapp/resources/images/"+product.getPtname() +".jpg");
    	
    	System.out.println("Path = " + path);
        System.out.println("File name = " + product.getImg().getOriginalFilename());
        if(image!=null && !image.isEmpty())
        {
        	try
        	{
        	 image.transferTo(new File(path.toString()));
        	  System.out.println("Image Saved in:"+path.toString());
        	}catch(Exception e)
        	{
        e.printStackTrace();
        		System.out.println("Image not saved");
        	}
      }
		Category category = categoryService.getByName(product.getCategory().getTgname());
		categoryService.saveOrUpdate(category);
        
        Supplier supplier=supplierService.getByName(product.getSupplier().getSpname());
		supplierService.saveOrUpdate(supplier);
	 	
		product.setCategory(category);
		product.setSupplier(supplier);
	 	
		product.setCatg_tgid(category.getTgid());
		product.setSup_spid(supplier.getSpid());
        
		productService.saveOrUpdate(product);
		return "viewproductpage";
	}
	
  /*  @RequestMapping(value="Products", method = RequestMethod.POST)
    public String addProductPost(@Valid @ModelAttribute("product") Product product, BindingResult result, HttpServletRequest request){

        if(result.hasErrors()){
            return "Products";
        }

        productService.manageProduct(product);
      
        MultipartFile image=product.getImg();
			Path path;
			path=Paths.get("D:/project/base/src/main/webapp/resources/images/"+product.getPtid()+".jpg");
			//String path = request.getSession().getServletContext().getRealPath("/resources/images/" + user.getUser_id() + ".jpg");
        System.out.println("Path = " + path);
        System.out.println("File name = " +product.getImg().getOriginalFilename());

        if(image != null && !image.isEmpty()){
            try {
                image.transferTo(new File(path.toString()));
                System.out.println("Image Saved in:"+path.toString());
            } catch (Exception ex){
                ex.printStackTrace();
                throw new RuntimeException("Product image saving failed", ex);
            }
        }

        return "redirect:/viewproductpage";
    }*/
 	String setName;
 	List<Product> list;
 //	@SuppressWarnings("unchecked")
 	@RequestMapping("/GsonCon")
 	@ResponseBody
 	public String getValues()throws Exception
 	{
 		String result = "";
 			list = productService.list();
 			Gson gson = new Gson();			  
 			result = gson.toJson(list);			
 			return result;
 	}
 //    throws JsonGenerationException, JsonMappingException, IOException
	@RequestMapping("/viewprod")
	public ModelAndView viewItems() throws JsonGenerationException, JsonMappingException, IOException
	{
		System.out.println("gson to json");

    	List<Product> list = productService.list();
		System.out.println("product list="+list);
		
		ObjectMapper om = new ObjectMapper();
		
		String listjson = om.writeValueAsString(list);

		System.out.println(listjson);
		return new ModelAndView("viewprods","listofitem",listjson);
		
/*     	List<Product> list=productService.list();
		Gson gson=new Gson();
		String data=gson.toJson(list);
		return new ModelAndView("viewprods","listofitem",data);*/
					
	}
	
	
	@RequestMapping("/deleteItem")
	public String removeProduct(@RequestParam int ptid) throws Exception {
	System.out.println("In delete");
	System.out.println(ptid);

	    try {
	        productService.delete(ptid);
	        categoryService.delete(ptid);
	        supplierService.delete(ptid);
	      //  model.addAttribute("message", "Successfully Added");
	    } catch (Exception e) {
	     //   model.addAttribute("message", e.getMessage());
	        e.printStackTrace();
	    }
	    // redirectAttrs.addFlashAttribute(arg0, arg1)
	   
	    
	    return "viewproductpage";
	}
	

	
	@RequestMapping("/viewimg")
	public ModelAndView view(@RequestParam("ptid") int id){
/*		ModelAndView mv=new ModelAndView("viewimgprod");
		String image= "D:/project/base/src/main/webapp/resources/images/"+product.getPtname() +".jpg";
		mv.addObject("${ptname}",product.getPtname());
		mv.addObject("${ptdescription}",product.getPtdescription());
		mv.addObject("${ptprice}",product.getPtprice());
		mv.addObject("${img}",image);
		return mv;*/
		
	    System.out.println("I am in productViewDetails");
	    System.out.println("ID:" + id);
	    Product product = productService.get(id);
	    return new ModelAndView("viewimgprod", "product", product);
	}
	
	
	@RequestMapping("/editProduct/{id}")
	public String editItem(@RequestParam("ptid") int id,Model model)
	{
	System.out.println("id:"+id);
//	model.addAttribute("product", this.productService.get(id));
//	model.addAttribute("product", productService.list());
//	model.addAttribute("updateproduct", "true");
	return "viewproductpage";
//	Product product=productService.get(id);
//	System.out.println("Product Name:"+product.getPtname());
//	return new ModelAndView("updateproduct","product",product);
	}
	
/*	@RequestMapping("/updateproduct")
	public String updateProduct(@RequestParam int ptid,@RequestParam("ptname") String ptname,@RequestParam("ptdescription") String ptdescription,@RequestParam int ptprice, @RequestParam("ptquantity") String ptquantity)
	{
	//int prodId=Integer.parseInt(pid);
   Product product=productService.get(ptid);
   product.setPtid(ptid);
	product.setPtname(ptname);
	product.setPtdescription(ptdescription);
	product.setPtprice(ptprice);
	productService.manageProduct(product);

	        return "redirect:/Products";
	        }*/
	
/*	@RequestMapping("/admin/product/edit")
	public String editProduct(@Valid @ModelAttribute("product") Product product, BindingResult result, HttpServletRequest request)
	{
		
        MultipartFile productImage = product.getImg();
        Path path;
        //String rootDirectory = request.getSession().getServletContext().getRealPath("/");
        path = Paths.get("D:/project/base/src/main/webapp/resources/images/" + product.getPtid() + ".jpg");

        if(productImage != null && !productImage.isEmpty()){
            try {
                productImage.transferTo(new File(path.toString()));
                System.out.println("Image Saved in:"+path.toString());
            } catch (Exception ex){
                ex.printStackTrace();
                throw new RuntimeException("Product image saving failed", ex);
            }
        }
        productService.manageProduct(product);

        return "redirect:/admin/viewproductpage";
	}*/
	
}

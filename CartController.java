package com.base.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.base.model.Cart;
import com.base.model.Product;
import com.base.service.CartService;


import com.base.service.ProductService;


@Controller
public class CartController {
	
	@Autowired
	CartService cs;
	
	@Autowired
	ProductService ps;
	
	
	@RequestMapping("addtoCart/{userid}/{ptid}")
	public String addToCart(@PathVariable("ptid") int Productid,@PathVariable("userid") int userid,@RequestParam("quantity") int q,HttpSession session)throws Exception 
	{
		if (cs.getitem(Productid,userid)!= null ){
			Cart item=cs.getitem(Productid);
			item.setQuantity(item.getQuantity()+q);
			Product p=ps.get(item.getId());
			item.setPrice(item.getPrice()+(q*p.getPtprice()));
			cs.saveOrUpdate(item);
			session.setAttribute("cartsize",cs.cartsize((Integer)session.getAttribute("userid")));
			return "redirect:/viewprods";
		}
		else
		{
			Cart item=new Cart();
			Product product=ps.get(Productid);
			item.setProductname(product.getPtname());
			item.setId(userid);
			item.setQuantity(q);
			item.setPrice(q*product.getPtprice());
	//		item.setStatus("C");
			item.setId(Productid);
			cs.saveOrUpdate(item);
			session.setAttribute("cartsize",cs.cartsize((Integer)session.getAttribute("userid")));
			return "redirect:/viewprods";
		}
		
	}
	
	
/*	@RequestMapping("editorder/{cartid}")
	public String editorder(@PathVariable("cartid") int cartid,@RequestParam("quantity") int q,HttpSession session)
	{
		Cart cart=cs.getitem(cartid);
		Product p=ps.get(cart.getId());
		cart.setQuantity(q);
		cart.setPrice(q*p.getPtprice());
		cs.saveOrUpdate(cart);
		session.setAttribute("cartsize",cs.cartsize((Integer)session.getAttribute("userid")));
		return "redirect:/viewcart";
	}
	
	@RequestMapping("deleteitem/{id}")
	public String deleteorder(@PathVariable("id")int id,HttpSession session)
	{
		cs.delete(id);
		session.setAttribute("cartsize",cs.cartsize((Integer)session.getAttribute("userid")));
		return "redirect:/viewcart";
	}
	
	@RequestMapping("viewcart")
	public String viewCart(Model model,HttpSession session)
	{
		int userId=(Integer)session.getAttribute("userId");
		model.addAttribute("CartList",cs.get(userId));
		model.addAttribute("CartPrice",cs.CartPrice(userId));
		model.addAttribute("IfViewCartClicked", "true");
		model.addAttribute("HideOthers","true");
		return "cart";
	}
	
	@RequestMapping("placeorder")
	public String placeorder(Model model)
	{
		model.addAttribute("IfPaymentClicked", "true");
		model.addAttribute("HideOthers","true");
		return "Welcome";
	}

	@RequestMapping("pay")
	public String payment(HttpSession session)
	{
		cs.pay((Integer)session.getAttribute("userId"));
		return "redirect:/Welcome";
	}	*/

}

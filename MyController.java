package com.base.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public ModelAndView displaywelcomepage(){
		ModelAndView v1=new ModelAndView("Novels");
		System.out.println("Welcome is from controller");
		return v1;
	}

/*	@RequestMapping("/Admin")
	public ModelAndView displayadminpage(){
		ModelAndView v1=new ModelAndView("Admin");
		System.out.println("Welcome is from controller");
		return v1;
	}*/
	@RequestMapping("/admin")
	public ModelAndView displaycartpage(){
		ModelAndView v1=new ModelAndView("Products");
		System.out.println("adminproduct is from controller");
		return v1;
	}
	
	@RequestMapping("/novels")
	public ModelAndView displayHomepage(){
		ModelAndView q1=new ModelAndView("Novels");
		System.out.println("welcome is from controller");
		return q1;
	}
	
/*	@RequestMapping("/Novels")
	public ModelAndView displaynovelpage(){
		ModelAndView q1=new ModelAndView("Novels");
		System.out.println("Novels is from controller");
		return q1;
	}*/
	@RequestMapping("/Product")
	public ModelAndView displayProductpage(){
		ModelAndView q2=new ModelAndView("Product");
		System.out.println("Product is from controller");
		return q2;
	}
	
	

	@RequestMapping("/Categories")
	public ModelAndView displayCategoriespage(){
		ModelAndView v2=new ModelAndView("Categories");
		System.out.println("Categories also from controller");
		return v2;
	}
	
	@RequestMapping("/Genres")
	public ModelAndView displayGenrespage(){
		ModelAndView v3=new ModelAndView("Genres");
		System.out.println("Genres also from controller");
		return v3;
	}
	
	@RequestMapping("/Author")
	public ModelAndView displayAuthorpage(){
		ModelAndView v4=new ModelAndView("Author");
		System.out.println("Author also from controller");
		return v4;
	}
	
	@RequestMapping("/Literature")
	public ModelAndView displayLiteraturepage(){
		ModelAndView v5=new ModelAndView("Literature");
		System.out.println("Literature also from controller");
		return v5;
	}
	@RequestMapping("/history")
	public ModelAndView displayhistorypage(){
		ModelAndView v6=new ModelAndView("history");
		System.out.println("history also from controller");
		return v6;
	}	
	@RequestMapping("/children")
	public ModelAndView displaychildrenpage(){
		ModelAndView v7=new ModelAndView("children");
		System.out.println("children also from controller");
		return v7;
	}	

	@RequestMapping("/Thrill")
	public ModelAndView displayThrillpage(){
		ModelAndView r5=new ModelAndView("Thrill");
		System.out.println("Thrill also from controller");
		return r5;
	}
	@RequestMapping("/fantasy")
	public ModelAndView displayfantasypage(){
		ModelAndView r6=new ModelAndView("fantasy");
		System.out.println("fantasy also from controller");
		return r6;
	}
	@RequestMapping("/Adventure")
	public ModelAndView displayAdventurepage(){
		ModelAndView r7=new ModelAndView("Adventure");
		System.out.println("Adventure also from controller");
		return r7;
	}
	@RequestMapping("/Horror")
	public ModelAndView displayHorrorpage(){
		ModelAndView r9=new ModelAndView("Horror");
		System.out.println("Horror also from controller");
		return r9;
	}
/*	@RequestMapping("/icefor")
	public ModelAndView displayBusinesspage(){
		ModelAndView r8=new ModelAndView("icefor");
		System.out.println("icefor also from controller");
		return r8;
	}
	@RequestMapping("/storm")
	public ModelAndView displaystormpage(){
		ModelAndView r8=new ModelAndView("storm");
		System.out.println("storm also from controller");
		return r8;
	}
	@RequestMapping("/gonegirl")
	public ModelAndView displaygonegirlpage(){
		ModelAndView r8=new ModelAndView("gonegirl");
		System.out.println("gonegirl also from controller");
		return r8;
	}
	@RequestMapping("/beforei")
	public ModelAndView displaybeforei(){
		ModelAndView r8=new ModelAndView("beforei");
		System.out.println("beforei also from controller");
		return r8;
	}
	@RequestMapping("/pride")
	public ModelAndView displaypride(){
		ModelAndView r8=new ModelAndView("pride");
		System.out.println("pride also from controller");
		return r8;
	}
	@RequestMapping("/greatgatsby")
	public ModelAndView displaygreatgatsby(){
		ModelAndView r8=new ModelAndView("greatgatsby");
		System.out.println("greatgatsby also from controller");
		return r8;
	}
	@RequestMapping("/mockbird")
	public ModelAndView displaymockbird(){
		ModelAndView r8=new ModelAndView("mockbird");
		System.out.println("mockbird also from controller");
		return r8;
	}
	@RequestMapping("/indaftr")
	public ModelAndView displayindaftr(){
		ModelAndView r8=new ModelAndView("indaftr");
		System.out.println("indaftr also from controller");
		return r8;
	}
	@RequestMapping("/indwins")
	public ModelAndView displayindwins(){
		ModelAndView r8=new ModelAndView("indwins");
		System.out.println("mindwins also from controller");
		return r8;
	}
	@RequestMapping("/haryport")
	public ModelAndView displayharyport(){
		ModelAndView r8=new ModelAndView("haryport");
		System.out.println("haryport also from controller");
		return r8;
	}
	@RequestMapping("/harold")
	public ModelAndView displayharold(){
		ModelAndView r8=new ModelAndView("harold");
		System.out.println("harold also from controller");
		return r8;
	}
	@RequestMapping("/bridge")
	public ModelAndView displaybridge(){
		ModelAndView r8=new ModelAndView("bridge");
		System.out.println("bridge also from controller");
		return r8;
	}
	@RequestMapping("/shadowof")
	public ModelAndView displayshadowof(){
		ModelAndView r8=new ModelAndView("shadowof");
		System.out.println("shadowof also from controller");
		return r8;
	}
	@RequestMapping("/threemistak")
	public ModelAndView displaythreemistak(){
		ModelAndView r8=new ModelAndView("threemistak");
		System.out.println("threemistak also from controller");
		return r8;
	}
	@RequestMapping("/whatyoun")
	public ModelAndView displayswhatyoun(){
		ModelAndView r8=new ModelAndView("whatyoun");
		System.out.println("whatyoun also from controller");
		return r8;
	}
	@RequestMapping("/fivepoint")
	public ModelAndView displayfivepoint(){
		ModelAndView r8=new ModelAndView("fivepoint");
		System.out.println("fivepoint also from controller");
		return r8;
	}
	@RequestMapping("/malgudi")
	public ModelAndView displaymalgudi(){
		ModelAndView r8=new ModelAndView("malgudi");
		System.out.println("malgudi also from controller");
		return r8;
	}
	@RequestMapping("/swami")
	public ModelAndView displayswami(){
		ModelAndView r8=new ModelAndView("swami");
		System.out.println("swami also from controller");
		return r8;
	}
	@RequestMapping("/talk")
	public ModelAndView displaytalk(){
		ModelAndView r8=new ModelAndView("talk");
		System.out.println("talk also from controller");
		return r8;
	}
	@RequestMapping("/sher")
	public ModelAndView displaysher(){
		ModelAndView r8=new ModelAndView("sher");
		System.out.println("sher also from controller");
		return r8;
	}
	@RequestMapping("/advnsher")
	public ModelAndView displayadvnsher(){
		ModelAndView r8=new ModelAndView("advnsher");
		System.out.println("advnsher also from controller");
		return r8;
	}
	@RequestMapping("/greatboer")
	public ModelAndView displaygreatboer(){
		ModelAndView r8=new ModelAndView("greatboer");
		System.out.println("greatboer also from controller");
		return r8;
	}
		@RequestMapping("/fearstreet")
	public ModelAndView displayBiopage(){
		ModelAndView v8=new ModelAndView("fearstreet");
		System.out.println("fearstreet also from controller");
		return v8;
	}	
	@RequestMapping("/inheart")
	public ModelAndView displayAwardpage(){
		ModelAndView v9=new ModelAndView("inheart");
		System.out.println("inheart also from controller");
		return v9;
	}	
	@RequestMapping("/ChetanBooks")
	public ModelAndView displayChetanBookspage(){
		ModelAndView r1=new ModelAndView("ChetanBooks");
		System.out.println("ChetanBooks also from controller");
		return r1;
	}
	@RequestMapping("/RKnarayanBooks")
	public ModelAndView displayRKnarayanBookspage(){
		ModelAndView r2=new ModelAndView("RKnarayanBooks");
		System.out.println("RKnarayanBooks also from controller");
		return r2;
	}
	@RequestMapping("/devilgate")
	public ModelAndView displayRonaldsegalbookspage(){
		ModelAndView r3=new ModelAndView("devilgate");
		System.out.println("devilgate also from controller");
		return r3;
	}
	@RequestMapping("/SirArthurBooks")
	public ModelAndView displaySirArthurBookspage(){
		ModelAndView r4=new ModelAndView("SirArthurBooks");
		System.out.println("SirArthurBooks also from controller");
		return r4;
	}*/

}

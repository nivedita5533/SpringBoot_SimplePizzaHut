package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PizzaController {
	
	@RequestMapping("/")
	public String home() {
		
		return "index";
	}
	@RequestMapping("/Details")
	  public String showForm(Model model) {
		
		Pizza pizza=new Pizza();
		List<String> sizelist=Arrays.asList("Small","Medium","Large");
		// List<Integer> pizzasizecost= Arrays.asList(50,100,200);
		 List<Integer> pizzasizeqty= Arrays.asList(1,2,3,4,5,6,7,8);
		 
		 List<String> toppingslist=Arrays.asList("Olives","Onion","Tomato","BabyCorn");
		 List<Integer> pizzatoppingqty= Arrays.asList(1,2,3,4,5,6,7,8);
		 
		 List<String> colddrinkslist=Arrays.asList("Coco-Cola","Pepsi","Cold-Coffee","Iced-Tea");
		 List<Integer> colddrinksqty= Arrays.asList(1,2,3,4,5,6,7,8);
		 
		 
		 model.addAttribute("pizza", pizza);
		 model.addAttribute("sizelist", sizelist);
		// model.addAttribute("pizzasizecost", pizzasizecost);
		 model.addAttribute("pizzasizeqty", pizzasizeqty);
		 
		 model.addAttribute("toppingslist", toppingslist);
		 model.addAttribute("pizzatoppingqty", pizzatoppingqty);
		 
		 model.addAttribute("colddrinkslist", colddrinkslist);
		 model.addAttribute("colddrinksqty", colddrinksqty);
		 
		return "Details";
	}
	
	  @PostMapping("/Details")
	    public String submitForm(@ModelAttribute("pizza") Pizza pizza) {
	         
	        System.out.println(pizza);
	         
	        return "result";
	    }
}

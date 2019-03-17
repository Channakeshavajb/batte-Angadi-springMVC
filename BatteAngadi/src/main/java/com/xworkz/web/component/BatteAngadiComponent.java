package com.xworkz.web.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class BatteAngadiComponent {

	public BatteAngadiComponent() {
		System.out.println("created\t" + this.getClass().getSimpleName());
	}
	
	
	  @RequestMapping("Khareedi") public String onClickKhareedi() {
	  System.out.println("on click of khareedi"); return "BatteAngadi.jsp";
	  
	  }
	 
	
	
	
}

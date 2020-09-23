package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
//@RestController= @Controller + ResponseBody
public class ViewController {
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ModelAndView view(ModelAndView mv) {
		System.out.println("normal view page");
		
		mv.setViewName("home");
		
		return mv;
	}
}

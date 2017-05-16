package com.medical.mallerp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.medical.mallerp.entity.Demo;
import com.medical.mallerp.service.DemoService;

@Controller
@RequestMapping("/demo")
public class DemoController {
	
	@Autowired
	private DemoService demoService;
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public ModelAndView add(HttpServletRequest request, Demo demo) {  
		ModelAndView result = new ModelAndView();
		
		demoService.insert(demo);
		
		result.setViewName("demo");
		return result;
	}
}

package com.wei.zuba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/index")
public class TestController {

	@RequestMapping
	public ModelAndView list() {
		return new ModelAndView("home", "messages", "hello World@");
	}
	
	@RequestMapping(value="/aaa",method=RequestMethod.GET)
	public ModelAndView aaa() {
		return new ModelAndView("home", "messages", "hello World@aaaaa");
	}
}

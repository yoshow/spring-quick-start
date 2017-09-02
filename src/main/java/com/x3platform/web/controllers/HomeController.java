package com.x3platform.web.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	/**
	 * 默认界面
	 */
	@RequestMapping("/index")
	public String index(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
		return "index";
	}
	
	/**
	 * 登陆界面
	 */
	@RequestMapping("hello")
	public String Hello(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
		map.addAttribute("name", "thymeleaf");
		return "hello";
	}
}

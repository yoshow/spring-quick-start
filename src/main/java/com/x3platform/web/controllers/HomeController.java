package com.x3platform.web.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	/**
	 * 登陆界面
	 */
	// @RequestMapping("upload")
	@RequestMapping(value = "/upload", produces = "text/html;charset=utf-8")
	public String Hello(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
		return "hello";
	}
	
	@RequestMapping(value = "/test", produces = "text/html;charset=utf-8")
	@ResponseBody
	public String test(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
		return "中文乱码";
	}
}

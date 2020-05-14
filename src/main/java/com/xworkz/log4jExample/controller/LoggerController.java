package com.xworkz.log4jExample.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoggerController {

	private static final Logger logger = Logger.getLogger(LoggerController.class);

	public LoggerController() {
		logger.info("Default constructor :" + this.getClass().getSimpleName());

	}

	@RequestMapping("message.do")
	public String welcomePage(ModelMap modelMap) {
		modelMap.addAttribute("message", "this is log4j web page");
		logger.info("created the controller: " + this.getClass().getSimpleName());
		return "welcome";

	}
}

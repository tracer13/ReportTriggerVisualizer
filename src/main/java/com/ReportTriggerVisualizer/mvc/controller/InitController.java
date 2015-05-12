package com.ReportTriggerVisualizer.mvc.controller;

import com.ReportTriggerVisualizer.mvc.model.UsersLogCFD;
import com.ReportTriggerVisualizer.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/")
public class InitController {
	@Autowired
	UserService usi;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome() {
		return "index";
	}

	@RequestMapping(value = "/getLogs", method = RequestMethod.GET)
	public ModelAndView listLogs(@RequestParam("actionInput") String actionInput, Map<String,Object> map){

		map.put("logsList", usi.getAllLogsOnAction(actionInput));
		map.put("log", new UsersLogCFD());

		ModelAndView model = new ModelAndView("index");

		return model;
	}
}
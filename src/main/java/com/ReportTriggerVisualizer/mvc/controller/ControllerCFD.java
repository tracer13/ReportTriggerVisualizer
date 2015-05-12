package com.ReportTriggerVisualizer.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/CFDreports.jsp")
public class ControllerCFD {

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome() {
        return "CFDreports";
    }
}

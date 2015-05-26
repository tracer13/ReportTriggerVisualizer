package com.ReportTriggerVisualizer.mvc.controller;

import com.ReportTriggerVisualizer.mvc.model.UsersLogCFD;
import com.ReportTriggerVisualizer.mvc.service.CFDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/CFDreports")
public class ControllerCFD {

    @Autowired
    CFDService cfdService;

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome() {
        return "CFDreports";
    }

    @RequestMapping(value = "/getGroupLogs", method = RequestMethod.GET)
    public ModelAndView listGroupLogs(@RequestParam("accountInputForGroup") String accountInput, Map<String,Object> map){

        map.put("groupHistoryList", cfdService.getGroupLogForAccount(Long.parseLong(accountInput,10)));
        map.put("group", new UsersLogCFD());

        return new ModelAndView("CFDreports");
    }

    @RequestMapping (value = "/getStateLogs", method = RequestMethod.GET)
    public ModelAndView listStateLogs(@RequestParam("accountInputForState") String accountInput, Map<String,Object> map){

        map.put("stateHistoryList", cfdService.getStateLogForAccount(Long.parseLong(accountInput,10)));
        map.put("state", new UsersLogCFD());

        return new ModelAndView("CFDreports");
    }

    @RequestMapping (value = "/getIdLogs", method = RequestMethod.GET)
    public ModelAndView listIdLogs(@RequestParam("accountInputForId") String accountInput, Map<String,Object> map){

        map.put("idHistoryList", cfdService.getIdLogForAccount(Long.parseLong(accountInput)));
        map.put("id", new UsersLogCFD());

        return new ModelAndView("CFDreports");
    }
}

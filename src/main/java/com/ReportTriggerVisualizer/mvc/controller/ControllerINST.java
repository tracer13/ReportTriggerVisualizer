package com.ReportTriggerVisualizer.mvc.controller;

import com.ReportTriggerVisualizer.mvc.model.UsersLogINST;
import com.ReportTriggerVisualizer.mvc.service.INSTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/INSTreports")
public class ControllerINST {

    @Autowired
    INSTService instService;

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome() {
        return "INSTreports";
    }

    @RequestMapping(value = "/getGroupLogs", method = RequestMethod.GET)
    public ModelAndView listGroupLogs(@RequestParam("accountInputForGroup") String accountInput, Map<String,Object> map){

        map.put("groupHistoryList", instService.getGroupLogForAccount(Long.parseLong(accountInput,10)));
        map.put("group", new UsersLogINST());

        return new ModelAndView("INSTreports");
    }

    @RequestMapping (value = "/getStateLogs", method = RequestMethod.GET)
    public ModelAndView listStateLogs(@RequestParam("accountInputForState") String accountInput, Map<String,Object> map){

        map.put("stateHistoryList", instService.getStateLogForAccount(Long.parseLong(accountInput,10)));
        map.put("state", new UsersLogINST());

        return new ModelAndView("INSTreports");
    }

    @RequestMapping (value = "/getIdLogs", method = RequestMethod.GET)
    public ModelAndView listIdLogs(@RequestParam("accountInputForId") String accountInput, Map<String,Object> map){

        map.put("idHistoryList", instService.getIdLogForAccount(Long.parseLong(accountInput)));
        map.put("id", new UsersLogINST());

        return new ModelAndView("INSTreports");
    }
}

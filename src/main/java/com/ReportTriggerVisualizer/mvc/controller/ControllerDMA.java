package com.ReportTriggerVisualizer.mvc.controller;

import com.ReportTriggerVisualizer.mvc.model.UsersLogDMA;
import com.ReportTriggerVisualizer.mvc.service.DMAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/DMAreports")
public class ControllerDMA {

    @Autowired
    DMAService dmaService;

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome() {
        return "DMAreports";
    }

    @RequestMapping(value = "/getGroupLogs", method = RequestMethod.GET)
    public ModelAndView listGroupLogs(@RequestParam("accountInputForGroup") String accountInput, Map<String,Object> map){

        map.put("groupHistoryList", dmaService.getGroupLogForAccount(Long.parseLong(accountInput,10)));
        map.put("group", new UsersLogDMA());

        return new ModelAndView("DMAreports");
    }

    @RequestMapping (value = "/getStateLogs", method = RequestMethod.GET)
    public ModelAndView listStateLogs(@RequestParam("accountInputForState") String accountInput, Map<String,Object> map){

        map.put("stateHistoryList", dmaService.getStateLogForAccount(Long.parseLong(accountInput,10)));
        map.put("state", new UsersLogDMA());

        return new ModelAndView("DMAreports");
    }

    @RequestMapping (value = "/getIdLogs", method = RequestMethod.GET)
    public ModelAndView listIdLogs(@RequestParam("accountInputForId") String accountInput, Map<String,Object> map){

        map.put("idHistoryList", dmaService.getIdLogForAccount(Long.parseLong(accountInput)));
        map.put("id", new UsersLogDMA());

        return new ModelAndView("DMAreports");
    }
}

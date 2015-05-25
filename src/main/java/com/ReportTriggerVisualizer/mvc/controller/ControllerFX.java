package com.ReportTriggerVisualizer.mvc.controller;

import com.ReportTriggerVisualizer.mvc.model.UsersLogFX;
import com.ReportTriggerVisualizer.mvc.service.FXService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/FXreports")
public class ControllerFX {

    @Autowired
    FXService fxService;

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome() {
        return "FXreports";
    }

    @RequestMapping(value = "/getGroupLogs", method = RequestMethod.GET)
    public ModelAndView listGroupLogs(@RequestParam("accountInputForGroup") String accountInput, Map<String,Object> map){

        map.put("groupHistoryList", fxService.getGroupLogForAccount(Long.parseLong(accountInput,10)));
        map.put("group", new UsersLogFX());

        ModelAndView model = new ModelAndView("FXreports");

        return model;
    }

    @RequestMapping (value = "/getStateLogs", method = RequestMethod.GET)
    public ModelAndView listStateLogs(@RequestParam("accountInputForState") String accountInput, Map<String,Object> map){

        map.put("stateHistoryList", fxService.getStateLogForAccount(Long.parseLong(accountInput,10)));
        map.put("state", new UsersLogFX());

        ModelAndView model = new ModelAndView("FXreports");

        return model;
    }

    @RequestMapping (value = "/getIdLogs", method = RequestMethod.GET)
    public ModelAndView listIdLogs(@RequestParam("accountInputForId") String accountInput, Map<String,Object> map){

        map.put("idHistoryList", fxService.getIdLogForAccount(Long.parseLong(accountInput)));
        map.put("id", new UsersLogFX());

        ModelAndView model = new ModelAndView("FXreports");

        return model;
    }
}

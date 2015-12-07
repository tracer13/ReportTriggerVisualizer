package com.ReportTriggerVisualizer.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.Map;

@Controller
@RequestMapping("/PCreports")
public class ControllerMongo {

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome() {
        return "PCreports";
    }

    @RequestMapping(value = "/getWithdrawals", method = RequestMethod.GET)
    public ModelAndView listWithdrawals(@RequestParam("ibCodeInputForWithdrawals") int ibCode, Map<String,Object> map) throws IOException {

        return new ModelAndView("PCreports");
    }

    @RequestMapping(value = "/getTransfers", method = RequestMethod.GET)
    public ModelAndView listTransfers(@RequestParam("ibCodeInputForTransfers") int ibCode, Map<String,Object> map) throws IOException {

        return new ModelAndView("PCreports");
    }

}

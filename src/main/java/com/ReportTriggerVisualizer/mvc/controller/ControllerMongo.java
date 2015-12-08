package com.ReportTriggerVisualizer.mvc.controller;

import com.ReportTriggerVisualizer.mvc.model.mongo.OperationsDWAReport;
import com.ReportTriggerVisualizer.mvc.service.mongo.OperationsDWAReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/PCreports")
public class ControllerMongo {

    @Autowired
    OperationsDWAReportService operationsDWAReportService;

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome() {
        return "PCreports";
    }

    @RequestMapping(value = "/getWithdrawals", method = RequestMethod.GET)
    public ModelAndView listWithdrawals(@RequestParam("ibCodeInputForWithdrawals") int ibCode, Map<String,Object> map) throws IOException {

        List<OperationsDWAReport> withdrawalsList = operationsDWAReportService.getIbWithdrawals(ibCode);
        Double totalWD = 0.0;
        for (OperationsDWAReport odwar : withdrawalsList){
            totalWD = totalWD+odwar.getAmount();
        }

        map.put("withdrawalsList", withdrawalsList);
        map.put("withdrawal", new OperationsDWAReport());
        map.put("totalWithdrawal", "Total: "+totalWD);

        return new ModelAndView("PCreports");
    }

    @RequestMapping(value = "/getTransfers", method = RequestMethod.GET)
    public ModelAndView listTransfers(@RequestParam("ibCodeInputForTransfers") int ibCode, Map<String,Object> map) throws IOException {

        List<OperationsDWAReport> transfersList = operationsDWAReportService.getIbTransfers(ibCode);
        Double totalTransfer = 0.0;
        for (OperationsDWAReport odwar : transfersList){
            totalTransfer = totalTransfer+odwar.getAmount();
        }

        map.put("transfersList", transfersList);
        map.put("transfer", new OperationsDWAReport());
        map.put("totalTransfer", "Total: "+totalTransfer);

        return new ModelAndView("PCreports");
    }

}

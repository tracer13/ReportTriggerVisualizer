package com.ReportTriggerVisualizer.mvc.controller;

import com.ReportTriggerVisualizer.mvc.service.mongo.WithdrawalsTransfers;
import com.mongodb.DBObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/PCreports")
public class ControllerMongo {

    WithdrawalsTransfers withdrawalsTransfers = new WithdrawalsTransfers();

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome() {
        return "PCreports";
    }

    @RequestMapping(value = "/getWithdrawals", method = RequestMethod.GET)
    public ModelAndView listWithdrawals(@RequestParam("ibCodeInputForWithdrawals") int ibCode, Map<String,Object> map) throws IOException {

        List withdrawals = withdrawalsTransfers.getWD(ibCode);
        float totalWD = 0;

        map.put("withdrawalsList", withdrawals);

        for (Object wd : withdrawals){
            totalWD = totalWD + Float.parseFloat(wd.toString());
        }

        map.put("totalWithdrawal", totalWD);

        return new ModelAndView("PCreports");
    }

    @RequestMapping(value = "/getTransfers", method = RequestMethod.GET)
    public ModelAndView listTransfers(@RequestParam("ibCodeInputForTransfers") int ibCode, Map<String,Object> map) throws IOException {

        Map<String,ArrayList> transfers = withdrawalsTransfers.getTransfers(ibCode);
        ArrayList<String> transfersFrom = transfers.get("stringFrom");
        ArrayList<String> transfersTo = transfers.get("stringTo");
        ArrayList<DBObject> transfersFromDBObj = transfers.get("from");
        ArrayList<DBObject> transfersToDBObj = transfers.get("to");
        float totalFrom = 0;
        float totalTo = 0;

        for (DBObject fromTransf : transfersFromDBObj){
            totalFrom = totalFrom + Float.parseFloat(fromTransf.get("Ammount").toString());
        }
        for (DBObject toTransf : transfersToDBObj){
            totalTo = totalTo + Float.parseFloat(toTransf.get("Ammount").toString());
        }

        map.put("transfersFrom", transfersFrom);
        map.put("transfersTo", transfersTo);
        map.put("totalFrom", totalFrom);
        map.put("totalTo", totalTo);

        return new ModelAndView("PCreports");
    }

}

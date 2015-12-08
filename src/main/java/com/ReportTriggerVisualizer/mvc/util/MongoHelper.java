package com.ReportTriggerVisualizer.mvc.util;

import com.ReportTriggerVisualizer.mvc.model.mongo.OperationsDWAReport;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MongoHelper {
    //Sorts ArrayList with DBObjects by 'Ammount' parameter
    public static void sortMongoCollectionByDate(List<OperationsDWAReport> list){
        Collections.sort(list, new Comparator<OperationsDWAReport>() {
            @Override
            public int compare(OperationsDWAReport o1, OperationsDWAReport o2) {
                return o1.getDate().compareTo(o2.getDate());
            }
        });
    }
}

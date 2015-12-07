package com.ReportTriggerVisualizer.mvc.service.mongo;

import com.ReportTriggerVisualizer.mvc.model.mongo.OperationsDWAReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class OperationsDWAReportService {

    @Autowired
    MongoTemplate mongoODWARTemplate;

    public Set<String> getSeparatedCollections() {

        Set<String> collections = mongoODWARTemplate.getCollectionNames();
        Set<String> separatedCollections = new HashSet<String>(collections);

        for (String s : collections) {
            if (s.contains(".2014") || s.contains(".01.2015") || s.contains(".02.2015") || s.contains(".03.2015") || s.contains(".04.2015") ||
                    s.contains(".05.2015") || s.contains(".06.2015") || s.contains(".07.2015")) {
                separatedCollections.remove(s);
            }
        }
        return separatedCollections;
    }

    public List<OperationsDWAReport> getIbWithdrawals(int ibCode) {

        Set<String> collections = getSeparatedCollections();
        ArrayList<OperationsDWAReport> withdrawalsList = new ArrayList<OperationsDWAReport>();

        Criteria criteria = new Criteria().andOperator(
                Criteria.where("Category").is("BMFN Account Withdrawal"),
                Criteria.where("StatusID").is(1),
                Criteria.where("IBCode").is(ibCode));
        Query query = new Query(criteria);

        for (String s : collections) {
            withdrawalsList.addAll(mongoODWARTemplate.find(query, OperationsDWAReport.class, s));
        }
        return withdrawalsList;
    }

    public List<OperationsDWAReport> getIbTransfers(int ibCode) {

        Set<String> collections = getSeparatedCollections();
        ArrayList<OperationsDWAReport> transfersList = new ArrayList<OperationsDWAReport>();

        Criteria criteria = new Criteria().andOperator(
                Criteria.where("Category").is("BMFN Account Internal Transfer"),
                Criteria.where("StatusID").is(1),
                Criteria.where("IBCode").is(ibCode)
        );
        Query query = new Query(criteria);

        for (String s : collections) {
            transfersList.addAll(mongoODWARTemplate.find(query, OperationsDWAReport.class, s));
        }
        return transfersList;
    }
}

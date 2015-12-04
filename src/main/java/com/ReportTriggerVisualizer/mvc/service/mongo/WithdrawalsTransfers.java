package com.ReportTriggerVisualizer.mvc.service.mongo;

import com.ReportTriggerVisualizer.mvc.util.MongoHelpers;
import com.mongodb.*;

import java.io.IOException;
import java.util.*;

public class WithdrawalsTransfers {


    public List getWD(int ibCode) throws IOException{
        MongoClient mongo = new MongoHelpers().startMongo();
        DB db = mongo.getDB("OperationsDWAReport");

        Set<String> collections = db.getCollectionNames();
        ArrayList<String> sortedCollections = new ArrayList<String>();
        sortedCollections.addAll(collections);
        for (String s : collections) {
            if (s.contains(".2014") || s.contains(".01.2015") || s.contains(".02.2015") || s.contains(".03.2015") || s.contains(".04.2015") ||
                    s.contains(".05.2015") || s.contains(".06.2015") || s.contains(".07.2015")) {
                sortedCollections.remove(s);
            }
        }
        ArrayList<Float> withdrawals = new ArrayList<Float>();

        BasicDBObject searchQuery = new BasicDBObject();
        searchQuery.put("Category", "BMFN Account Withdrawal");
        searchQuery.put("IBCode", ibCode);
        searchQuery.put("StatusID", 1);
        BasicDBObject field = new BasicDBObject();
        field.put("Ammount", 1);

        for (String sortedCollection : sortedCollections) {
            DBCollection table = db.getCollection(sortedCollection);
            DBCursor cursor = table.find(searchQuery, field);

            while (cursor.hasNext()) {
                DBObject object = cursor.next();
                withdrawals.add(Float.parseFloat(object.get("Ammount").toString()));
            }
        }
        return withdrawals;
    }

    public Map<String,ArrayList> getTransfers(int ibCode) throws IOException{

        MongoClient mongo = new MongoHelpers().startMongo();
        DB db = mongo.getDB("OperationsDWAReport");

        Set<String> collections = db.getCollectionNames();
        ArrayList<String> sortedCollections = new ArrayList<String>();
        sortedCollections.addAll(collections);
        for (String s : collections) {
            if (s.contains(".2014") || s.contains(".01.2015") || s.contains(".02.2015") || s.contains(".03.2015") || s.contains(".04.2015") ||
                    s.contains(".05.2015") || s.contains(".06.2015") || s.contains(".07.2015")) {
                sortedCollections.remove(s);
            }
        }
        Map<String,ArrayList> transfers = new HashMap<String, ArrayList>();
        ArrayList<DBObject> transfersFrom = new ArrayList<DBObject>();
        ArrayList<DBObject> transfersTo = new ArrayList<DBObject>();
        ArrayList<String> convertedTransfersFrom = new ArrayList<String>();
        ArrayList<String> convertedTransfersTo = new ArrayList<String>();

        BasicDBObject searchQuery = new BasicDBObject();
        searchQuery.put("Category", "BMFN Account Internal Transfer");
        searchQuery.put("IBCode", ibCode);
        searchQuery.put("StatusID", 1);
        BasicDBObject field = new BasicDBObject();
        field.put("Ammount", 1);
        field.put("Account", 1);

        for (String sortedCollection : sortedCollections) {
            DBCollection table = db.getCollection(sortedCollection);
            DBCursor cursor = table.find(searchQuery, field);

            while (cursor.hasNext()) {
                DBObject object = cursor.next();
                if (Float.parseFloat(object.get("Ammount").toString()) > 0) {
                    transfersTo.add(object);
                } else if (Float.parseFloat(object.get("Ammount").toString()) < 0) {
                    transfersFrom.add(object);
                }
            }
        }
        MongoHelpers.sortMongoCollectionByAmount(transfersFrom);
        MongoHelpers.sortMongoCollectionByAmount(transfersTo);
        convertedTransfersFrom = MongoHelpers.castListToString(transfersFrom);
        convertedTransfersTo = MongoHelpers.castListToString(transfersTo);
        transfers.put("stringFrom",convertedTransfersFrom);
        transfers.put("stringTo",convertedTransfersTo);
        transfers.put("from", transfersFrom);
        transfers.put("to", transfersTo);
        return transfers;
    }
}

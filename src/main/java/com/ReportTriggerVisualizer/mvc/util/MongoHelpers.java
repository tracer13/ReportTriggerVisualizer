package com.ReportTriggerVisualizer.mvc.util;

import com.mongodb.DBObject;
import com.mongodb.MongoClient;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Properties;

public class MongoHelpers {

    //Sorts ArrayList with DBObjects by 'Ammount' parameter
    public static void sortMongoCollectionByAmount(ArrayList<DBObject> list){
        Collections.sort(list, new Comparator<DBObject>() {
            @Override
            public int compare(DBObject o1, DBObject o2) {
                return o1.get("Ammount").toString().compareTo(o2.get("Ammount").toString());
            }
        });
    }

    //toString() method for Transfers collection
    public static ArrayList<String> castListToString(ArrayList<DBObject> list){
        ArrayList<String> newList = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++){
            newList.add(list.get(i).get("Account").toString()+" : "+list.get(i).get("Ammount").toString());
        }
        return newList;
    }

    //loads mongo from properties
    Properties properties = new Properties();
    private void loadProperties() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("mongo.properties").getFile());
        properties.load(new FileInputStream(file));
    }
    private String getMongoServer() throws IOException {
        loadProperties();
        return properties.get("mongoServer").toString();
    }
    private int getMongoPort() throws IOException {
        loadProperties();
        return Integer.parseInt(properties.get("mongoPort").toString());
    }
    public MongoClient startMongo() throws IOException{
        return new MongoClient(getMongoServer(), getMongoPort());
    }
}

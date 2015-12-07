package com.ReportTriggerVisualizer.mvc.model.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.sql.Date;

@Document
public class OperationsDWAReport {

    @Id
    private String id;

    @Field(value = "Category")
    private String category;

    @Field(value = "IBCode")
    private int ibCode;

    @Field(value = "StatusID")
    private int statusId;

    @Field(value = "Ammount")
    private float amount;

    @Field(value = "Date")
    private Date date;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getIbCode() {
        return ibCode;
    }

    public void setIbCode(int ibCode) {
        this.ibCode = ibCode;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

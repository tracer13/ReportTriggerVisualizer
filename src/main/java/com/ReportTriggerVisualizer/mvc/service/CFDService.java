package com.ReportTriggerVisualizer.mvc.service;

import com.ReportTriggerVisualizer.mvc.model.UsersLogCFD;

import java.util.List;

public interface CFDService {

    public List<UsersLogCFD> getGroupLogForAccount (Long userLogin);

    public List<UsersLogCFD> getStateLogForAccount (Long userLogin);

    public List<UsersLogCFD> getIdLogForAccount (Long userLogin);
}

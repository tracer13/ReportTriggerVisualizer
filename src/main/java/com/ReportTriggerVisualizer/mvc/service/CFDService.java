package com.ReportTriggerVisualizer.mvc.service;

import com.ReportTriggerVisualizer.mvc.model.UsersLog;

import java.util.List;

public interface CFDService {

    public List<UsersLog> getGroupLogForAccount (Long userLogin);

    public List<UsersLog> getStateLogForAccount (Long userLogin);

    public List<UsersLog> getIdLogForAccount (Long userLogin);
}

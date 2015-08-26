package com.ReportTriggerVisualizer.mvc.service;

import com.ReportTriggerVisualizer.mvc.model.UsersLog;

import java.util.List;

public interface FXService {

    public List<UsersLog> getGroupLogForAccount(Long userLogin);

    public List<UsersLog> getStateLogForAccount(Long userLogin);

    public List<UsersLog> getIdLogForAccount(Long userLogin);
}

package com.ReportTriggerVisualizer.mvc.service;

import com.ReportTriggerVisualizer.mvc.model.UsersLog;

import java.util.List;

public interface FXService {

    List<UsersLog> getGroupLogForAccount(Long userLogin);

    List<UsersLog> getStateLogForAccount(Long userLogin);

    List<UsersLog> getIdLogForAccount(Long userLogin);
}

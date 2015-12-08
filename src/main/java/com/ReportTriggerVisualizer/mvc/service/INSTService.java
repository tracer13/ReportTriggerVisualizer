package com.ReportTriggerVisualizer.mvc.service;

import com.ReportTriggerVisualizer.mvc.model.UsersLog;

import java.util.List;

public interface INSTService {

    List<UsersLog> getGroupLogForAccount(Long userLogin);

    List<UsersLog> getStateLogForAccount(Long userLogin);

    List<UsersLog> getIdLogForAccount(Long userLogin);
}

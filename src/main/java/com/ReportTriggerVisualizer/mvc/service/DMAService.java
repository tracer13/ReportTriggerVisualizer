package com.ReportTriggerVisualizer.mvc.service;

import com.ReportTriggerVisualizer.mvc.model.UsersLogDMA;

import java.util.List;

public interface DMAService {

    List<UsersLogDMA> getGroupLogForAccount(Long userLogin);

    List<UsersLogDMA> getStateLogForAccount(Long userLogin);

    List<UsersLogDMA> getIdLogForAccount(Long userLogin);
}

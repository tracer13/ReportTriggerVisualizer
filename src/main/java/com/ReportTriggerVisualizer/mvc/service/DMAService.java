package com.ReportTriggerVisualizer.mvc.service;

import com.ReportTriggerVisualizer.mvc.model.UsersLogDMA;

import java.util.List;

public interface DMAService {

    public List<UsersLogDMA> getGroupLogForAccount(Long userLogin);

    public List<UsersLogDMA> getStateLogForAccount(Long userLogin);

    public List<UsersLogDMA> getIdLogForAccount(Long userLogin);
}

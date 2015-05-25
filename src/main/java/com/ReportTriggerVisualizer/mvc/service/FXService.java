package com.ReportTriggerVisualizer.mvc.service;

import com.ReportTriggerVisualizer.mvc.model.UsersLogFX;

import java.util.List;

public interface FXService {

    public List<UsersLogFX> getGroupLogForAccount(Long userLogin);

    public List<UsersLogFX> getStateLogForAccount(Long userLogin);

    public List<UsersLogFX> getIdLogForAccount(Long userLogin);
}

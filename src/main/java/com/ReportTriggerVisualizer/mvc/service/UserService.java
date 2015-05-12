package com.ReportTriggerVisualizer.mvc.service;

import com.ReportTriggerVisualizer.mvc.model.UsersLogCFD;

import java.util.List;

public interface UserService {

    List<UsersLogCFD> getAllLogsOnAction(String action);
}

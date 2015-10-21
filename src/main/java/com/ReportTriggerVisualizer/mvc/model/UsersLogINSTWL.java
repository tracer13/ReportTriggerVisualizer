package com.ReportTriggerVisualizer.mvc.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="triggers_users_log", schema = "report_inst_wl")
public class UsersLogINSTWL extends UsersLog {
}

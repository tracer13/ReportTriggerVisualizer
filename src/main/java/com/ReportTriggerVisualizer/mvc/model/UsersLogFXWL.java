package com.ReportTriggerVisualizer.mvc.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="triggers_users_log", schema = "report_fx_wl")
public class UsersLogFXWL extends UsersLog {
}

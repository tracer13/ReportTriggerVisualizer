package com.ReportTriggerVisualizer.mvc.service;

import com.ReportTriggerVisualizer.mvc.model.UsersLogCFD;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<UsersLogCFD> getAllLogsOnAction(String action) {
        Query query = sessionFactory.getCurrentSession()
                .createQuery("FROM UsersLogCFD WHERE action =:action");
        query.setParameter("action", action);

        return query.list();
    }


}

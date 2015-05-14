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
public class CFDServiceImpl implements CFDService {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<UsersLogCFD> getGroupLogForAccount(Long userLogin) {

        Query query = sessionFactory.getCurrentSession()
                .createQuery("FROM UsersLogCFD WHERE changes like '%mt4_user_GROUP%' and userLogin=:userLogin");
        query.setParameter("userLogin",userLogin);
        return query.list();
    }
}

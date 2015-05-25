package com.ReportTriggerVisualizer.mvc.service;

import com.ReportTriggerVisualizer.mvc.model.UsersLogFX;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class FXServiceImpl implements FXService {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<UsersLogFX> getGroupLogForAccount(Long userLogin) {

        Query query = sessionFactory.getCurrentSession()
                .createQuery("FROM UsersLogFX WHERE changes like '%mt4_user_GROUP%' and userLogin=:userLogin");
        query.setParameter("userLogin",userLogin);
        return query.list();
    }

    @Override
    public List<UsersLogFX> getStateLogForAccount(Long userLogin) {

        Query query= sessionFactory.getCurrentSession()
                .createQuery("FROM UsersLogFX WHERE changes like '%mt4_user_State%' and userLogin=:userLogin");
        query.setParameter("userLogin",userLogin);
        return query.list();
    }

    @Override
    public List<UsersLogFX> getIdLogForAccount(Long userLogin) {

        Query query = sessionFactory.getCurrentSession()
                .createQuery("FROM UsersLogFX WHERE changes like '%mt4_user_ID%' and userLogin=:userLogin");
        query.setParameter("userLogin", userLogin);
        return query.list();
    }
}

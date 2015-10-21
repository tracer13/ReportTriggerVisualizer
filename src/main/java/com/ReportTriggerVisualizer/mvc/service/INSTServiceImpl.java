package com.ReportTriggerVisualizer.mvc.service;

import com.ReportTriggerVisualizer.mvc.model.UsersLog;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class INSTServiceImpl implements INSTService{

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<UsersLog> getGroupLogForAccount(Long userLogin) {

        List outputList = null;

        Query query = sessionFactory.getCurrentSession()
                .createQuery("FROM UsersLogINST WHERE changes like '%mt4_user_GROUP%' and userLogin=:userLogin");
        query.setParameter("userLogin",userLogin);
        outputList = query.list();

        if(outputList == null || outputList.isEmpty()){
            Query secondQuery = sessionFactory.getCurrentSession()
                    .createQuery("FROM UsersLogINSTWL WHERE changes like '%mt4_user_GROUP%' and userLogin=:userLogin");
            secondQuery.setParameter("userLogin",userLogin);
            outputList = secondQuery.list();
        }

        return outputList;
    }

    @Override
    public List<UsersLog> getStateLogForAccount(Long userLogin) {

        List outputList = null;

        Query query= sessionFactory.getCurrentSession()
                .createQuery("FROM UsersLogINST WHERE changes like '%mt4_user_State%' and userLogin=:userLogin");
        query.setParameter("userLogin",userLogin);
        outputList = query.list();

        if(outputList == null || outputList.isEmpty()){
            Query secondQuery = sessionFactory.getCurrentSession()
                    .createQuery("FROM UsersLogINSTWL WHERE changes like '%mt4_user_State%' and userLogin=:userLogin");
            secondQuery.setParameter("userLogin",userLogin);
            outputList = secondQuery.list();
        }

        return outputList;
    }

    @Override
    public List<UsersLog> getIdLogForAccount(Long userLogin) {

        List outputList = null;

        Query query = sessionFactory.getCurrentSession()
                .createQuery("FROM UsersLogINST WHERE changes like '%mt4_user_ID%' and userLogin=:userLogin");
        query.setParameter("userLogin", userLogin);
        outputList = query.list();

        if(outputList == null || outputList.isEmpty()){
            Query secondQuery = sessionFactory.getCurrentSession()
                    .createQuery("FROM UsersLogINSTWL WHERE changes like '%mt4_user_ID%' and userLogin=:userLogin");
            secondQuery.setParameter("userLogin",userLogin);
            outputList = secondQuery.list();
        }

        return outputList;
    }
}

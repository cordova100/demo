/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cordova.clinica.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author PCC-SABADO
 */
public class BaseHibernateDAO extends HibernateDaoSupport {

    @Autowired
    public void initSession(SessionFactory sessionFactory) {
        setSessionFactory(sessionFactory);
    }    
    
}

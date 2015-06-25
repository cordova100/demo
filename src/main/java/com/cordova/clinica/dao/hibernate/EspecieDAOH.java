/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cordova.clinica.dao.hibernate;

import com.cordova.clinica.dao.BaseHibernateDAO;
import com.cordova.clinica.dao.EspecieDAO;

import com.cordova.clinica.model.Especie;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author lcordovas
 */

@Transactional
@Repository("especieDAO")
public class EspecieDAOH extends BaseHibernateDAO implements EspecieDAO{

    @Override
    public List<Especie> listar() {
        Criteria criteria = this.getSession().createCriteria(Especie.class);
        return criteria.list();
    }

    @Override
    public Especie buscar(Long id) {
        Criteria criteria = this.getSession().createCriteria(Especie.class);
        criteria.add(Restrictions.eq("id", id));
        return (Especie) criteria.uniqueResult();
    }

    @Override
    public void guardar(Especie especie) {
        this.getSession().save(especie);
    }

    @Override
    public void actualizar(Especie especie) {
        this.getSession().update(especie);
    }

    @Override
    public void eliminar(Especie especie) {
        this.getSession().delete(especie);
    }
    
}

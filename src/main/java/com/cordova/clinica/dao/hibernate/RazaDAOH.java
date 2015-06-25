/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cordova.clinica.dao.hibernate;

import com.cordova.clinica.dao.BaseHibernateDAO;
import com.cordova.clinica.dao.RazaDAO;
import com.cordova.clinica.model.Raza;
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
@Repository("razaDAO")
public class RazaDAOH extends BaseHibernateDAO implements RazaDAO{

    @Override
    public List<Raza> listar() {
        Criteria criteria = this.getSession().createCriteria(Raza.class);
        return criteria.list();
    }

    @Override
    public Raza buscar(Long id) {
        Criteria criteria = this.getSession().createCriteria(Raza.class);
        criteria.add(Restrictions.eq("id", id));
        return (Raza) criteria.uniqueResult();
    }

    @Override
    public void guardar(Raza raza) {
        this.getSession().save(raza);
    }

    @Override
    public void actualizar(Raza raza) {
        this.getSession().update(raza);
    }

    @Override
    public void eliminar(Raza raza) {
        this.getSession().delete(raza);
    }
    
}

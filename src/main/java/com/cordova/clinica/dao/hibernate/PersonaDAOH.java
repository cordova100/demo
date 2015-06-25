/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cordova.clinica.dao.hibernate;

import com.cordova.clinica.dao.BaseHibernateDAO;
import com.cordova.clinica.dao.PersonaDAO;
import com.cordova.clinica.model.Persona;
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
@Repository("personaDAO")
public class PersonaDAOH extends BaseHibernateDAO implements PersonaDAO{

    @Override
    public List<Persona> listar() {
        Criteria criteria = this.getSession().createCriteria(Persona.class);
        return criteria.list();
    }

    @Override
    public Persona buscar(Long id) {
        Criteria criteria = this.getSession().createCriteria(Persona.class);
        criteria.add(Restrictions.eq("id", id));
        return (Persona) criteria.uniqueResult();
    }

    @Override
    public void guardar(Persona persona) {
        this.getSession().save(persona);
    }

    @Override
    public void actualizar(Persona persona) {
        this.getSession().update(persona);
    }

    @Override
    public void eliminar(Persona persona) {
        this.getSession().delete(persona);
    }
    
}

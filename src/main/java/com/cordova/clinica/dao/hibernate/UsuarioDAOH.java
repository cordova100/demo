/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cordova.clinica.dao.hibernate;

import com.cordova.clinica.dao.BaseHibernateDAO;
import com.cordova.clinica.dao.UsuarioDAO;
import com.cordova.clinica.model.Usuario;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 *
 * @author lcordovas
 */
@Repository
public class UsuarioDAOH extends BaseHibernateDAO implements UsuarioDAO{

    @Override
    public Usuario BuscarxUsuario(String usuario) {
        Criteria criteria = this.getSession().createCriteria(Usuario.class);
        criteria.add(Restrictions.eq("email", usuario));
        criteria.add(Restrictions.eq("estado", "ACT"));        
        return (Usuario) criteria.uniqueResult(); 
        
    } 

    @Override
    public List<Usuario> listar() {
        
       Criteria criteria = this.getSession().createCriteria(Usuario.class);
       return criteria.list();        
    }

    @Override
    public Usuario buscar(Long id) {
        Criteria criteria = this.getSession().createCriteria(Usuario.class);
        criteria.add(Restrictions.eq("id", id));
        return (Usuario) criteria.uniqueResult();
    }

    @Override
    public void guardar(Usuario usuario) {
        this.getSession().save(usuario);
    }

    @Override
    public void actualizar(Usuario usuario) {
        this.getSession().update(usuario);
    }

    @Override
    public void eliminar(Usuario usuario) {
        this.getSession().delete(usuario);
    }        

   
}

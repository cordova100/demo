/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cordova.clinica.controller.seguridad;

import com.cordova.clinica.dao.UsuarioDAO;
import com.cordova.clinica.model.Usuario;
import java.util.ArrayList;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author BECA18
 */

/*service: id del bean que buscara el spring*/
@Service("userDetailsService")
@Transactional(readOnly = true)
public class UserDetailsServiceImp implements UserDetailsService {

    @Autowired
    UsuarioDAO UsuarioDAO;

    @Override
    public UserDetails loadUserByUsername(String string) throws UsernameNotFoundException {

        Usuario usuario = UsuarioDAO.BuscarxUsuario(string);

        if (usuario == null) {

            throw new UsernameNotFoundException("usuario no encontrado");
        }

        String password = usuario.getClave();
        
        Collection<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
        roles.add(new SimpleGrantedAuthority(usuario.getPerfil()));
        
        return new User(string,password, roles);

    }
}

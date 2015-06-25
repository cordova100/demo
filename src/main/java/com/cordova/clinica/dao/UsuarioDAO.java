/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cordova.clinica.dao;


import com.cordova.clinica.model.Usuario;
import java.util.List;

/**
 *
 * @author lcordovas
 */
public interface UsuarioDAO {
    
    Usuario BuscarxUsuario(String usuario);
    
    
    List<Usuario> listar();   
    Usuario buscar(Long id);    
    void guardar(Usuario usuario);
    void actualizar(Usuario usuario);
    void eliminar(Usuario usuario); 
    
}

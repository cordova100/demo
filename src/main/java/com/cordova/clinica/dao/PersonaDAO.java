/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cordova.clinica.dao;

import com.cordova.clinica.model.Persona;
import java.util.List;

/**
 *
 * @author lcordovas
 */
public interface PersonaDAO {
    
    List<Persona> listar();   
    Persona buscar(Long id);
    void guardar(Persona persona);
    void actualizar(Persona persona);
    void eliminar(Persona persona);  
    
}

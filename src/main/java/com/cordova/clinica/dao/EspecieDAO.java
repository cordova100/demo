/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cordova.clinica.dao;

import com.cordova.clinica.model.Especie;
import java.util.List;

/**
 *
 * @author lcordovas
 */
public interface EspecieDAO {
    
    List<Especie> listar();   
    Especie buscar(Long id);
    void guardar(Especie especie);
    void actualizar(Especie especie);
    void eliminar(Especie especie);  
    
}

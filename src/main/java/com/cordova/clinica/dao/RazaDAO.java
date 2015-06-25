/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cordova.clinica.dao;

import com.cordova.clinica.model.Raza;
import java.util.List;

/**
 *
 * @author lcordovas
 */
public interface RazaDAO {
    
    List<Raza> listar();   
    Raza buscar(Long id);
    void guardar(Raza raza);
    void actualizar(Raza raza);
    void eliminar(Raza raza);  
    
}

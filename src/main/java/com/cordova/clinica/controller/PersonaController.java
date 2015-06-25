/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cordova.clinica.controller;

import com.cordova.clinica.dao.PersonaDAO;
import com.cordova.clinica.model.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author lcordovas
 */
@Controller
@RequestMapping("persona")
public class PersonaController {

    @Autowired
    PersonaDAO personaDAO;

    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {

        List<Persona> personas = personaDAO.listar();
        model.addAttribute("personas", personas);
        return "clinica/persona/listar";

    }

    @RequestMapping(value = {"/nuevo"})
    public String nuevo(Model model) {

        return "clinica/persona/nuevo";
    }
    
    @RequestMapping(value = {"/guardar"})
    public String guardar(Persona persona) {
        
        personaDAO.guardar(persona);        
        return "redirect:/persona";
    }
    
    @RequestMapping(value = {"/editar/{id}"}, method = RequestMethod.GET)
    public String editar(@PathVariable Long id, Model model) {
        Persona persona = personaDAO.buscar(id); 
        model.addAttribute("persona", persona);        
        return "clinica/persona/editar";
    }
    
    @RequestMapping(value = {"/modificar"})
    public String modificar(Persona persona) {
        
        personaDAO.actualizar(persona);        
        return "redirect:/persona";
    }
    
    @RequestMapping(value = {"/eliminar/{id}"}, method = RequestMethod.GET)
    public String eliminar(@PathVariable Long id) {
        Persona persona =  personaDAO.buscar(id);
        personaDAO.eliminar(persona);        
        return "redirect:/persona";
    }

}

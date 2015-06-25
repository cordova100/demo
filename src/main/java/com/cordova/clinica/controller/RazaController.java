/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cordova.clinica.controller;



import com.cordova.clinica.dao.EspecieDAO;
import com.cordova.clinica.dao.RazaDAO;
import com.cordova.clinica.model.Especie;

import com.cordova.clinica.model.Raza;
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
@RequestMapping("raza")
public class RazaController {

    @Autowired
    RazaDAO razaDAO;
    
    @Autowired
    EspecieDAO especieDAO;

    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {

        List<Raza> razas = razaDAO.listar();
        model.addAttribute("razas", razas);
        return "clinica/raza/listar";

    }

    @RequestMapping(value = {"/nuevo"})
    public String nuevo(Model model) {
        List<Especie> especies  = especieDAO.listar();
        model.addAttribute("especies", especies);
        return "clinica/raza/nuevo";
    }
    
    @RequestMapping(value = {"/guardar"})
    public String guardar(Raza raza) {
        razaDAO.guardar(raza);        
        return "redirect:/raza";
    }
    
    @RequestMapping(value = {"/editar/{id}"}, method = RequestMethod.GET)
    public String editar(@PathVariable Long id, Model model) {
        Raza raza = razaDAO.buscar(id); 
        model.addAttribute("raza", raza);        
        return "clinica/raza/editar";
    }
    
    @RequestMapping(value = {"/modificar"})
    public String modificar(Raza raza) {
        
        razaDAO.actualizar(raza);        
        return "redirect:/raza";
    }
    
    @RequestMapping(value = {"/eliminar/{id}"}, method = RequestMethod.GET)
    public String eliminar(@PathVariable Long id) {
        Raza raza =  razaDAO.buscar(id);
        razaDAO.eliminar(raza);        
        return "redirect:/raza";
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cordova.clinica.controller;
import com.cordova.clinica.dao.EspecieDAO;
import com.cordova.clinica.model.Especie;
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
@RequestMapping("especie")
public class EspecieController {

    @Autowired
    EspecieDAO especieDAO;

    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {

        List<Especie> especies = especieDAO.listar();
        model.addAttribute("especies", especies);
        return "clinica/especie/listar";

    }

    @RequestMapping(value = {"/nuevo"})
    public String nuevo(Model model) {
        
        return "clinica/especie/nuevo";
    }
    
    @RequestMapping(value = {"/guardar"})
    public String guardar(Especie especie) {
        
        especieDAO.guardar(especie);        
        return "redirect:/especie";
    }
    
    @RequestMapping(value = {"/editar/{id}"}, method = RequestMethod.GET)
    public String editar(@PathVariable Long id, Model model) {
        Especie especie = especieDAO.buscar(id); 
        model.addAttribute("especie", especie);        
        return "clinica/especie/editar";
    }
    
    @RequestMapping(value = {"/modificar"})
    public String modificar(Especie especie) {
        
        especieDAO.actualizar(especie);        
        return "redirect:/especie";
    }
    
    @RequestMapping(value = {"/eliminar/{id}"}, method = RequestMethod.GET)
    public String eliminar(@PathVariable Long id) {
        Especie especie =  especieDAO.buscar(id);
        especieDAO.eliminar(especie);        
        return "redirect:/especie";
    }

}

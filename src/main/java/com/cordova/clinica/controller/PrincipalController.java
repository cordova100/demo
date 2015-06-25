/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cordova.clinica.controller;

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author lcordovas
 */
@Controller
public class PrincipalController {
    
    @RequestMapping(value = {"/principal"})
    public String principal(Model model) {
        
        return "clinica/principal";
    }
    
    @RequestMapping(value = {"/persona"})
    public String persona(Model model) {
        
        return "clinica/persona/listar";
    }
    
    @RequestMapping(value = {"/usuario"})
    public String usuario(Model model) {
        
        return "clinica/usuario/listar";
    }
    
    @RequestMapping(value = {"/especie"})
    public String especie(Model model) {
        
        return "clinica/especie/listar";
    }
    
    @RequestMapping(value = {"/raza"})
    public String raza(Model model) {
        
        return "clinica/raza/listar";
    }
}

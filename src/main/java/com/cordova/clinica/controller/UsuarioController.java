/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cordova.clinica.controller;


import com.cordova.clinica.dao.UsuarioDAO;
import com.cordova.clinica.model.Usuario;
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
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    UsuarioDAO usuarioDAO;

    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {

        List<Usuario> usuarios = usuarioDAO.listar();
        model.addAttribute("usuarios", usuarios);
        return "clinica/usuario/listar";

    }

    @RequestMapping(value = {"/nuevo"})
    public String nuevo(Model model) {
        
        return "clinica/usuario/nuevo";
    }
    
    @RequestMapping(value = {"/guardar"})
    public String guardar(Usuario usuario) {
        
        usuarioDAO.guardar(usuario);        
        return "redirect:/usuario";
    }
    
    @RequestMapping(value = {"/editar/{id}"}, method = RequestMethod.GET)
    public String editar(@PathVariable Long id, Model model) {
        Usuario usuario = usuarioDAO.buscar(id); 
        model.addAttribute("usuario", usuario);        
        return "clinica/usuario/editar";
    }
    
    @RequestMapping(value = {"/modificar"})
    public String modificar(Usuario usuario) {
        
        usuarioDAO.actualizar(usuario);        
        return "redirect:/usuario";
    }
    
    @RequestMapping(value = {"/eliminar/{id}"}, method = RequestMethod.GET)
    public String eliminar(@PathVariable Long id) {
        Usuario usuario =  usuarioDAO.buscar(id);
        usuarioDAO.eliminar(usuario);        
        return "redirect:/usuario";
    }

}

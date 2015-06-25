/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cordova.clinica.controller.seguridad;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author lcordovas
 */

@Controller
public class LoginController {
    
    @RequestMapping("index")
    public String index(@RequestParam(required = false) String error, Model model){
    
       if (error != null) {
            model.addAttribute("loginError", true);
        }
        return "seguridad/index"; 
    }
    
}

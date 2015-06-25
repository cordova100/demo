/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cordova.clinica.controller.seguridad;

import com.cordova.clinica.dao.UsuarioDAO;
import com.cordova.clinica.model.Usuario;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

/**
 *
 * @author BECA18
 */
/*component es otra forma de identificar un bean*/
@Component
public class LoginSuccessHandler extends  SimpleUrlAuthenticationSuccessHandler{

    
    @Autowired
    UsuarioDAO usuarioDAO;
    
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, 
                                        HttpServletResponse response, 
                                        Authentication authentication) throws IOException, ServletException {
    
        Usuario usuario = usuarioDAO.BuscarxUsuario(authentication.getName());
        request.getSession().setAttribute("USUARIO_AUTENTICADO", usuario.getPersona());
        this.setDefaultTargetUrl("/principal");
        
        super.onAuthenticationSuccess(request, response, authentication);
        
    }
    
    
    
}

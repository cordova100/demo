/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cordova.clinica.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author lcordovas
 */
@Entity
@Table(name="gen_usuario") 
public class Usuario {
    
    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String clave;
    @Column(name="estado")
    private String estado;
    @Column(name="perfil")
    private String perfil;
    
    @OneToOne
    @JoinColumn(name = "id_persona")
    private Persona persona;

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getClave() {
        return clave;
    }

    public String getEstado() {
        return estado;
    }

    public String getPerfil() {
        return perfil;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    
    
    
}

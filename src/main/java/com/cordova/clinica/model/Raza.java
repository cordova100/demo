/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cordova.clinica.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author LUIS CORDOVA
 */
@Entity
@Table(name="cli_raza")
public class Raza {
    
    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;
    @Column(name="nombre")
    private String nombre;
    @ManyToOne(fetch = FetchType.LAZY) 
    @JoinColumn(name = "id_especie")
    private Especie especie;

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }  
    
    
}

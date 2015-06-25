/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cordova.clinica.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author LUIS CORDOVA
 */
@Entity
@Table(name="cli_especie")
public class Especie {   
    
    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;
    @Column(name="nombre")
    private String nombre;
    @OneToMany(mappedBy = "especie", fetch = FetchType.LAZY)
    private List<Raza> razas;

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Raza> getRazas() {
        return razas;
    }

    public void setRazas(List<Raza> razas) {
        this.razas = razas;
    }   

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }   
    
}

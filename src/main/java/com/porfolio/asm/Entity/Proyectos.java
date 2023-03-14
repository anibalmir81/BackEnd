/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.asm.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//Acá pongo las columnas que tendrá la base de datos
@Entity
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int id;
    private String nombreP;
    private String descripcionP;
    private String fechap;
    private String urlp;
    
     //Constructores

    public Proyectos() {
    }

    public Proyectos(String nombreP, String descripcionP, String fechap, String urlp) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.fechap=fechap;
        this.urlp=urlp;
    }
    
    //Getters & Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }

    public String getFechap() {
        return fechap;
    }

    public void setFechap(String fechap) {
        this.fechap = fechap;
    }

    public String getUrlp() {
        return urlp;
    }

    public void setUrlp(String urlp) {
        this.urlp = urlp;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.asm.Dto;

import javax.validation.constraints.NotBlank;

public class dtoProyectos {
    @NotBlank
    private String nombreP;
    @NotBlank
    private String descripcionP;
    
    private String fechap;
    private String urlp;
    
    //Constructores

    public dtoProyectos() {
    }

    public dtoProyectos(String nombreP, String descripcionP, String fechap, String urlp) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.fechap=fechap;
        this.urlp=urlp;
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
    
    //Getters y Setters

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
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.asm.Dto;

import javax.validation.constraints.NotBlank;

public class dtoExperiencia {
    @NotBlank
    private String empresa;
    @NotBlank
    private String puesto;
    
    private String actividad;
    private String periodo_exp;
    private String img_exp;
    //Constructores

    public dtoExperiencia() {
    }

    public dtoExperiencia(String empresa, String puesto, String actividad, String periodo_exp, String img_exp) {
        this.empresa=empresa;
        this.puesto=puesto;
        this.actividad=actividad;
        this.periodo_exp=periodo_exp;
        this.img_exp=img_exp;
    }
    //Getters & Setters

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getPeriodo_exp() {
        return periodo_exp;
    }

    public void setPeriodo_exp(String periodo_exp) {
        this.periodo_exp = periodo_exp;
    }

    public String getImg_exp() {
        return img_exp;
    }

    public void setImg_exp(String img_exp) {
        this.img_exp = img_exp;
    }
    
}
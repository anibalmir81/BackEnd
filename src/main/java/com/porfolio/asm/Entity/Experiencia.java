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

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int id;
    private String empresa;
    private String puesto;
    private String periodo_exp;
    private String actividad;
    private String img_exp;
    
    //Constructores

    public Experiencia() {
    }

    public Experiencia(String empresa, String puesto, String periodo_exp, String actividad, String img_exp) {
        this.empresa=empresa;
        this.puesto=puesto;
        this.periodo_exp=periodo_exp;
        this.actividad=actividad;
        this.img_exp=img_exp;
        
    }

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

    public String getPeriodo_exp() {
        return periodo_exp;
    }

    public void setPeriodo_exp(String periodo_exp) {
        this.periodo_exp = periodo_exp;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getImg_exp() {
        return img_exp;
    }

    public void setImg_exp(String img_exp) {
        this.img_exp = img_exp;
    }
    
    //Getters y setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }    
}

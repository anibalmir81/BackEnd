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
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int id;
    private String instituto;
    private String carrera;
    private String img_edu;
    private String periodo;
    
    //Constructores

    public Educacion() {
    }

    public Educacion(String instituto, String carrera, String img_edu, String periodo) {
        this.instituto = instituto;
        this.carrera=carrera;
        this.img_edu=img_edu;
        this.periodo=periodo;
    }
    
    //Getters y setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInstituto() {
        return instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getImg_edu() {
        return img_edu;
    }

    public void setImg_edu(String img_edu) {
        this.img_edu = img_edu;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}
    

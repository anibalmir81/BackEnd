/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.asm.Dto;

import javax.validation.constraints.NotBlank;

public class dtoEducacion {
    @NotBlank
    private String instituto;
    @NotBlank
    private String carrera;
    @NotBlank
    private String periodo;
    
    private String img_edu;
    //Constructores

    public dtoEducacion() {
    }

    public dtoEducacion(String instituto, String carrera, String periodo, String img_edu) {
        this.instituto=instituto;
        this.carrera=carrera;
        this.periodo=periodo;
        this.img_edu=img_edu;
    }
    //Getters & Setters

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

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getImg_edu() {
        return img_edu;
    }

    public void setImg_edu(String img_edu) {
        this.img_edu = img_edu;
    }
}
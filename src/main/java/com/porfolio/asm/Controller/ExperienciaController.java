/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.asm.Controller;

import com.porfolio.asm.Dto.dtoExperiencia;
import com.porfolio.asm.Entity.Experiencia;
import com.porfolio.asm.Security.Controller.Mensaje;
import com.porfolio.asm.Service.ImpExperienciaService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exp/")
/**@CrossOrigin(origins = "https://pintegradorarc.web.app/edu/")**/
@CrossOrigin(origins = "http://localhost:8080")

public class ExperienciaController {
    @Autowired
    ImpExperienciaService sExperiencia;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Experiencia>> list(){
        List<Experiencia> list = sExperiencia.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Experiencia> getById(@PathVariable("id") int id){
        if(!sExperiencia.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Experiencia experiencia = sExperiencia.getOne(id).get();
        return new ResponseEntity(experiencia, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sExperiencia.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        sExperiencia.delete(id);
        return new ResponseEntity(new Mensaje("experiencia eliminado"), HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoExperiencia dtoexp){      
        if(StringUtils.isBlank(dtoexp.getEmpresa()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(sExperiencia.existsByEmpresa(dtoexp.getEmpresa()))
            return new ResponseEntity(new Mensaje("Esa experiencia existe"), HttpStatus.BAD_REQUEST);
        
        Experiencia experiencia = new Experiencia(dtoexp.getEmpresa(), dtoexp.getPuesto(),dtoexp.getActividad(),dtoexp.getPeriodo_exp(),dtoexp.getImg_exp());
        sExperiencia.save(experiencia);
        
        return new ResponseEntity(new Mensaje("Experiencia agregada"), HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoExperiencia dtoexp){
        //Validamos si existe el ID
        if(!sExperiencia.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        //Compara nombre de experiencias
        if(sExperiencia.existsByEmpresa(dtoexp.getEmpresa()) && sExperiencia.getByEmpresa(dtoexp.getEmpresa()).get().getId() != id)
            return new ResponseEntity(new Mensaje("Esa experiencia ya existe"), HttpStatus.BAD_REQUEST);
        //No puede estar vacio
        if(StringUtils.isBlank(dtoexp.getEmpresa()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Experiencia experiencia = sExperiencia.getOne(id).get();
        experiencia.setEmpresa(dtoexp.getEmpresa());
        experiencia.setPuesto((dtoexp.getPuesto()));
        experiencia.setActividad(dtoexp.getActividad());
        experiencia.setPeriodo_exp(dtoexp.getPeriodo_exp());
        experiencia.setImg_exp(dtoexp.getImg_exp());
        
        sExperiencia.save(experiencia);
        return new ResponseEntity(new Mensaje("Experiencia actualizada"), HttpStatus.OK);
             
    }
}

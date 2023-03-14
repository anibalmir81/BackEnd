/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.asm.Service;

import com.porfolio.asm.Entity.Educacion;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.porfolio.asm.Repository.IEducacionRepository;

@Service
@Transactional
public class ImpEducacionService {
    @Autowired
    IEducacionRepository rEducacion;
    
    public List<Educacion> list(){
        return rEducacion.findAll();
    }
    
    public Optional<Educacion>getOne(int id){
        return rEducacion.findById(id);
    }
    
    public Optional<Educacion> getByInstituto(String instituto) {
        return rEducacion.findByInstituto(instituto);
                
    }
    
    public void save(Educacion edu){
        rEducacion.save(edu);
    }
    
    public void delete(int id){
        rEducacion.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rEducacion.existsById(id);
    }
    
    public boolean existsByInstituto(String instituto) {
        return rEducacion.existsByInstituto(instituto);
    }

}

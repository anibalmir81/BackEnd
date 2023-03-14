/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.asm.Service;

import com.porfolio.asm.Entity.Experiencia;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.porfolio.asm.Repository.IExperienciaRepository;

@Service
@Transactional

public class ImpExperienciaService {
    @Autowired
    IExperienciaRepository rExperiencia;
    
    public List<Experiencia> list(){
        return rExperiencia.findAll();
    }
    
    public Optional<Experiencia>getOne(int id){
        return rExperiencia.findById(id);
    }
    
    public Optional<Experiencia> getByEmpresa(String empresa) {
        return rExperiencia.findByEmpresa(empresa);    
    }
    
    public void save(Experiencia expe){
        rExperiencia.save(expe);
    }
    
    public void delete(int id){
        rExperiencia.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rExperiencia.existsById(id);
    }
    
    public boolean existsByEmpresa(String empresa) {
        return rExperiencia.existsByEmpresa(empresa);
    }
}

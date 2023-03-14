/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.asm.Service;

import com.porfolio.asm.Entity.Proyectos;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.porfolio.asm.Repository.IProyectosRepository;

@Service
@Transactional
public class ImpProyectosService {
    @Autowired
    IProyectosRepository rProyectos;
    
    public List<Proyectos> list(){
        return rProyectos.findAll();
    }
    
    public Optional<Proyectos>getOne(int id){
        return rProyectos.findById(id);
    }
    
    public Optional<Proyectos> getByNombreP(String nombreP) {
        return rProyectos.findByNombreP(nombreP);
                
    }
    
    public void save(Proyectos proy){
        rProyectos.save(proy);
    }
    
    public void delete(int id){
        rProyectos.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rProyectos.existsById(id);
    }
    
    public boolean existsByNombreP(String nombreP) {
        return rProyectos.existsByNombreP(nombreP);
    }
}

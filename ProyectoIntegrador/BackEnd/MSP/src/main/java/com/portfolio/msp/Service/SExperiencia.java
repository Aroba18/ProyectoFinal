/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.msp.Service;

import com.portfolio.msp.Entity.Experiencia;
import com.portfolio.msp.Repository.RExperiencia;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia {
    @Autowired
    RExperiencia rExperiencia;
    
    public List<Experiencia> list(){
        return rExperiencia.findAll();
    }
    
    public Optional<Experiencia> getOne(int id){
        return rExperiencia.findById(id);
    }
    
    public Optional<Experiencia> getByNombreE(String nombreE){
        return rExperiencia.findByNombreE(nombreE);
    }
    
    public void save(Experiencia expe) {
        rExperiencia.save(expe);
    }
    
    public void delete(int id) {
        rExperiencia.deleteById(id);
    }
    
    public boolean existById(int id) {
        return rExperiencia.existsById(id);
    }
    
    public boolean exixtsByNombreE(String nombreE){
        return rExperiencia.existsByNombreE(nombreE);
    }

    public boolean existsByNombreE(String nombreE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean existsById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

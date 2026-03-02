/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gm.brunoriul.garage.services;

import br.gm.brunoriul.garage.entities.Veiculos;
import br.gm.brunoriul.garage.repositories.GarageRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author digma
 */

@Service
public class GarageService {
    
    @Autowired
    private GarageRepository garageRepository;
    
    public List<Veiculos> findAll() {
        
        List<Veiculos> result = garageRepository.findAll();
        return result;
    }
    
   public Veiculos findById(long id) {
        
        Veiculos result = garageRepository.findById(id);
        return result;
    }
   
   public List<Veiculos> findByCor(String cor) {
        List<Veiculos> result = garageRepository.findByCor(cor);
        return result;
    }
}

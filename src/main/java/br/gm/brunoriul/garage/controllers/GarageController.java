/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gm.brunoriul.garage.controllers;

import br.gm.brunoriul.garage.entities.Veiculos;
import br.gm.brunoriul.garage.services.GarageService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author digma
 */

@RestController
public class GarageController {
    
    @Autowired
    private GarageService garageService;
    
    @GetMapping("/forsale")
    public List<Veiculos> findAll() {
        List<Veiculos> result = garageService.findAll();
        return result;
    }
    
    @GetMapping("/forsale/{id}")
    public ResponseEntity<Veiculos> findById(@PathVariable long id) {
        Veiculos result = garageService.findById(id);
        
        if (result == null){
            return ResponseEntity.notFound().build();
        }
        
        else {
            return ResponseEntity.ok(result);
        }
        
    }
    
    
}

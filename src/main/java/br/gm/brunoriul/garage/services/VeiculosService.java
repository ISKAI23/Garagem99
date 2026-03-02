/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gm.brunoriul.garage.services;

import br.gm.brunoriul.garage.DTO.VeiculosMinDTO;
import br.gm.brunoriul.garage.entities.Veiculos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.gm.brunoriul.garage.repositories.VeiculosRepository;

/**
 *
 * @author digma
 */

@Service
public class VeiculosService {
    
    @Autowired
    private VeiculosRepository garageRepository;
    
    public List<VeiculosMinDTO> findAll() {
        
        List<Veiculos> result = garageRepository.findAll();
        List<VeiculosMinDTO> resultDTO = result.stream().map(x -> new VeiculosMinDTO(x)).toList();
        return resultDTO;
    }
    
   public VeiculosMinDTO findById(long id) {
        
        Veiculos result = garageRepository.findById(id);
        VeiculosMinDTO resultDTO = new VeiculosMinDTO(result);
        return resultDTO;
    }
   
   public List<VeiculosMinDTO> findByAno(int ano) {
        
        List<Veiculos> result = garageRepository.findByAno(ano);
        List<VeiculosMinDTO> resultDTO = result.stream().map(x -> new VeiculosMinDTO(x)).toList();
        return resultDTO;
    }
   
   public List<Veiculos> findByCor(String cor) {
        List<Veiculos> result = garageRepository.findByCor(cor);
        return result;
    }
}

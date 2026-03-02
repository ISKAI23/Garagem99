/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.gm.brunoriul.garage.repositories;

import br.gm.brunoriul.garage.entities.Veiculos;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author digma
 */
public interface GarageRepository extends JpaRepository<Veiculos, Long>{
    
    Veiculos findById(long id);
    
    
}

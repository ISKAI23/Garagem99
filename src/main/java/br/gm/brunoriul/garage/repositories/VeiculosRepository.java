/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.gm.brunoriul.garage.repositories;

import br.gm.brunoriul.garage.entities.Veiculos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author digma
 */
public interface VeiculosRepository extends JpaRepository<Veiculos, Long>{
    
    Veiculos findById(long id);
    
    List<Veiculos> findByAno(int ano);
    
    List<Veiculos> findByCor(String cor);  
}

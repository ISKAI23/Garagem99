/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gm.brunoriul.garage.DTO;

import br.gm.brunoriul.garage.entities.Veiculos;

/**
 *
 * @author digma
 */
public class VeiculosMinDTO {
    
    //Marca Modelo Cor Ano KM LinkImagem

    private String marca;
    private String modelo;
    private String cor;
    
    private int ano;
    private int km;

    private String linkImagem;
   
    private String descricaoCompleta;
    
    private String avarias;

    public VeiculosMinDTO() {
    }

    public VeiculosMinDTO(Veiculos veiculos) {
        this.marca = veiculos.getMarca();
        this.modelo = veiculos.getModelo();
        this.cor = veiculos.getCor();
        this.ano = veiculos.getAno();
        this.km = veiculos.getKm();
        this.linkImagem = veiculos.getLinkImagem();
        this.descricaoCompleta = veiculos.getDescricaoCompleta();
        this.avarias = veiculos.getAvarias();
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public int getKm() {
        return km;
    }

    public String getLinkImagem() {
        return linkImagem;
    }

    public String getDescricaoCompleta() {
        return descricaoCompleta;
    }

    public String getAvarias() {
        return avarias;
    }

}

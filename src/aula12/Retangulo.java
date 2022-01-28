/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

/**
 *
 * @author Ana
 */
public class Retangulo extends Forma {
    private Double lado;
    private Double altura;
    private Double raio;
    
    @Override
    public Double calcularArea() {
        return this.lado * this.altura;
    }

    @Override
    public Double calcularPerimetro() {
        return 2 * 3.14 * this.raio;
    }
    
}

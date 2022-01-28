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
public class Circulo extends Forma {
    private Double raio = 3.0;
    
    @Override
    public Double calcularArea() {
        return this.raio * 3.14;
    }

    @Override
    public Double calcularPerimetro() {
        return 2 * 3.14 * this.raio;
    }
    
}

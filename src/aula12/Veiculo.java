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
public abstract class Veiculo {
    private float velocidade = 0;
    
    public float acelerar(float velocidade) {
       this.velocidade += velocidade;
        return this.velocidade;
    }
    
    public void parar() {
        System.out.println("Parando...");
        this.velocidade = 0;
    }
    
}

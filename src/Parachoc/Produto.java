/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parachoc;

import java.util.ArrayList;

/**
 *
 * @author a
 */

public class Produto {
    private String nome;
    int peso;
    ArrayList<Ingrediente> listaingredientes;
    
    
    public Produto(String n, int p, ArrayList<Ingrediente> l){
        this.nome=n;
        this.peso=p;
        listaingredientes=l;
        
    }
    
    public void produzir(){
        
        
        
    }
}

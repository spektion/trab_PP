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
    public String nome;
    public int peso;
    public ArrayList<Ingrediente> listaingredientes;
    
    public Produto(){
        
        
    }
    
    public Produto(String n, int p, ArrayList<Ingrediente> l){
        this.nome=n;
        this.peso=p;
        listaingredientes=l;
        
    }
 

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @return the listaingredientes
     */
    public ArrayList<Ingrediente> getListaingredientes() {
        return listaingredientes;
    }

    /**
     * @param listaingredientes the listaingredientes to set
     */
    public void setListaingredientes(ArrayList<Ingrediente> listaingredientes) {
        this.listaingredientes = listaingredientes;
    }
}

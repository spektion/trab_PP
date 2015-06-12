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
public class Especialista{
     public String nome;
     public tproduto especialidade;
     public boolean alocado=false;
     public int emespera;
     //public ArrayList<Produto> listaprodutosempera;
     
     
    public Especialista(){
        
        
    }
    public Especialista(String n, tproduto p){
        this.nome=n;
        this.especialidade=p;
        
    }
    
    public String toString(){
        String exit;
        exit=this.getNome()+" Esp:"+this.getEspecialidade()+" A trab:" +this.isAlocado()+" Q Esp:"+this.emespera;
        
        
        return exit;
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
     * @return the especialidade
     */
    public tproduto getEspecialidade() {
        return especialidade;
    }

    /**
     * @param especialidade the especialidade to set
     */
    public void setEspecialidade(tproduto especialidade) {
        this.especialidade = especialidade;
    }

    /**
     * @return the alocado
     */
    public boolean isAlocado() {
        return alocado;
    }

    /**
     * @param alocado the alocado to set
     */
    public void setAlocado(boolean alocado) {
        this.alocado = alocado;
    }

    /**
     * @return the emespera
     */
    public int getEmespera() {
        return emespera;
    }

    /**
     * @param emespera the emespera to set
     */
    public void setEmespera(int emespera) {
        this.emespera = emespera;
    }

    
     
}

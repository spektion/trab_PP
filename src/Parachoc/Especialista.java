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
     public ArrayList<Produto> listaprodutosempera;
     
     
    public Especialista(){
        
        
    }
    public Especialista(String n, tproduto p){
        this.nome=n;
        this.especialidade=p;
        this.listaprodutosempera= new ArrayList();
        
    }
    
    public String toString(){
        String exit;
        exit=this.getNome()+" Esp:"+this.getEspecialidade()+" A trab:" +this.isAlocado()+" Q Esp:"+this.getListaprodutosempera().size();
        
        
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
     * @return the listaprodutosempera
     */
    public ArrayList<Produto> getListaprodutosempera() {
        return listaprodutosempera;
    }

    /**
     * @param listaprodutosempera the listaprodutosempera to set
     */
    public void setListaprodutosempera(ArrayList<Produto> listaprodutosempera) {
        this.listaprodutosempera = listaprodutosempera;
    }
     
}

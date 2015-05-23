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

public class BD{
        
   public ArrayList<Ingrediente> listaingredientes;
   public ArrayList<Especialista> listaespecialistas;
   

   
   public BD(){
       this.listaingredientes=new ArrayList(); 
       this.listaespecialistas=new ArrayList();
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

    /**
     * @return the listaespecialistas
     */
    public ArrayList<Especialista> getListaespecialistas() {
        return listaespecialistas;
    }

    /**
     * @param listaespecialistas the listaespecialistas to set
     */
    public void setListaespecialistas(ArrayList<Especialista> listaespecialistas) {
        this.listaespecialistas = listaespecialistas;
    }
   
}
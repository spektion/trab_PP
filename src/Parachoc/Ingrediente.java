/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parachoc;

/**
 *
 * @author a
 */
public class Ingrediente {
   private String nome;
   int quantidadeemstock;
   
   public Ingrediente(String n, int q){
       this.nome=n;
       this.quantidadeemstock=q;
   }
   
   public void adicionarstock(int q){
       this.quantidadeemstock=this.quantidadeemstock+q;
   }
   
   public String toString(){
       String exit;
       
       exit="Ingrediente "+this.nome+"Quantidade em stock: "+this.quantidadeemstock+"kg";
       return exit;
   }
}

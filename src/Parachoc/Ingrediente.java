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
   public String nome;
   public int quantidadeemstock;
   
   public Ingrediente(String n, int q){
       this.nome=n;
       this.quantidadeemstock=q;
   }
   
   public void adicionarstock(int q){
       this.setQuantidadeemstock(this.getQuantidadeemstock() + q);
   }
   
   public String toString(){
       String exit;
       
       exit="Ingrediente: "+this.getNome()+" Quantidade em stock: "+this.getQuantidadeemstock()+"g";
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
     * @return the quantidadeemstock
     */
    public int getQuantidadeemstock() {
        return quantidadeemstock;
    }

    /**
     * @param quantidadeemstock the quantidadeemstock to set
     */
    public void setQuantidadeemstock(int quantidadeemstock) {
        this.quantidadeemstock = quantidadeemstock;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parachoc;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a
 */
public class UnidadeProducao implements Runnable{
    public Produto produto;
    public tproduto tp;
    public Especialista especialista;
    public boolean uso=false;
    public int tempoexecucao=0;
    //public Thread thread;
    
    public UnidadeProducao(tproduto tp){
        //this.especialista=e;
        //this.produto=p;
        this.tp=tp;
        this.uso=false;
        
        if (tp==tproduto.TabChoc){
            this.tempoexecucao=3000;
        }
        else if (tp==tproduto.TabChocAmendPassas)
            this.tempoexecucao=4500;
        else if (tp==tproduto.TabChocCaram)
            this.tempoexecucao=3700;
        else
            this.tempoexecucao=400;
    }
    
    public void run(){
       // try {
            //Thread nunca pára, pode é ficar suspensa
            while(true){
                //Espera a até ter ingredientes para trabalhar
                //List<Ingrediente> ingredientesDaFila = getIngredientes();

                //Retira estes ingredientes da fila de ingrediente e move para a sua própria fila
                /*for(Ingrediente ingrediente:ingredientesDaFila){
                    dados.retirarIngrediente(ingrediente);
                    ingredientes.add(ingrediente);
                }*/

                //Processa os ingredientes, criando ordens de produção
               // planearProducao();

                //Produzir
                //produzir();
       //     }
        //} catch(InterruptedException ex){
        //    ex.printStackTrace();
        //}
        synchronized(this){
            if (this.isUso()==false) {
                try{
                    this.wait();
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
            else{
        
                try{
                    
                    System.out.println("A produzir....."+this.tp);
                    Thread.sleep(this.getTempoexecucao());
                    System.out.println("Acabou de produzir....."+this.tp);
                    this.uso=false;
                   // this.wait();
                    break;// Caso contrario nao sai do while
                } 
                catch (InterruptedException ex) {
                    Logger.getLogger(UnidadeProducao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }   
            
            
            }}
}
    
    /*public void go() {
        if (thread == null || (!thread.isAlive())) {
            thread = new Thread(this);
                        
            //thread.run();
            thread.start();
        }
    }*/
    
    public String toString(){
        String exit;
        if (this.uso==false)
            exit="A unidade de producao "+this.tp+" esta parada";
        
        else
            exit="Unidade de Producao:"+this.tp+" Especialista Atribuido:"+this.especialista.nome+" A trabalhar: "+this.uso;
        //exit="ToString notworking";
        return exit;
    }

    /**
     * @return the produto
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    /**
     * @return the especialista
     */
    public Especialista getEspecialista() {
        return especialista;
    }

    /**
     * @param especialista the especialista to set
     */
    public void setEspecialista(Especialista especialista) {
        this.especialista = especialista;
    }

    /**
     * @return the uso
     */
    public boolean isUso() {
        return uso;
    }

    /**
     * @param uso the uso to set
     */
    public void setUso(boolean uso) {
        this.uso = uso;
    }

    /**
     * @return the tempoexecucao
     */
    public int getTempoexecucao() {
        return tempoexecucao;
    }

    /**
     * @param tempoexecucao the tempoexecucao to set
     */
    public void setTempoexecucao(int tempoexecucao) {
        this.tempoexecucao = tempoexecucao;
    }

    
}

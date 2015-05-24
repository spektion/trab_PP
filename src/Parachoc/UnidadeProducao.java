/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parachoc;

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
    public Thread thread;
    
    public UnidadeProducao(tproduto tp, Especialista e, Produto p){
        this.especialista=e;
        this.produto=p;
        this.tp=tp;
       
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
        this.setUso(true);
            try{
                System.out.println("A produzir....."+this.tp);
                Thread.sleep(this.getTempoexecucao());
                System.out.println("Acabou de produzir....."+this.tp);
                
            } 
            catch (InterruptedException ex) {
                Logger.getLogger(UnidadeProducao.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    public void go() {
        if (thread == null || (!thread.isAlive())) {
            thread = new Thread(this);
                        
            //thread.run(); //Esperimentar sem thread.
            thread.start();
        }
    }
    
    public String toString(){
        String exit;
        if (this.uso==false)
            exit="A unidade de producao "+this.tp+" esta parada";
        
        else
            exit="Unidade de Producao:"+this.produto.nome+" Especialista Atribuido:"+this.especialista.nome+" A trbalhar: "+this.uso;
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

    /**
     * @return the thread
     */
    public Thread getThread() {
        return thread;
    }

    /**
     * @param thread the thread to set
     */
    public void setThread(Thread thread) {
        this.thread = thread;
    }
}

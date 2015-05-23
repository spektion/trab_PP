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
    public Especialista especialista;
    public boolean uso=false;
    public int tempoexecucao=0;
    public Thread thread;
    
    public UnidadeProducao(tproduto tp, Especialista e, Produto p){
        this.especialista=e;
        this.produto=p;
        
       
        if (tp==tproduto.TabChoc){
            this.tempoexecucao=30;
        }
        else if (tp==tproduto.TabChocAmendPassas)
            this.tempoexecucao=45;
        else if (tp==tproduto.TabChocCaram)
            this.tempoexecucao=37;
        else
            this.tempoexecucao=4;
    }
    
    public void run(){
        this.setUso(true);
            try{
                Thread.sleep(this.getTempoexecucao()); 
            } 
            catch (InterruptedException ex) {
                Logger.getLogger(UnidadeProducao.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    
    public String toString(){
        String exit;
        //exit=this.getNome();
        //exit="Unidade de Producao:"+this.produto.nome+" Especialista Atribuido:"+this.especialista.nome+" A trbalhar: "+this.uso;
        exit="ToString notworking";
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

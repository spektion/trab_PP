/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parachoc.gui;

import java.awt.*;
import javax.swing.*;
import Parachoc.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.text.DefaultCaret;
import sun.misc.IOUtils;
/**
 *
 * @author a
 */
public class ParachocMain extends javax.swing.JFrame {
    ArrayList<Ingrediente> listaingredientes;
    ArrayList<Especialista> listaespecialistas;
    
    
    UnidadeProducao Threadtabletesimples;
    UnidadeProducao Threadtableteamendoas;
    UnidadeProducao Threadtabletecaramelo;
    UnidadeProducao Threadamendoas;
    
    
    /**
     * Creates new form ParachocMain2
     */

    
public void adiciona_log(String s){
        
    jTextareaadmin.append(s);
    jTextareaadmin.append("\n");
    jTextareaadmin.update(jTextareaadmin.getGraphics());
}
    
    public ParachocMain() {
        initComponents();
        initApp();
        
        
        jPanelprincipal.setVisible(true);
        
    }
    
    
    public void initApp(){
        listaingredientes = new ArrayList();
        listaespecialistas = new ArrayList();
        
        // Criacao manual para testes //NAO APAGAR
        listaingredientes.add(new Ingrediente("Cacau",500));
        this.adiciona_log("Adicionado 500g de cacau");
        listaingredientes.add(new Ingrediente("Amendoas",500));
        this.adiciona_log("Adicionado 500g de amendoas");
        listaingredientes.add(new Ingrediente("Caramelo",250));
        this.adiciona_log("Adicionado 250g de caramelo");
        listaingredientes.add(new Ingrediente("Passas",125));
        this.adiciona_log("Adicionado 125g de passas");
        
        for (int i=0; i<listaingredientes.size();i++){
           // jTextareaarmazem.
            if (jTextareaarmazem.getText().compareTo("")==0)
                jTextareaarmazem.append(listaingredientes.get(i).toString());
            else{
                jTextareaarmazem.append("\n");
                jTextareaarmazem.append("\n");
                jTextareaarmazem.append(listaingredientes.get(i).toString());
            }
        }
      
        
        /*Threadtabletesimples=new UnidadeProducao(tproduto.TabChoc);
        this.adiciona_log("Thread Threadtabletesimples criada");
        
        Threadtableteamendoas=new UnidadeProducao(tproduto.TabChocAmendPassas);
        this.adiciona_log("Thread Threadtableteamendoas criada");
        Threadtabletecaramelo=new UnidadeProducao(tproduto.TabChocCaram);
        this.adiciona_log("Thread Threadtabletecaramelo criada");
        Threadamendoas=new UnidadeProducao(tproduto.AmendChoc);
        this.adiciona_log("Thread Threadamendoas criada");*/
       /*
        jTextareauproducao.append(Threadtabletesimples.toString());
        jTextareauproducao.append("\n");
        jTextareauproducao.append("\n");
        jTextareauproducao.append(Threadtableteamendoas.toString());
        jTextareauproducao.append("\n");
        jTextareauproducao.append("\n");
        jTextareauproducao.append(Threadtabletecaramelo.toString());
        jTextareauproducao.append("\n");
        jTextareauproducao.append("\n");
        jTextareauproducao.append(Threadamendoas.toString());*/
        
        listaespecialistas.add(new Especialista("Luis Franco",tproduto.TabChoc));
        this.adiciona_log("Especialista Luis Franco criado");
        listaespecialistas.add(new Especialista("Vitor Filipe",tproduto.TabChocAmendPassas));
        this.adiciona_log("Especialista Vitor Filipe criado");
        listaespecialistas.add(new Especialista("Goncalo Faria",tproduto.TabChocCaram));
        this.adiciona_log("Especialista Goncalo Faria criado");
        listaespecialistas.add(new Especialista("Luis Filipe Faria",tproduto.AmendChoc));
        this.adiciona_log("Especialista Luis Filipe Faria criado");
        /*listaespecialistas.add(new Especialista("Jacques Arsac",tproduto.TabChoc));
        this.adiciona_log("Especialista Jacques Arsac criado");
        listaespecialistas.add(new Especialista("Enviusamento",tproduto.TabChocAmendPassas));
        this.adiciona_log("Especialista Enviusamento criado");
        listaespecialistas.add(new Especialista("Tijolosde8",tproduto.TabChocCaram));
        this.adiciona_log("Especialista Tijolosde8 criado");
        listaespecialistas.add(new Especialista("Erasmus",tproduto.AmendChoc));
        this.adiciona_log("Especialista Erasmus criado");*/
        
        /*for (int i=0; i<listaespecialistas.size();i++){
           // jTextareaarmazem.
            if (jTextareaespecialistas.getText().compareTo("")==0)
                jTextareaespecialistas.append(listaespecialistas.get(i).toString());
            else{
                jTextareaespecialistas.append("\n");
                jTextareaespecialistas.append("\n");
                jTextareaespecialistas.append(listaespecialistas.get(i).toString());
            }
        } */ 
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelprincipal = new javax.swing.JPanel();
        jPanelProducao = new javax.swing.JPanel();
        jLabelpainelunidadesproducao = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextareauproducao = new javax.swing.JTextArea();
        jPanelArmazem = new javax.swing.JPanel();
        jLabelpainelarmazem = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextareaarmazem = new javax.swing.JTextArea();
        jButtoningredientesler = new javax.swing.JButton();
        jPanelespecialista = new javax.swing.JPanel();
        jLabelespecialistas = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextareaespecialistas = new javax.swing.JTextArea();
        jPaneladmin = new javax.swing.JPanel();
        jLabeladmin = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextareaadmin = new javax.swing.JTextArea();
        butao_iniciar = new javax.swing.JButton();
        jButtoningredientes = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Parachoc by VLG  v1.0");
        setBackground(new java.awt.Color(102, 0, 0));

        jPanelprincipal.setBackground(new java.awt.Color(102, 51, 0));
        jPanelprincipal.setLayout(new java.awt.GridLayout(2, 2));

        jPanelProducao.setBackground(new java.awt.Color(102, 51, 0));
        jPanelProducao.setLayout(new java.awt.BorderLayout());

        jLabelpainelunidadesproducao.setForeground(new java.awt.Color(255, 255, 255));
        jLabelpainelunidadesproducao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelpainelunidadesproducao.setText("Unidades de Produção");
        jLabelpainelunidadesproducao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelProducao.add(jLabelpainelunidadesproducao, java.awt.BorderLayout.PAGE_START);

        jTextareauproducao.setColumns(20);
        jTextareauproducao.setRows(5);
        jTextareauproducao.setLineWrap(true);

        jTextareauproducao.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextareauproducao);

        jPanelProducao.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanelprincipal.add(jPanelProducao);

        jPanelArmazem.setBackground(new java.awt.Color(102, 51, 0));
        jPanelArmazem.setForeground(new java.awt.Color(255, 255, 255));
        jPanelArmazem.setLayout(new java.awt.BorderLayout());

        jLabelpainelarmazem.setForeground(new java.awt.Color(255, 255, 255));
        jLabelpainelarmazem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelpainelarmazem.setText("Armazém");
        jLabelpainelarmazem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelArmazem.add(jLabelpainelarmazem, java.awt.BorderLayout.PAGE_START);

        jTextareaarmazem.setColumns(20);
        jTextareaarmazem.setRows(5);
        jTextareaarmazem.setLineWrap(true);

        jTextareaarmazem.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextareaarmazem);

        jPanelArmazem.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jButtoningredientesler.setText("Ler Ficheiros Ingredientes");
        jButtoningredientesler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoningredienteslerActionPerformed(evt);
            }
        });
        jPanelArmazem.add(jButtoningredientesler, java.awt.BorderLayout.PAGE_END);

        jPanelprincipal.add(jPanelArmazem);

        jPanelespecialista.setBackground(new java.awt.Color(102, 51, 0));
        jPanelespecialista.setForeground(new java.awt.Color(255, 255, 255));
        jPanelespecialista.setLayout(new java.awt.BorderLayout());

        jLabelespecialistas.setForeground(new java.awt.Color(255, 255, 255));
        jLabelespecialistas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelespecialistas.setText("Especialistas");
        jLabelespecialistas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelespecialista.add(jLabelespecialistas, java.awt.BorderLayout.PAGE_START);

        jTextareaespecialistas.setColumns(20);
        jTextareaespecialistas.setRows(5);
        jTextareaespecialistas.setLineWrap(true);

        jTextareaespecialistas.setWrapStyleWord(true);
        jScrollPane3.setViewportView(jTextareaespecialistas);

        jPanelespecialista.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jPanelprincipal.add(jPanelespecialista);

        jPaneladmin.setBackground(new java.awt.Color(102, 51, 0));
        jPaneladmin.setLayout(new java.awt.BorderLayout());

        jLabeladmin.setForeground(new java.awt.Color(255, 255, 255));
        jLabeladmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeladmin.setText("Administrador (Logger)");
        jLabeladmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPaneladmin.add(jLabeladmin, java.awt.BorderLayout.PAGE_START);

        jTextareaadmin.setColumns(20);
        jTextareaadmin.setRows(5);
        jTextareaadmin.setLineWrap(true);

        jTextareaadmin.setWrapStyleWord(true);
        jScrollPane4.setViewportView(jTextareaadmin);

        jPaneladmin.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        jPanelprincipal.add(jPaneladmin);

        butao_iniciar.setText("Iniciar...");
        butao_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butao_iniciarActionPerformed(evt);
            }
        });

        jButtoningredientes.setText("Carregar Ingredientes Manualmente");
        jButtoningredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoningredientesActionPerformed(evt);
            }
        });

        jMenu1.setText("Gerir");

        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("About");

        jMenuItem4.setText("Creditos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(butao_iniciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtoningredientes))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butao_iniciar)
                    .addComponent(jButtoningredientes))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
       /* try {       
            FileOutputStream fout = new FileOutputStream("dados.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(bd);
            oos.close();
            System.out.println("SUCESSO");
            JOptionPane.showMessageDialog(null, "Ficheiro de dados gravado com sucesso");
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }*/
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButtoningredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoningredientesActionPerformed
        // TODO add your handling code here:
        String ingredientesadicionados="";
        int cacau=500;
        int amendoas=500;
        int caramelo=250;
        int passas=125;
        
        listaingredientes.get(0).quantidadeemstock=listaingredientes.get(0).quantidadeemstock+cacau;
        listaingredientes.get(1).quantidadeemstock=listaingredientes.get(1).quantidadeemstock+amendoas;
        listaingredientes.get(2).quantidadeemstock=listaingredientes.get(2).quantidadeemstock+caramelo;
        listaingredientes.get(3).quantidadeemstock=listaingredientes.get(3).quantidadeemstock+passas;
        
        jTextareaarmazem.setText(null);
        for (int i=0; i<listaingredientes.size();i++){
           // jTextareaarmazem.
            if (jTextareaarmazem.getText().compareTo("")==0)
                jTextareaarmazem.append(listaingredientes.get(i).toString());
            else{
                jTextareaarmazem.append("\n");
                jTextareaarmazem.append("\n");
                jTextareaarmazem.append(listaingredientes.get(i).toString());
            }
        }
        jTextareaarmazem.update(jTextareaarmazem.getGraphics());
        ingredientesadicionados="Adicionado cacau:"+cacau+" Amendoas:"+amendoas+" Caramelo:"+caramelo+" Passas:"+passas;
        
        jTextareaadmin.append(ingredientesadicionados);
        jTextareaadmin.append("\n");
        
        DefaultCaret caret = (DefaultCaret)jTextareaadmin.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
        verificaproducao();
    }//GEN-LAST:event_jButtoningredientesActionPerformed

    
    
    private void jtextespecialitas(){
        
        jTextareaespecialistas.setText("");
        for (int i=0; i<listaespecialistas.size();i++){
           
            if (jTextareaespecialistas.getText().compareTo("")==0){
                if (listaespecialistas.get(i).isAlocado()){
                    jTextareaespecialistas.setForeground(Color.green);
                    //System.out.println("Meteu verde aqui 1");
                    jTextareaespecialistas.append(listaespecialistas.get(i).toString());
                }
                else{
                    jTextareaespecialistas.setForeground(Color.red);
                    //System.out.println("Meteu vermelho aqui 1");
                    jTextareaespecialistas.append(listaespecialistas.get(i).toString());
                    
                }   
            }
            else{
                //jTextareaespecialistas.setForeground(Color.red);
                jTextareaespecialistas.append("\n");
                jTextareaespecialistas.append("\n");
                if (listaespecialistas.get(i).alocado==true){
                    jTextareaespecialistas.setForeground(Color.green);
                    //System.out.println("Meteu verde aqui 2");
                    jTextareaespecialistas.append(listaespecialistas.get(i).toString());
                }
                else{
                    jTextareaespecialistas.setForeground(Color.red);
                    //System.out.println("Meteu vermelho aqui 2");
                    jTextareaespecialistas.append(listaespecialistas.get(i).toString());
                    
                }
                
            }
            //jTextareaespecialistas.setForeground(Color.black);
        }  
        System.out.println("Actualizada jtextareaespecialistas!!!!");
    }
    
    private void jtextarmazem(){
        jTextareaarmazem.setText(null);
        for (int i=0; i<listaingredientes.size();i++){
           // jTextareaarmazem.
            if (jTextareaarmazem.getText().compareTo("")==0)
                jTextareaarmazem.append(listaingredientes.get(i).toString());
            else{
                jTextareaarmazem.append("\n");
                jTextareaarmazem.append("\n");
                jTextareaarmazem.append(listaingredientes.get(i).toString());
            }
        }
        jTextareaarmazem.update(jTextareaarmazem.getGraphics());
        
    }
    
    private void verificaproducao(){
        
    int qaproduzir=0;
    
    if ((listaingredientes.get(1).quantidadeemstock>24)&&(listaingredientes.get(2).quantidadeemstock>24)&&(listaingredientes.get(0).quantidadeemstock>99)){
       for (int i=0;i<listaespecialistas.size();i++){
                if ((listaespecialistas.get(i).especialidade==tproduto.TabChocAmendPassas)&&(listaespecialistas.get(i).alocado==false)){
                   jTextareaadmin.append("Especialista adicionado"+listaespecialistas.get(i).toString());
                   listaespecialistas.get(i).setEmespera(qaproduzir);
                   jTextareaadmin.append("\n");
                   Threadtableteamendoas.especialista=listaespecialistas.get(i);
                   jTextareaadmin.append("\n");
                   qaproduzir=1;
                   Threadtableteamendoas.especialista.setEmespera(qaproduzir);
                   for (int j=0;j<qaproduzir;j++){
                    
                   listaingredientes.get(0).setQuantidadeemstock(listaingredientes.get(0).quantidadeemstock-100);
                   listaingredientes.get(1).setQuantidadeemstock(listaingredientes.get(1).quantidadeemstock-25);
                   listaingredientes.get(2).setQuantidadeemstock(listaingredientes.get(2).quantidadeemstock-25);
                   
                   Threadtableteamendoas.setUso(true);
                   listaespecialistas.get(i).alocado=true;
                   System.out.println(Threadtableteamendoas.toString());
                   jtextarmazem();
                   jtextespecialitas();
                   jtextunidadesproducao();
                   jTextareaarmazem.update(jTextareaarmazem.getGraphics());
                   jTextareauproducao.update(jTextareauproducao.getGraphics());
                   jTextareaespecialistas.update(jTextareaespecialistas.getGraphics());
                   jTextareaadmin.update(jTextareaadmin.getGraphics());
                   Threadtableteamendoas.run();
 
                   Threadtableteamendoas.setUso(false);
                   
                   Threadtableteamendoas.especialista.setEmespera(Threadtableteamendoas.especialista.getEmespera()-1);
                   jTextareauproducao.setForeground(Color.white);
                   listaespecialistas.get(i).alocado=false;
                   jtextespecialitas();
                   jtextunidadesproducao();
                   jtextarmazem();
                   jTextareaarmazem.update(jTextareaarmazem.getGraphics());
                   jTextareauproducao.update(jTextareauproducao.getGraphics());
                   jTextareaespecialistas.update(jTextareaespecialistas.getGraphics());
                   jTextareaadmin.update(jTextareaadmin.getGraphics());
                   
                }
                   Threadtableteamendoas.especialista=null;
                   break;
                }
            } 
        
    }
    
    
    if (listaingredientes.get(0).quantidadeemstock>99){
        qaproduzir=listaingredientes.get(0).quantidadeemstock/100;
        System.out.println("Quantidade a produzir e: "+qaproduzir);
        for (int i=0;i<listaespecialistas.size();i++){
                if ((listaespecialistas.get(i).especialidade==tproduto.TabChoc)&&(listaespecialistas.get(i).alocado==false)){
                   jTextareaadmin.append("Especialista adicionado"+listaespecialistas.get(i).toString());
                   listaespecialistas.get(i).setEmespera(qaproduzir);
                   jTextareaadmin.append("\n");
                   Threadtabletesimples.especialista=listaespecialistas.get(i);
                   jTextareaadmin.append("\n");
                   for (int j=0;j<qaproduzir;j++){
                    
                   listaingredientes.get(0).setQuantidadeemstock(listaingredientes.get(0).quantidadeemstock-100);
                   Threadtabletesimples.setUso(true);
                   listaespecialistas.get(i).alocado=true;
                   System.out.println(Threadtabletesimples.toString());
                   jtextarmazem();
                   jtextespecialitas();
                   jtextunidadesproducao();
                   jTextareaarmazem.update(jTextareaarmazem.getGraphics());
                   jTextareauproducao.update(jTextareauproducao.getGraphics());
                   jTextareaespecialistas.update(jTextareaespecialistas.getGraphics());
                   jTextareaadmin.update(jTextareaadmin.getGraphics());
                   Threadtabletesimples.run();
 
                   Threadtabletesimples.setUso(false);
                   
                   Threadtabletesimples.especialista.setEmespera(Threadtabletesimples.especialista.getEmespera()-1);
                   jTextareauproducao.setForeground(Color.white);
                   listaespecialistas.get(i).alocado=false;
                   jtextespecialitas();
                   jtextunidadesproducao();
                   jtextarmazem();
                   jTextareaarmazem.update(jTextareaarmazem.getGraphics());
                   jTextareauproducao.update(jTextareauproducao.getGraphics());
                   jTextareaespecialistas.update(jTextareaespecialistas.getGraphics());
                   jTextareaadmin.update(jTextareaadmin.getGraphics());
                   
                }
                   Threadtabletesimples.especialista=null;
                   break;
                }
            }
        }
    
    }
    
    private void butao_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butao_iniciarActionPerformed
        // TODO add your handling code here:
        butao_iniciar.setEnabled(false);
        
        Threadtabletesimples=new UnidadeProducao(tproduto.TabChoc);
        this.adiciona_log("Thread Threadtabletesimples criada");
        
        Threadtableteamendoas=new UnidadeProducao(tproduto.TabChocAmendPassas);
        this.adiciona_log("Thread Threadtableteamendoas criada");
        Threadtabletecaramelo=new UnidadeProducao(tproduto.TabChocCaram);
        this.adiciona_log("Thread Threadtabletecaramelo criada");
        Threadamendoas=new UnidadeProducao(tproduto.AmendChoc);
        this.adiciona_log("Thread Threadamendoas criada");
        
        verificaproducao();
        
        System.out.println("Chegou aqui 0!!!!");
        
    }//GEN-LAST:event_butao_iniciarActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        About frameabout = new About();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                System.out.println("Chegou aqui");
                frameabout.setVisible(true);
            }
        });
    }//GEN-LAST:event_jMenuItem4ActionPerformed
    private void leringredientes() throws IOException{

        try{
            FileReader fileReader = new FileReader("input/cacau.txt");
            BufferedReader reader = new BufferedReader(fileReader);
        
            String data = null;
            while((data = reader.readLine()) != null){
                listaingredientes.get(0).setQuantidadeemstock(listaingredientes.get(0).getQuantidadeemstock()+Integer.parseInt(data));
                jtextarmazem();
                adiciona_log("Adicionados "+data+"g de cacau via ficheiro");
            }
            fileReader.close();
            reader.close();
        }
        catch(Exception ex){
            System.out.println("Ficheiro de cacau não existe"+ex.getMessage());
            adiciona_log("Ficheiro de cacau.txt inexistente");
        }
        
        try{
            FileReader fileReader = new FileReader("input/amendoas.txt");
            BufferedReader reader = new BufferedReader(fileReader);
        
            String data = null;
            while((data = reader.readLine()) != null){
                listaingredientes.get(1).setQuantidadeemstock(listaingredientes.get(1).getQuantidadeemstock()+Integer.parseInt(data));
                jtextarmazem();
                adiciona_log("Adicionados "+data+"g de Amendoas via ficheiro");
            }
            fileReader.close();
            reader.close();
        }
        catch(Exception ex){
            System.out.println("Ficheiro de Amendoas não existe"+ex.getMessage());
            adiciona_log("Ficheiro de amendoas.txt inexistente");
        }
        
        //Caramelo
        try{
            FileReader fileReader = new FileReader("input/caramelo.txt");
            BufferedReader reader = new BufferedReader(fileReader);
        
            String data = null;
            while((data = reader.readLine()) != null){
                listaingredientes.get(2).setQuantidadeemstock(listaingredientes.get(2).getQuantidadeemstock()+Integer.parseInt(data));
                jtextarmazem();
                adiciona_log("Adicionados "+data+"g de Caramelo via ficheiro");
            }
            fileReader.close();
            reader.close();
        }
        catch(Exception ex){
            System.out.println("Ficheiro de Caramelo não existe"+ex.getMessage());
            adiciona_log("Ficheiro de caramelo.txt inexistente");
        }
        
        //Passas
        try{
            FileReader fileReader = new FileReader("input/passas.txt");
            BufferedReader reader = new BufferedReader(fileReader);
        
            String data = null;
            while((data = reader.readLine()) != null){
                listaingredientes.get(3).setQuantidadeemstock(listaingredientes.get(3).getQuantidadeemstock()+Integer.parseInt(data));
                jtextarmazem();
                adiciona_log("Adicionados "+data+"g de Passas via ficheiro");
            }
            fileReader.close();
            reader.close();
        }
        catch(Exception ex){
            System.out.println("Ficheiro de Passas não existe"+ex.getMessage());
            adiciona_log("Ficheiro de passas.txt inexistente");
        }
        verificaproducao();
    }
    
    private void jButtoningredienteslerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoningredienteslerActionPerformed
        // TODO add your handling code here:
        
        try{
            leringredientes();
        }
        catch(Exception e){
            adiciona_log("Não existe essa directoria"+"/n");
            System.out.println("Nao conseguiu ler ficheiros/Nao existe directoria: "+e.getMessage());
            
        }    
    
        
    }//GEN-LAST:event_jButtoningredienteslerActionPerformed

    private void jtextunidadesproducao(){
        
        jTextareauproducao.setText("");
        jTextareauproducao.append(Threadtabletesimples.toString());
        jTextareauproducao.append("\n");
        jTextareauproducao.append("\n");
        jTextareauproducao.append(Threadtableteamendoas.toString());
        jTextareauproducao.append("\n");
        jTextareauproducao.append("\n");
        jTextareauproducao.append(Threadtabletecaramelo.toString());
        jTextareauproducao.append("\n");
        jTextareauproducao.append("\n");
        jTextareauproducao.append(Threadamendoas.toString());
        
        if ((Threadtabletesimples.isUso())||(Threadtableteamendoas.isUso())||(Threadtabletecaramelo.isUso())||(Threadamendoas.isUso()))
            jTextareauproducao.setBackground(Color.green);
        else
            jTextareauproducao.setBackground(Color.red);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        ParachocMain ex = new ParachocMain();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                ex.setVisible(true);
            }
        });
        System.out.println("Chegou ao fim do prog?");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butao_iniciar;
    private javax.swing.JButton jButtoningredientes;
    private javax.swing.JButton jButtoningredientesler;
    private javax.swing.JLabel jLabeladmin;
    private javax.swing.JLabel jLabelespecialistas;
    private javax.swing.JLabel jLabelpainelarmazem;
    private javax.swing.JLabel jLabelpainelunidadesproducao;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanelArmazem;
    private javax.swing.JPanel jPanelProducao;
    private javax.swing.JPanel jPaneladmin;
    private javax.swing.JPanel jPanelespecialista;
    private javax.swing.JPanel jPanelprincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextareaadmin;
    private javax.swing.JTextArea jTextareaarmazem;
    private javax.swing.JTextArea jTextareaespecialistas;
    private javax.swing.JTextArea jTextareauproducao;
    // End of variables declaration//GEN-END:variables
}

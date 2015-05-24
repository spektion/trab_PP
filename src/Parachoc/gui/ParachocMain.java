/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parachoc.gui;

import java.awt.*;
import javax.swing.*;
import Parachoc.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
/**
 *
 * @author a
 */
public class ParachocMain extends javax.swing.JFrame {
    ArrayList<Ingrediente> listaingredientes;
    ArrayList<Especialista> listaespecialistas;
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
        listaingredientes.add(new Ingrediente("Cacau",1000));
        this.adiciona_log("Adicionado 1000g de cacau");
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
        
        UnidadeProducao Threadtabletesimples=new UnidadeProducao(tproduto.TabChoc,new Especialista(),new Produto());
        //this.adiciona_log("Thread Threadtabletesimples criada");
        
        UnidadeProducao Threadtableteamendoas=new UnidadeProducao(tproduto.TabChocAmendPassas,null,null);
        this.adiciona_log("Thread Threadtableteamendoas criada");
        UnidadeProducao Threadtabletecaramelo=new UnidadeProducao(tproduto.TabChocCaram, null, null);
        this.adiciona_log("Thread Threadtabletecaramelo criada");
        UnidadeProducao Threadamendoas=new UnidadeProducao(tproduto.AmendChoc,null,null);
        this.adiciona_log("Thread Threadamendoas criada");
        
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
        
        listaespecialistas.add(new Especialista("Luis Franco",tproduto.TabChoc));
        this.adiciona_log("Especialista Luis Franco criado");
        listaespecialistas.add(new Especialista("Vitor Filipe",tproduto.TabChocAmendPassas));
        this.adiciona_log("Especialista Vitor Filipe criado");
        listaespecialistas.add(new Especialista("Goncalo Faria",tproduto.TabChocCaram));
        this.adiciona_log("Especialista Goncalo Faria criado");
        listaespecialistas.add(new Especialista("Luis Filipe Faria",tproduto.AmendChoc));
        this.adiciona_log("Especialista Luis Filipe Faria criado");
        listaespecialistas.add(new Especialista("Jacques Arsac",tproduto.TabChoc));
        this.adiciona_log("Especialista Jacques Arsac criado");
        listaespecialistas.add(new Especialista("Enviusamento",tproduto.TabChocAmendPassas));
        this.adiciona_log("Especialista Enviusamento criado");
        listaespecialistas.add(new Especialista("Tijolosde8",tproduto.TabChocCaram));
        this.adiciona_log("Especialista Tijolosde8 criado");
        listaespecialistas.add(new Especialista("Erasmus",tproduto.AmendChoc));
        this.adiciona_log("Especialista Erasmus criado");
        
        for (int i=0; i<listaespecialistas.size();i++){
           // jTextareaarmazem.
            if (jTextareaespecialistas.getText().compareTo("")==0)
                jTextareaespecialistas.append(listaespecialistas.get(i).toString());
            else{
                jTextareaespecialistas.append("\n");
                jTextareaespecialistas.append("\n");
                jTextareaespecialistas.append(listaespecialistas.get(i).toString());
            }
        }
        
        
        if (listaingredientes.get(0).quantidadeemstock>99){
            int ntabletes=listaingredientes.get(0).quantidadeemstock/100;
            for (int i=0;i<listaespecialistas.size();i++){
                if ((listaespecialistas.get(i).especialidade==tproduto.TabChoc)&&(listaespecialistas.get(i).alocado==false)){
                   jTextareaadmin.append("Especialista adicionado");
                   jTextareaadmin.append("\n");
                   Threadtabletesimples.especialista=listaespecialistas.get(i);
                   //Threadtabletesimples.produto=new Produto("");
                   jTextareaadmin.append("Produto adicionado");
                   jTextareaadmin.append("\n");
                   listaingredientes.get(0).quantidadeemstock=listaingredientes.get(0).quantidadeemstock-100;
                   Threadtabletesimples.go();
                   jTextareaespecialistas.update(jTextareaespecialistas.getGraphics());
                   jTextareaadmin.update(jTextareaadmin.getGraphics());
            
                   
                }
            }
        }
        
        
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
        jButtoningredientes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextareaarmazem = new javax.swing.JTextArea();
        jPanelespecialista = new javax.swing.JPanel();
        jLabelespecialistas = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextareaespecialistas = new javax.swing.JTextArea();
        jPaneladmin = new javax.swing.JPanel();
        jLabeladmin = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextareaadmin = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Parachoc by VLG  v1.0");
        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanelprincipal.setBackground(new java.awt.Color(0, 204, 204));
        jPanelprincipal.setLayout(new java.awt.GridLayout(2, 2));

        jPanelProducao.setBackground(new java.awt.Color(0, 204, 204));
        jPanelProducao.setLayout(new java.awt.BorderLayout());

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

        jPanelArmazem.setBackground(new java.awt.Color(0, 204, 204));
        jPanelArmazem.setLayout(new java.awt.BorderLayout());

        jLabelpainelarmazem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelpainelarmazem.setText("Armazém");
        jLabelpainelarmazem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelArmazem.add(jLabelpainelarmazem, java.awt.BorderLayout.PAGE_START);

        jButtoningredientes.setText("Carregar Ingredientes");
        jButtoningredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoningredientesActionPerformed(evt);
            }
        });
        jPanelArmazem.add(jButtoningredientes, java.awt.BorderLayout.PAGE_END);

        jTextareaarmazem.setColumns(20);
        jTextareaarmazem.setRows(5);
        jTextareaarmazem.setLineWrap(true);

        jTextareaarmazem.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextareaarmazem);

        jPanelArmazem.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanelprincipal.add(jPanelArmazem);

        jPanelespecialista.setBackground(new java.awt.Color(0, 204, 204));
        jPanelespecialista.setLayout(new java.awt.BorderLayout());

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

        jPaneladmin.setBackground(new java.awt.Color(0, 204, 204));
        jPaneladmin.setLayout(new java.awt.BorderLayout());

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

        jMenu1.setText("Gerir");

        jMenuItem2.setText("Gravar BD");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        jMenuItem3.setText("Sair sem Gravar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("About");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelprincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(46, 46, 46))
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

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(null,"Deseja mesmo sair sem gravar?",null,JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
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
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButtoningredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoningredientesActionPerformed
        // TODO add your handling code here:
        listaingredientes.get(0).quantidadeemstock=3333;
    }//GEN-LAST:event_jButtoningredientesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ParachocMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParachocMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParachocMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParachocMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ParachocMain ex = new ParachocMain();
                ex.setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtoningredientes;
    private javax.swing.JLabel jLabeladmin;
    private javax.swing.JLabel jLabelespecialistas;
    private javax.swing.JLabel jLabelpainelarmazem;
    private javax.swing.JLabel jLabelpainelunidadesproducao;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanelArmazem;
    private javax.swing.JPanel jPanelProducao;
    private javax.swing.JPanel jPaneladmin;
    private javax.swing.JPanel jPanelespecialista;
    private javax.swing.JPanel jPanelprincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextArea jTextareaadmin;
    private javax.swing.JTextArea jTextareaarmazem;
    private javax.swing.JTextArea jTextareaespecialistas;
    private javax.swing.JTextArea jTextareauproducao;
    // End of variables declaration//GEN-END:variables
}

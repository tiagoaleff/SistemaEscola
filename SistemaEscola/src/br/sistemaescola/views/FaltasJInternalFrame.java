/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemaescola.views;

import br.sistemaescola.controller.FaltasController;
import br.sistemaescola.object.Faltas;

/**
 *
 * @author Tiago Aleff
 */
public class FaltasJInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form FaltasJInternalFrame
     */
    private FaltasController faltas = new FaltasController(this);
    
    public Faltas getFaltas(){
    
        Faltas faltas = new Faltas();
        faltas.setCursoNome(nomeCursojTextField1.getName());
        return faltas;        
    }
    
    
    public FaltasJInternalFrame() {
        initComponents();
        this.setClosable(true);
        this.setIconifiable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nomeCursojTextField1 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        cursoProcurajList4 = new javax.swing.JList();
        procurarjToggleButton4 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nomeDisciplinajTextField2 = new javax.swing.JTextField();
        procurarDisciplinaToggleButton5 = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        procurarDisciplinajList2 = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        resultadoAlunosjList3 = new javax.swing.JList();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        diajTextField4 = new javax.swing.JTextField();
        mesesjComboBox3 = new javax.swing.JComboBox();
        anojTextField8 = new javax.swing.JTextField();
        primeiraAulajCheckBox1 = new javax.swing.JCheckBox();
        segundaAulajCheckBox2 = new javax.swing.JCheckBox();
        terceiraAulajCheckBox3 = new javax.swing.JCheckBox();
        quartaAulajCheckBox4 = new javax.swing.JCheckBox();
        salvarjButton1 = new javax.swing.JButton();
        cancelarjButton2 = new javax.swing.JButton();
        clearJButton1 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        setClosable(true);
        setTitle("Inserir Faltas");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Faltas");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecione o Curso"));

        jLabel2.setText("Curso");

        nomeCursojTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeCursojTextField1ActionPerformed(evt);
            }
        });

        cursoProcurajList4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        //cursoProcurajList4.addActionListener(faltas);
        //cursoProcurajList4.setActionCommand("cursoProcurajList4");
        /*
        */
        jScrollPane4.setViewportView(cursoProcurajList4);

        procurarjToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search_black.png"))); // NOI18N
        procurarjToggleButton4.addActionListener(faltas);
        procurarjToggleButton4.setActionCommand("procurarjToggleButton4");

        /*
        procurarjToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procurarjToggleButton4ActionPerformed(evt);
            }
        });
        */

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(nomeCursojTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(procurarjToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(nomeCursojTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(procurarjToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecione a Disciplina"));

        jLabel3.setText("Disciplina");

        nomeDisciplinajTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeDisciplinajTextField2ActionPerformed(evt);
            }
        });

        procurarDisciplinaToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search_black.png"))); // NOI18N
        procurarDisciplinaToggleButton5.addActionListener(faltas);
        procurarDisciplinaToggleButton5.setActionCommand("procurarDisciplinaToggleButton5");

        /*
        procurarDisciplinaToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procurarDisciplinaToggleButton5ActionPerformed(evt);
            }
        });
        */

        procurarDisciplinajList2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane2.setViewportView(procurarDisciplinajList2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(nomeDisciplinajTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(procurarDisciplinaToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(procurarDisciplinaToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nomeDisciplinajTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        resultadoAlunosjList3.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Alunos"));
        jScrollPane3.setViewportView(resultadoAlunosjList3);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Presença"));

        diajTextField4.setText("Dia");

        mesesjComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Janeiro (Jan)", "Fevereiro (Fev)", "Março (Mar)", "Abril (Abr)", "Maio (Mai)", "Junho (Jun)", "Julho (Jul)", "Agosto (Ago)", "Setembro (Set)", "Outubro (Out)", "Novembro (Nov)", "Desembro (Des)" }));

        anojTextField8.setText("Ano");
        anojTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anojTextField8ActionPerformed(evt);
            }
        });

        primeiraAulajCheckBox1.setSelected(true);
        primeiraAulajCheckBox1.setText("Primeira Aula");

        segundaAulajCheckBox2.setSelected(true);
        segundaAulajCheckBox2.setText("Segunda Aula");

        terceiraAulajCheckBox3.setSelected(true);
        terceiraAulajCheckBox3.setText("Terceira Aula");
        terceiraAulajCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terceiraAulajCheckBox3ActionPerformed(evt);
            }
        });

        quartaAulajCheckBox4.setSelected(true);
        quartaAulajCheckBox4.setText("Quarta Aula");
        quartaAulajCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quartaAulajCheckBox4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(diajTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mesesjComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(anojTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(243, 243, 243))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(primeiraAulajCheckBox1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(segundaAulajCheckBox2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(quartaAulajCheckBox4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(terceiraAulajCheckBox3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(diajTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesesjComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anojTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(primeiraAulajCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(segundaAulajCheckBox2)
                .addGap(35, 35, 35)
                .addComponent(terceiraAulajCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(quartaAulajCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        salvarjButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save_blue.png"))); // NOI18N
        salvarjButton1.addActionListener(faltas);
        salvarjButton1.setActionCommand("salvarjButton1");

        cancelarjButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        cancelarjButton2.addActionListener(faltas);
        cancelarjButton2.setActionCommand("cancelarjButton2");
        /*
        cancelarjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarjButton2ActionPerformed(evt);
            }
        });
        */

        clearJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clear.png"))); // NOI18N
        clearJButton1.addActionListener(faltas);
        clearJButton1.setActionCommand("clearJButton1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(salvarjButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearJButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelarjButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarjButton1)
                    .addComponent(cancelarjButton2)
                    .addComponent(clearJButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeCursojTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeCursojTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeCursojTextField1ActionPerformed

    private void nomeDisciplinajTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeDisciplinajTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeDisciplinajTextField2ActionPerformed

    private void anojTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anojTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anojTextField8ActionPerformed

    private void cancelarjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarjButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarjButton2ActionPerformed

    private void procurarjToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procurarjToggleButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_procurarjToggleButton4ActionPerformed

    private void procurarDisciplinaToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procurarDisciplinaToggleButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_procurarDisciplinaToggleButton5ActionPerformed

    private void quartaAulajCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quartaAulajCheckBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quartaAulajCheckBox4ActionPerformed

    private void terceiraAulajCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terceiraAulajCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_terceiraAulajCheckBox3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anojTextField8;
    private javax.swing.JButton cancelarjButton2;
    private javax.swing.JButton clearJButton1;
    private javax.swing.JList cursoProcurajList4;
    private javax.swing.JTextField diajTextField4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JComboBox mesesjComboBox3;
    private javax.swing.JTextField nomeCursojTextField1;
    private javax.swing.JTextField nomeDisciplinajTextField2;
    private javax.swing.JCheckBox primeiraAulajCheckBox1;
    private javax.swing.JToggleButton procurarDisciplinaToggleButton5;
    private javax.swing.JList procurarDisciplinajList2;
    private javax.swing.JToggleButton procurarjToggleButton4;
    private javax.swing.JCheckBox quartaAulajCheckBox4;
    private javax.swing.JList resultadoAlunosjList3;
    private javax.swing.JButton salvarjButton1;
    private javax.swing.JCheckBox segundaAulajCheckBox2;
    private javax.swing.JCheckBox terceiraAulajCheckBox3;
    // End of variables declaration//GEN-END:variables
}

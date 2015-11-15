/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemaescola.views;

import br.sistemaescola.controller.FaltasController;
import br.sistemaescola.controllerlist.FaltaListController;
import br.sistemaescola.object.Faltas;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTextField;

/**
 *
 * @author Tiago Aleff
 */
public class FaltasJInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form FaltasJInternalFrame
     */
    private FaltasController faltas = new FaltasController(this);
    private FaltaListController actionList = new FaltaListController(this);
    private String listaAtual;
    
    public Faltas atualizar(){
    
        Faltas falta = new Faltas(cursoJTextField.getText(),
                                   disciplinaJTextField.getText(),
                                   alunoJTextField.getText(),
                                   diaJTextField.getText(),
                                   mesesJComboBox.getSelectedItem().toString(),
                                   anoJTextField.getText(),
                                   primeiraAulaJCheckBox.isSelected(),
                                   segundaAulaJCheckBox.isSelected(),
                                   terceiraAulajCheckBox.isSelected(),
                                   quartaAulaJCheckBox.isSelected());  
        
        return falta;        
    }

    public JList getResultadoJList() {
        return resultadoJList;
    }

    public JTextField getAlunoJTextField() {
        return alunoJTextField;
    }

    public JTextField getCursoJTextField() {
        return cursoJTextField;
    }

    public JTextField getDisciplinaJTextField() {
        return disciplinaJTextField;
    }

    public JTextField getAnoJTextField() {
        return anoJTextField;
    }

    public JTextField getDiaJTextField() {
        return diaJTextField;
    }

    public JComboBox getMesesJComboBox() {
        return mesesJComboBox;
    }

    public JCheckBox getPrimeiraAulaJCheckBox() {
        return primeiraAulaJCheckBox;
    }

    public JCheckBox getQuartaAulaJCheckBox() {
        return quartaAulaJCheckBox;
    }

    public JCheckBox getSegundaAulaJCheckBox() {
        return segundaAulaJCheckBox;
    }

    public JCheckBox getTerceiraAulajCheckBox() {
        return terceiraAulajCheckBox;
    }
    
    public String getListaAtual() {
        return listaAtual;
    }

    public void setListaAtual(String listaAtual) {
        this.listaAtual = listaAtual;
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
        cursoJTextField = new javax.swing.JTextField();
        procurarjToggleButton4 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        disciplinaJTextField = new javax.swing.JTextField();
        procurarDisciplinaToggleButton5 = new javax.swing.JToggleButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        resultadoJList = new javax.swing.JList();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        diaJTextField = new javax.swing.JTextField();
        mesesJComboBox = new javax.swing.JComboBox();
        anoJTextField = new javax.swing.JTextField();
        primeiraAulaJCheckBox = new javax.swing.JCheckBox();
        segundaAulaJCheckBox = new javax.swing.JCheckBox();
        terceiraAulajCheckBox = new javax.swing.JCheckBox();
        quartaAulaJCheckBox = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        salvarjButton1 = new javax.swing.JButton();
        cancelarjButton2 = new javax.swing.JButton();
        clearJButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        pesquisarAlunoJButton = new javax.swing.JButton();
        alunoJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        setClosable(true);
        setTitle("Inserir Faltas");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Faltas");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecione o Curso"));

        jLabel2.setText("Curso");

        cursoJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cursoJTextFieldActionPerformed(evt);
            }
        });

        procurarjToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search_black.png"))); // NOI18N
        procurarjToggleButton4.addActionListener(faltas);
        procurarjToggleButton4.setActionCommand("procurarCursos");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(cursoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(procurarjToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(cursoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(procurarjToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecione a Disciplina"));

        jLabel3.setText("Disciplina");

        disciplinaJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disciplinaJTextFieldActionPerformed(evt);
            }
        });

        procurarDisciplinaToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search_black.png"))); // NOI18N
        procurarDisciplinaToggleButton5.addActionListener(faltas);
        procurarDisciplinaToggleButton5.setActionCommand("procurarDisciplina");

        /*
        procurarDisciplinaToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procurarDisciplinaToggleButton5ActionPerformed(evt);
            }
        });
        */

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(disciplinaJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(procurarDisciplinaToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(procurarDisciplinaToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(disciplinaJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        resultadoJList.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados da Pesquisa "));
        resultadoJList.addListSelectionListener(actionList);
        jScrollPane3.setViewportView(resultadoJList);
        resultadoJList.getAccessibleContext().setAccessibleName("");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Presença"));

        diaJTextField.setText("Dia");
        diaJTextField.setToolTipText("Insira o Dia aqui - somente aceito numeros");
        diaJTextField.setName(""); // NOI18N

        mesesJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));

        anoJTextField.setText("Ano");
        anoJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anoJTextFieldActionPerformed(evt);
            }
        });

        primeiraAulaJCheckBox.setText("Primeira Aula");

        segundaAulaJCheckBox.setText("Segunda Aula");

        terceiraAulajCheckBox.setText("Terceira Aula");

        quartaAulaJCheckBox.setText("Quarto Aula");

        jLabel6.setText("Marque os periodos que o aluno faltou");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(diaJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quartaAulaJCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(terceiraAulajCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(primeiraAulaJCheckBox)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(mesesJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(anoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)))
                                .addContainerGap())
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(segundaAulaJCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(diaJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesesJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(13, 13, 13)
                .addComponent(primeiraAulaJCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(segundaAulaJCheckBox)
                .addGap(18, 18, 18)
                .addComponent(terceiraAulajCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(quartaAulaJCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        diaJTextField.getAccessibleContext().setAccessibleDescription("");

        salvarjButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save_blue.png"))); // NOI18N
        salvarjButton1.addActionListener(faltas);
        salvarjButton1.setActionCommand("salvar");

        cancelarjButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        cancelarjButton2.addActionListener(faltas);
        cancelarjButton2.setActionCommand("cancelar");
        /*
        cancelarjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarjButton2ActionPerformed(evt);
            }
        });
        */

        clearJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clear.png"))); // NOI18N
        clearJButton1.addActionListener(faltas);
        clearJButton1.setActionCommand("clear");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecione o Aluno"));

        pesquisarAlunoJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search_black.png"))); // NOI18N
        pesquisarAlunoJButton.addActionListener(faltas);
        pesquisarAlunoJButton.setActionCommand("procurarAlunos");

        alunoJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alunoJTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Aluno");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(alunoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pesquisarAlunoJButton)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(alunoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(pesquisarAlunoJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(salvarjButton1)
                        .addGap(18, 18, 18)
                        .addComponent(clearJButton1)
                        .addGap(12, 12, 12)
                        .addComponent(cancelarjButton2))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clearJButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cancelarjButton2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(salvarjButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.getAccessibleContext().setAccessibleName("Presença ");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cursoJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cursoJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cursoJTextFieldActionPerformed

    private void disciplinaJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disciplinaJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disciplinaJTextFieldActionPerformed

    private void anoJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anoJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anoJTextFieldActionPerformed

    private void cancelarjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarjButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarjButton2ActionPerformed

    private void procurarjToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procurarjToggleButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_procurarjToggleButton4ActionPerformed

    private void procurarDisciplinaToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procurarDisciplinaToggleButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_procurarDisciplinaToggleButton5ActionPerformed

    private void alunoJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alunoJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alunoJTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alunoJTextField;
    private javax.swing.JTextField anoJTextField;
    private javax.swing.JButton cancelarjButton2;
    private javax.swing.JButton clearJButton1;
    private javax.swing.JTextField cursoJTextField;
    private javax.swing.JTextField diaJTextField;
    private javax.swing.JTextField disciplinaJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox mesesJComboBox;
    private javax.swing.JButton pesquisarAlunoJButton;
    private javax.swing.JCheckBox primeiraAulaJCheckBox;
    private javax.swing.JToggleButton procurarDisciplinaToggleButton5;
    private javax.swing.JToggleButton procurarjToggleButton4;
    private javax.swing.JCheckBox quartaAulaJCheckBox;
    private javax.swing.JList resultadoJList;
    private javax.swing.JButton salvarjButton1;
    private javax.swing.JCheckBox segundaAulaJCheckBox;
    private javax.swing.JCheckBox terceiraAulajCheckBox;
    // End of variables declaration//GEN-END:variables
}

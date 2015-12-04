/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemaescola.views;

import br.sistemaescola.controller.NotasController;
import br.sistemaescola.controller.list.NotaListController;
import br.sistemaescola.object.Nota;
import javax.swing.JList;
import javax.swing.JTextField;

/**
 *
 * @author comp1
 */
public class NotaJInternalFrame extends javax.swing.JInternalFrame {

    NotasController action = new  NotasController(this);
    NotaListController actionList = new NotaListController(this);
    private String listAtual = null;
    private int idAluno;
    private int idProfessor;
    private int idDisciplina;
            

    public String getListAtual() {
        return listAtual;
    }

    public void setListAtual(String listAtual) {
        this.listAtual = listAtual;
    }
    
    public Nota atualizar(){
        
        Nota  nota = new Nota(alunoJTextField.getText(),
                            professorJTextField.getText(),
                            disciplinaJTextField.getText(),
                            pesoJTextField.getText(),
                            notaJTextField.getText(),
                            getIdAluno(), 
                            getIdProfessor(),
                            getIdDisciplina()
                            );                
        return nota;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }
    
    public JTextField getDisciplinaJTextField() {    
         return disciplinaJTextField;
}  

    public JList getResultJList() {
        return ResultJList;
    }

    public JTextField getAlunoJTextField() {
        return alunoJTextField;
    }

    public JTextField getProfessorJTextField() {
        return professorJTextField;
    }

    public JTextField getNotaJTextField() {
        return notaJTextField;
    }

    public JTextField getPesoJTextField() {
        return pesoJTextField;
    }
    
    
    
    
    public NotaJInternalFrame() {
        initComponents();
        br.sistemaescola.log.Log.gravarMessagem("Aberta a janela de Nota");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        alunoJLabel = new javax.swing.JLabel();
        notaJTextField = new javax.swing.JTextField();
        notaJLabel = new javax.swing.JLabel();
        salvarJButton = new javax.swing.JButton();
        alunoJTextField = new javax.swing.JTextField();
        professorJTextField = new javax.swing.JTextField();
        disciplinaJTextField = new javax.swing.JTextField();
        pesoJTextField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ResultJList = new javax.swing.JList();
        professorJLabel = new javax.swing.JLabel();
        disciplinaJLabel = new javax.swing.JLabel();
        pesoJLabel = new javax.swing.JLabel();
        buscarAlunoJButton = new javax.swing.JButton();
        buscarProfessorJButton = new javax.swing.JButton();
        buscarDisciplinaJButton = new javax.swing.JButton();
        limparJButton = new javax.swing.JButton();
        cancelarJButton = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jToggleButton1.setText("jToggleButton1");

        setClosable(true);
        setIconifiable(true);
        setTitle("Nota Adicionar");
        setPreferredSize(new java.awt.Dimension(577, 385));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Inserir Notas"));

        alunoJLabel.setText("Aluno");

        notaJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notaJTextFieldActionPerformed(evt);
            }
        });

        notaJLabel.setText("Nota ");

        salvarJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save_blue.png"))); // NOI18N
        salvarJButton.setToolTipText("click aqui para inserir uma nota ao aluno informado");
        salvarJButton.addActionListener(action);
        salvarJButton.setActionCommand("salvar");

        alunoJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alunoJTextFieldActionPerformed(evt);
            }
        });

        professorJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                professorJTextFieldActionPerformed(evt);
            }
        });

        pesoJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoJTextFieldActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado da Busca"));

        ResultJList.addListSelectionListener(actionList);
        jScrollPane1.setViewportView(ResultJList);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addContainerGap())
        );

        professorJLabel.setText("professor");

        disciplinaJLabel.setText("Disciplina");

        pesoJLabel.setText("Peso");

        buscarAlunoJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search_black.png"))); // NOI18N
        buscarAlunoJButton.setToolTipText("click no botão para procurar um aluno ");
        buscarAlunoJButton.addActionListener(action);
        buscarAlunoJButton.setActionCommand("buscar_aluno");

        buscarProfessorJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search_black.png"))); // NOI18N
        buscarProfessorJButton.setToolTipText("click para procurar um professor");
        buscarProfessorJButton.addActionListener(action);
        buscarProfessorJButton.setActionCommand("buscar_professor");

        buscarDisciplinaJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search_black.png"))); // NOI18N
        buscarDisciplinaJButton.setToolTipText("click aqui para buscar uma disciplina");
        buscarDisciplinaJButton.addActionListener(action);
        buscarDisciplinaJButton.setActionCommand("buscar_disciplina");

        limparJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clear.png"))); // NOI18N
        limparJButton.setToolTipText("click aqui para limpar o formulário");
        limparJButton.addActionListener(action);
        limparJButton.setActionCommand("limpar");

        cancelarJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        cancelarJButton.setToolTipText("click aqui para cancelar e fechar o formulário");
        cancelarJButton.addActionListener(action);
        cancelarJButton.setActionCommand("cancelar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pesoJLabel)
                            .addComponent(disciplinaJLabel)
                            .addComponent(alunoJLabel)
                            .addComponent(professorJLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pesoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(notaJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(notaJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(professorJTextField)
                            .addComponent(alunoJTextField)
                            .addComponent(disciplinaJTextField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buscarProfessorJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buscarDisciplinaJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buscarAlunoJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(limparJButton)
                        .addGap(18, 18, 18)
                        .addComponent(salvarJButton)
                        .addGap(18, 18, 18)
                        .addComponent(cancelarJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buscarAlunoJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(alunoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(alunoJLabel)))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buscarProfessorJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(professorJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(professorJLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(disciplinaJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(disciplinaJLabel)
                            .addComponent(buscarDisciplinaJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pesoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pesoJLabel)
                            .addComponent(notaJLabel)
                            .addComponent(notaJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(cancelarJButton)
                                .addGap(84, 84, 84))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(salvarJButton)
                                    .addComponent(limparJButton))
                                .addContainerGap())))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void notaJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notaJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_notaJTextFieldActionPerformed

    private void alunoJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alunoJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alunoJTextFieldActionPerformed

    private void professorJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_professorJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_professorJTextFieldActionPerformed

    private void pesoJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesoJTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList ResultJList;
    private javax.swing.JLabel alunoJLabel;
    private javax.swing.JTextField alunoJTextField;
    private javax.swing.JButton buscarAlunoJButton;
    private javax.swing.JButton buscarDisciplinaJButton;
    private javax.swing.JButton buscarProfessorJButton;
    private javax.swing.JButton cancelarJButton;
    private javax.swing.JLabel disciplinaJLabel;
    private javax.swing.JTextField disciplinaJTextField;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton limparJButton;
    private javax.swing.JLabel notaJLabel;
    private javax.swing.JTextField notaJTextField;
    private javax.swing.JLabel pesoJLabel;
    private javax.swing.JTextField pesoJTextField;
    private javax.swing.JLabel professorJLabel;
    private javax.swing.JTextField professorJTextField;
    private javax.swing.JButton salvarJButton;
    // End of variables declaration//GEN-END:variables

}

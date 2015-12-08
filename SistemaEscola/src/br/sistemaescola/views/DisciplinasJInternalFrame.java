/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemaescola.views;

import br.sistemaescola.controller.DisciplinaController;
import br.sistemaescola.controller.list.DisciplinaListController;
import br.sistemaescola.object.Disciplina;
import javax.print.event.PrintJobEvent;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Tiago Aleff
 */
public class DisciplinasJInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastrarDisciplinasJInternalFrame
     */
    
    private String listAtual = "";
    private DisciplinaController disciplinas = new DisciplinaController(this);
    private DisciplinaListController actionList = new DisciplinaListController(this);
    private int idCursoDaDisciplina;
    private int idProfessorDaDisciplina;
    
    public Disciplina atualizar(){
        
        
            
        
        Disciplina disciplina = new Disciplina();
        
        
        /* setando informações sobre a DISCIPLINA */
        disciplina.setNomeDisciplina(nomeJTextField.getText());
        disciplina.setCodigoDisciplina(codigoJTextField1.getText());
        disciplina.setCreditoDisciplina(creditosJTextField.getText());
        disciplina.setTotalAlunosDisciplina(totalAlunosJTextField.getText());
        disciplina.setTotalHorasDisciplina(totalHorasJTextField.getText());
        disciplina.setNomeCurso(cursoJTextField.getText());        
        
        /* setando informações sobre o PROFESSOR DA DISCIPLINA*/
        disciplina.setNomeProfessor(nomeProfessorJTextField.getText());               
        
        // atualizar os dados dos ids       
        disciplina.setIdCurso(getIdCursoDaDisciplina());
        disciplina.setIdProfessor(getIdProfessorDaDisciplina());        
        
        
        /*if(disciplina.getNomeProfessor() != null)
             JOptionPane.showMessageDialog(null, disciplina.toString());
        else 
             JOptionPane.showMessageDialog(null, disciplina.toString());
        */
        
        return disciplina;        
    
    }
    public int getIdProfessorDaDisciplina() {
        return idProfessorDaDisciplina;
    }

    public void setIdProfessorDaDisciplina(int idProfessorDaDisciplina) {
        this.idProfessorDaDisciplina = idProfessorDaDisciplina;
    }
        
    public int getIdCursoDaDisciplina() {
        return idCursoDaDisciplina;
    }

    public void setIdCursoDaDisciplina(int idCursoDaDisciplina) {
        this.idCursoDaDisciplina = idCursoDaDisciplina;
    }
    
    public JList getListaResultadoJList() {
        return listaResultadoJList;
    }

    public JTextField getnomeJTextField() {
        return nomeJTextField;
    }

    public JTextField getProfessorJTextField() {
        return nomeProfessorJTextField;
    }

    public JTextField getCursoJTextField() {
        return cursoJTextField;
    }

    public JTextField getCodigoJTextField1() {
        return codigoJTextField1;
    }

    public JTextField getCreditosJTextField() {
        return creditosJTextField;
    }

    public JTextField getTotalAlunosJTextField() {
        return totalAlunosJTextField;
    }

    public JTextField getTotalHorasJTextField() {
        return totalHorasJTextField;
    }
    
    

    public String getListAtual() {
        return listAtual;
    }

    public void setListAtual(String listAtual) {
        this.listAtual = listAtual;
    }
    
    
    
    
    
    public DisciplinasJInternalFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nomeJTextField = new javax.swing.JTextField();
        creditosJTextField = new javax.swing.JTextField();
        totalAlunosJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        totalHorasJTextField = new javax.swing.JTextField();
        disciplinaPesquisaJToggleButton = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();
        cursoJTextField = new javax.swing.JTextField();
        cursoJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        nomeProfessorJTextField = new javax.swing.JTextField();
        professorPesquisaJToggleButton = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaResultadoJList = new javax.swing.JList();
        codigoJTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cancelarJToggleButton = new javax.swing.JToggleButton();
        clearJButton1 = new javax.swing.JButton();
        salvarJToggleButton = new javax.swing.JToggleButton();
        deletarjButton2 = new javax.swing.JButton();

        setTitle("Disciplina");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações da disciplinas"));

        jLabel2.setText("Nome:");

        jLabel4.setText("Créditos:");

        jLabel6.setText("Total de horas:");

        nomeJTextField.setMaximumSize(null);
        nomeJTextField.setMinimumSize(null);
        nomeJTextField.setPreferredSize(null);
        nomeJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeJTextFieldActionPerformed(evt);
            }
        });

        totalAlunosJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalAlunosJTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Total de Alunos:");

        totalHorasJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalHorasJTextFieldActionPerformed(evt);
            }
        });

        disciplinaPesquisaJToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search_black.png"))); // NOI18N
        disciplinaPesquisaJToggleButton.addActionListener(disciplinas);
        disciplinaPesquisaJToggleButton.setActionCommand("disciplinaPesquisar");

        /*
        disciplinaPesquisaJToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disciplinaPesquisaJToggleButtonActionPerformed(evt);
            }
        });
        */

        jLabel8.setText("Curso:");

        cursoJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cursoJTextFieldActionPerformed(evt);
            }
        });

        cursoJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search_black.png"))); // NOI18N
        cursoJButton.addActionListener(disciplinas);
        cursoJButton.setActionCommand("cursoPesquisar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalAlunosJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(creditosJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(totalHorasJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cursoJTextField)
                            .addComponent(nomeJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cursoJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(disciplinaPesquisaJToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(disciplinaPesquisaJToggleButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(nomeJTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(cursoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cursoJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(creditosJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(totalHorasJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalAlunosJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Disciplina");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Adicionar Professor"));

        jLabel7.setText("Nome");

        professorPesquisaJToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search_black.png"))); // NOI18N
        //professorPesquisaJToggleButton.addActionListener(action);
        //professorPesquisaJToggleButton.setActionCommand("professorPesquisar");

        professorPesquisaJToggleButton.addActionListener(disciplinas);
        professorPesquisaJToggleButton.setActionCommand("professorPesquisar");
        /*
        professorPesquisaJToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                professorPesquisaJToggleButtonActionPerformed(evt);
            }
        });
        */

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(52, 52, 52)
                .addComponent(nomeProfessorJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(professorPesquisaJToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(nomeProfessorJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(professorPesquisaJToggleButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Procurar"));

        listaResultadoJList.setBorder(javax.swing.BorderFactory.createTitledBorder("Clique para Selecionar"));
        jScrollPane1.setViewportView(listaResultadoJList);
        listaResultadoJList.addListSelectionListener(actionList);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        codigoJTextField1.setEditable(false);
        codigoJTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoJTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Id");

        cancelarJToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        cancelarJToggleButton.setPreferredSize(new java.awt.Dimension(52, 32));
        cancelarJToggleButton.setActionCommand("cancelar");
        cancelarJToggleButton.addActionListener(disciplinas);
        /*
        cancelarJToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarJToggleButtonActionPerformed(evt);
            }
        });
        */

        clearJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clear.png"))); // NOI18N
        clearJButton1.addActionListener(disciplinas);
        clearJButton1.setActionCommand("clear");
        clearJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearJButton1ActionPerformed(evt);
            }
        });

        salvarJToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save_blue.png"))); // NOI18N
        salvarJToggleButton.addActionListener(disciplinas);
        salvarJToggleButton.setActionCommand("salvar");
        salvarJToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarJToggleButtonActionPerformed(evt);
            }
        });

        deletarjButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/deletar.png"))); // NOI18N
        deletarjButton2.addActionListener(disciplinas);
        deletarjButton2.setActionCommand("deletar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(salvarJToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(clearJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deletarjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelarJToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deletarjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salvarJToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarJToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(codigoJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(codigoJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigoJTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoJTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoJTextField1ActionPerformed

    private void cancelarJToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarJToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarJToggleButtonActionPerformed

    private void salvarJToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarJToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salvarJToggleButtonActionPerformed

    private void professorPesquisaJToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_professorPesquisaJToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_professorPesquisaJToggleButtonActionPerformed

    private void cursoJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cursoJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cursoJTextFieldActionPerformed

    private void disciplinaPesquisaJToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disciplinaPesquisaJToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disciplinaPesquisaJToggleButtonActionPerformed

    private void totalHorasJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalHorasJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalHorasJTextFieldActionPerformed

    private void totalAlunosJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalAlunosJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalAlunosJTextFieldActionPerformed

    private void nomeJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeJTextFieldActionPerformed

    private void clearJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearJButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearJButton1ActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        PrincipalJFrame.getJanela()[2] = false;
        br.sistemaescola.log.Log.gravarMessagem("A janela disciplina foi fechada");
    }//GEN-LAST:event_formInternalFrameClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton cancelarJToggleButton;
    private javax.swing.JButton clearJButton1;
    private javax.swing.JTextField codigoJTextField1;
    private javax.swing.JTextField creditosJTextField;
    private javax.swing.JButton cursoJButton;
    private javax.swing.JTextField cursoJTextField;
    private javax.swing.JButton deletarjButton2;
    private javax.swing.JToggleButton disciplinaPesquisaJToggleButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaResultadoJList;
    private javax.swing.JTextField nomeJTextField;
    private javax.swing.JTextField nomeProfessorJTextField;
    private javax.swing.JToggleButton professorPesquisaJToggleButton;
    private javax.swing.JToggleButton salvarJToggleButton;
    private javax.swing.JTextField totalAlunosJTextField;
    private javax.swing.JTextField totalHorasJTextField;
    // End of variables declaration//GEN-END:variables
}

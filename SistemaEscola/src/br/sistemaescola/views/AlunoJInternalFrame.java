package br.sistemaescola.views;


import br.sistemaescola.controller.AlunoController;
import javax.swing.JInternalFrame;
import br.sistemaescola.object.Aluno;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kadson lemuel de farias
 */
public class AlunoJInternalFrame extends javax.swing.JInternalFrame {
    Aluno aluno = new Aluno();
    AlunoController action = new AlunoController(this);
    
    public AlunoJInternalFrame() {
        initComponents();                      
    }
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nomealunoTextField = new javax.swing.JTextField();
        cpfTextField = new javax.swing.JTextField();
        rgalunoTextField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        buscarNomeJButton = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        nascimentoJTextField1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        telTextField = new javax.swing.JTextField();
        celTextField = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nomepaiTextField = new javax.swing.JTextField();
        nomemaeTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        rgpaiTextField = new javax.swing.JTextField();
        cpfmaeTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cpfPaiTextField = new javax.swing.JTextField();
        rgmaeTextField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cidadeTextField = new javax.swing.JTextField();
        bairroTextField = new javax.swing.JTextField();
        ruaTextField = new javax.swing.JTextField();
        nTextField = new javax.swing.JTextField();
        estadoJComboBox = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        salvarJButton = new javax.swing.JButton();
        cancelarJButton = new javax.swing.JButton();
        limparJButton = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Aluno Adicionar editar ");
        setToolTipText("");
        setMinimumSize(new java.awt.Dimension(925, 298));
        setPreferredSize(new java.awt.Dimension(925, 298));
        getContentPane().setLayout(null);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(383, 512, 0, 0);

        jPanel5.setForeground(new java.awt.Color(153, 255, 255));

        jLabel1.setText("Nome:");

        jLabel2.setText("CPF:");

        jLabel4.setText("RG:");

        nomealunoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomealunoTextFieldActionPerformed(evt);
            }
        });

        rgalunoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rgalunoTextFieldActionPerformed(evt);
            }
        });

        jLabel18.setText("Data de Nascimento:");

        buscarNomeJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search_black.png"))); // NOI18N
        buscarNomeJButton.setToolTipText("click aqui para buscar um aluno pelo seu nome");
        buscarNomeJButton.addActionListener(action);
        buscarNomeJButton.setActionCommand("buscar_nome");

        jLabel22.setText("ID");

        nascimentoJTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nascimentoJTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cpfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(rgalunoTextField))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nomealunoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buscarNomeJButton)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nascimentoJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nomealunoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addComponent(buscarNomeJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cpfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(rgalunoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(nascimentoJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22)))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Dados do Aluno", jPanel5);

        jLabel19.setText("Telefone:");

        jLabel20.setText("Celular:");

        jLabel21.setText("E-Mail:");

        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel20))
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(celTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(telTextField)
                    .addComponent(emailTextField))
                .addContainerGap(314, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(telTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(celTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Contato", jPanel4);

        jLabel10.setText("Pai:");

        jLabel11.setText("Mãe:");

        nomemaeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomemaeTextFieldActionPerformed(evt);
            }
        });

        jLabel12.setText("CPF:");

        jLabel13.setText("CPF:");

        rgpaiTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rgpaiTextFieldActionPerformed(evt);
            }
        });

        jLabel14.setText("RG:");

        jLabel16.setText("RG:");

        cpfPaiTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfPaiTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cpfPaiTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                        .addComponent(cpfmaeTextField)
                        .addComponent(nomemaeTextField))
                    .addComponent(nomepaiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(14, 14, 14)
                        .addComponent(rgpaiTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(rgmaeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 101, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rgpaiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(nomepaiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cpfPaiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rgmaeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16))
                    .addComponent(nomemaeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfmaeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Filiação", jPanel2);

        jLabel5.setText("Estado:");

        jLabel6.setText("Cidade:");

        jLabel8.setText("Rua:");

        jLabel9.setText("Nº:");

        cidadeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadeTextFieldActionPerformed(evt);
            }
        });

        bairroTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bairroTextFieldActionPerformed(evt);
            }
        });

        nTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nTextFieldActionPerformed(evt);
            }
        });

        estadoJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecionar", "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA)", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));
        estadoJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoJComboBoxActionPerformed(evt);
            }
        });

        jLabel7.setText("Bairro:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(bairroTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                        .addComponent(estadoJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cidadeTextField))
                    .addComponent(ruaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(212, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(estadoJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bairroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ruaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(nTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Endereço", jPanel1);

        getContentPane().add(jTabbedPane2);
        jTabbedPane2.setBounds(10, 10, 560, 190);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Alunos ja cadastrados"));

        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(580, 30, 310, 170);
        jPanel3.getAccessibleContext().setAccessibleName("Alunos já cadastrados");

        salvarJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save_blue.png"))); // NOI18N
        salvarJButton.setToolTipText("click aqui para cadastrar ou salvar as alterações feitas em um aluno");
        salvarJButton.addActionListener(action);
        salvarJButton.setActionCommand("salvar");
        salvarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarJButtonActionPerformed(evt);
            }
        });
        getContentPane().add(salvarJButton);
        salvarJButton.setBounds(440, 210, 60, 40);

        cancelarJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        cancelarJButton.setToolTipText("click aqui para fechar e cancelar o formulário");
        cancelarJButton.addActionListener(action);
        cancelarJButton.setActionCommand("cancelar");
        getContentPane().add(cancelarJButton);
        cancelarJButton.setBounds(510, 210, 65, 40);

        limparJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clear.png"))); // NOI18N
        limparJButton.setToolTipText("click aqui para limpar todo o formulário");
        limparJButton.addActionListener(action);
        limparJButton.setActionCommand("limpar");
        getContentPane().add(limparJButton);
        limparJButton.setBounds(360, 210, 65, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nTextFieldActionPerformed

    private void cidadeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidadeTextFieldActionPerformed

    private void nomemaeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomemaeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomemaeTextFieldActionPerformed

    private void cpfPaiTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfPaiTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfPaiTextFieldActionPerformed

    private void bairroTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bairroTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bairroTextFieldActionPerformed

    private void rgpaiTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rgpaiTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rgpaiTextFieldActionPerformed

    private void estadoJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoJComboBoxActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void rgalunoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rgalunoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rgalunoTextFieldActionPerformed

    private void nomealunoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomealunoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomealunoTextFieldActionPerformed

    private void salvarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarJButtonActionPerformed
                
                
    }//GEN-LAST:event_salvarJButtonActionPerformed

    private void nascimentoJTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nascimentoJTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nascimentoJTextField1ActionPerformed
       
    public Aluno getAluno(){
        
        
        // setando informaçõesPESSOAIS aluno       
        aluno.setNomeAluno(nomealunoTextField.getText());
        aluno.setCpfAluno(cpfTextField.getText());
        aluno.setRgAluno(rgalunoTextField.getText());
        aluno.setNascimentoAluno(nascimentoJTextField1.getText());
        
        // setando informações de CONTATO
        aluno.setAlunoTelefone(telTextField.getText());
        aluno.setAlunoCelular(celTextField.getText());
        aluno.setAlunoEmail(emailTextField.getText());
        
        // setando informações de FILIAÇÃO
        // pai
        aluno.setNomePai(nomepaiTextField.getText());
        aluno.setCpfPai(cpfPaiTextField.getText());        
        aluno.setRgPai(rgpaiTextField.getText());
        
        // mae
        aluno.setNomeMae(nomemaeTextField.getText());
        aluno.setCpfMae(cpfmaeTextField.getText());
        aluno.setRgMae(rgmaeTextField.getText());
        
        // setando informações de ENDEREÇO
        aluno.setEstado(estadoJComboBox.getSelectedItem().toString());
        aluno.setBairro(bairroTextField.getText());
        aluno.setCidade(cidadeTextField.getText());
        aluno.setRua(ruaTextField.getText());
        aluno.setNumero(ruaTextField.getText());
        
        return aluno;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairroTextField;
    private javax.swing.JButton buscarNomeJButton;
    private javax.swing.JButton cancelarJButton;
    private javax.swing.JTextField celTextField;
    private javax.swing.JTextField cidadeTextField;
    private javax.swing.JTextField cpfPaiTextField;
    private javax.swing.JTextField cpfTextField;
    private javax.swing.JTextField cpfmaeTextField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JComboBox estadoJComboBox;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JButton limparJButton;
    private javax.swing.JTextField nTextField;
    private javax.swing.JTextField nascimentoJTextField1;
    private javax.swing.JTextField nomealunoTextField;
    private javax.swing.JTextField nomemaeTextField;
    private javax.swing.JTextField nomepaiTextField;
    private javax.swing.JTextField rgalunoTextField;
    private javax.swing.JTextField rgmaeTextField;
    private javax.swing.JTextField rgpaiTextField;
    private javax.swing.JTextField ruaTextField;
    private javax.swing.JButton salvarJButton;
    private javax.swing.JTextField telTextField;
    // End of variables declaration//GEN-END:variables

    

public static void main(String args[]){
new JInternalFrame().setVisible(true);
}
}

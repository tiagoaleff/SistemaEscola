/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemaescola.views;

import br.sistemaescola.controller.GerenciarNotasController;
import br.sistemaescola.controller.list.GerenciarNotaListController;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class GerenciarNotasJInternalFrame extends javax.swing.JInternalFrame {

    
    GerenciarNotasController action = new GerenciarNotasController(this);
    GerenciarNotaListController actionList = new GerenciarNotaListController(this);
    private int idAluno;
    private String listaAtual;
    
    
    /**
     * Creates new form GerenciarNotasJInternalFrame
     */
    public GerenciarNotasJInternalFrame() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        nomeJTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        IdJTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        buscaridJButton = new javax.swing.JButton();
        nomeJButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaJTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaResultadoJList1 = new javax.swing.JList();
        jPanel3 = new javax.swing.JPanel();
        limparJButton = new javax.swing.JButton();
        deletarJButton1 = new javax.swing.JButton();
        fecharJButton = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Notas Gerenciador");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Gerenciar Notas");

        jLabel2.setText("Nome:");

        nomeJTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeJTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Código:");

        IdJTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdJTextField2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Insira o código ou o nome do aluno para pesquisar por um aluno, selecione o aluno na seção alunos para consultar suas notas:");

        buscaridJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search_black.png"))); // NOI18N
        buscaridJButton.setToolTipText("click para buscar um aluno pela id");
        buscaridJButton.addActionListener(action);
        buscaridJButton.setActionCommand("buscar_id");

        nomeJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search_black.png"))); // NOI18N
        nomeJButton.setToolTipText("click para buscar um aluno pelo nome");
        nomeJButton.addActionListener(action);
        nomeJButton.setActionCommand("buscar_nome");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado da pesquisa"));

        tabelaJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código Aluno", "Aluno", "Disciplina", "Peso", "Nota"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaJTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Alunos"));

        jScrollPane1.setViewportView(listaResultadoJList1);
        listaResultadoJList1.addListSelectionListener(actionList);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
        );

        limparJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clear.png"))); // NOI18N
        limparJButton.setToolTipText("Click aqui para limpar todos os campos do cadastro");
        limparJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        limparJButton.addActionListener(action);
        limparJButton.setActionCommand("limpar");

        deletarJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/deletar.png"))); // NOI18N
        deletarJButton1.addActionListener(action);
        deletarJButton1.setActionCommand("deletar");

        fecharJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        fecharJButton.setToolTipText("Click aqui para fechar a Janela e cancelar as alterações");
        fecharJButton.addActionListener(action);
        fecharJButton.setActionCommand("fechar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(limparJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deletarJButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fecharJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fecharJButton)
                    .addComponent(deletarJButton1)
                    .addComponent(limparJButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IdJTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeJTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buscaridJButton)
                            .addComponent(nomeJButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buscaridJButton, nomeJButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addComponent(jLabel4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nomeJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buscaridJButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(IdJTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(16, 16, 16)
                                .addComponent(jLabel2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(nomeJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {buscaridJButton, nomeJButton});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeJTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeJTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeJTextField1ActionPerformed

    private void IdJTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdJTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdJTextField2ActionPerformed

    public String getListaAtual() {
        return listaAtual;
    }

    public void setListaAtual(String listaAtual) {
        this.listaAtual = listaAtual;
    }
        
    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }    
    
    public JTable getTabelaJTable1() {
        return tabelaJTable1;
    }

    public JList getListaResultadoJList1() {
        return listaResultadoJList1;
    }

    public void setListaResultadoJList1(JList listaResultadoJList1) {
        this.listaResultadoJList1 = listaResultadoJList1;
    }

    public JTextField getIdJTextField2() {
        return IdJTextField2;
    }

    public void setIdJTextField2(JTextField IdJTextField2) {
        this.IdJTextField2 = IdJTextField2;
    }

    public JTextField getNomeJTextField1() {
        return nomeJTextField1;
    }

    public void setNomeJTextField1(JTextField nomeJTextField1) {
        this.nomeJTextField1 = nomeJTextField1;
    }  
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IdJTextField2;
    private javax.swing.JButton buscaridJButton;
    private javax.swing.JButton deletarJButton1;
    private javax.swing.JButton fecharJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton limparJButton;
    private javax.swing.JList listaResultadoJList1;
    private javax.swing.JButton nomeJButton;
    private javax.swing.JTextField nomeJTextField1;
    private javax.swing.JTable tabelaJTable1;
    // End of variables declaration//GEN-END:variables
}

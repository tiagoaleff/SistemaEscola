/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemaescola.views;

import br.sistemaescola.controller.CursoController;
import br.sistemaescola.controller.list.CursoListController;
import br.sistemaescola.object.Curso;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Leandro Justin Vieira
 */
public class CursoJInternalFrame extends javax.swing.JInternalFrame {
    
    
    private CursoListController cursoListSelectionListener = new CursoListController(this);    
    private CursoController action = new CursoController(this);    
    private String listaAtual;
    private int idResponsavel;
    
    public CursoJInternalFrame() {
        initComponents();        
        br.sistemaescola.log.Log.gravarMessagem("Aberta a janela de curso");        
    }
  
    public Curso atualizarDados (){
        
        String nome = nomeJTextField.getText();
        String professorResponsavel = professorJTextField.getText();
        String duracao = duracaoJTextField.getText();
        String descricao = descricaoJTextArea.getText();
        boolean noturno = noturnoJCheckBox.isSelected();
        boolean vespertino = vespertinoJCheckBox.isSelected();
        boolean matutino = matutinoJCheckBox.isSelected();
               
        Curso dados = 
                new Curso(nome,
                                    professorResponsavel,
                                    duracao,
                                    descricao,
                                    noturno,
                                    vespertino,
                                    matutino);     
        return dados;        
    }
    
    public int getIdResponsavel(){
        return idResponsavel;
    }
    
    public int setIdResponsavel(int id){
        idResponsavel = id;
    }
    
    public JList getJListResultado() {
        return jListResultado;
    }

    public String getCursoPesquisa() {
        return nomeJTextField.getText();
    }
    
    public String getListaAtual() {
        return listaAtual;
    }
    
    public void setListaAtual(String listaAtual) {
        this.listaAtual = listaAtual;
    }
    
    public JTextArea getDescricaoJTextArea() {
        return descricaoJTextArea;
    }

    public JTextField getDuracaoJTextField() {
        return duracaoJTextField;
    }

    public JTextField getIdJTextField() {
        return idJTextField;
    }

    public JCheckBox getMatutinoJCheckBox() {
        return matutinoJCheckBox;
    }

    public JTextField getNomeJTextField() {
        return nomeJTextField;
    }

    public JCheckBox getNoturnoJCheckBox() {
        return noturnoJCheckBox;
    }

    public JTextField getProfessorJTextField() {
        return professorJTextField;
    }

    public JCheckBox getVespertinoJCheckBox() {
        return vespertinoJCheckBox;
    }
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        cursoJLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        nomeJTextField = new javax.swing.JTextField();
        nomeJLabel = new javax.swing.JLabel();
        professorJTextField = new javax.swing.JTextField();
        professorJLabel = new javax.swing.JLabel();
        duracaoJTextField = new javax.swing.JTextField();
        duracaoJLabel = new javax.swing.JLabel();
        turnoJLabel = new javax.swing.JLabel();
        matutinoJCheckBox = new javax.swing.JCheckBox();
        vespertinoJCheckBox = new javax.swing.JCheckBox();
        noturnoJCheckBox = new javax.swing.JCheckBox();
        searchNomeJButton = new javax.swing.JButton();
        searchProfessorJButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricaoJTextArea = new javax.swing.JTextArea();
        idJLabel = new javax.swing.JLabel();
        idJTextField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListResultado = new javax.swing.JList();
        jPanel4 = new javax.swing.JPanel();
        cancelarJButton = new javax.swing.JButton();
        salvarJButton = new javax.swing.JButton();
        limparJButton = new javax.swing.JButton();
        deletarJButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Curso Adicionar Editar");

        cursoJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cursoJLabel.setText("Curso");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações do curso"));

        nomeJLabel.setText("Nome:");

        professorJLabel.setText("Professor responsável:");

        duracaoJLabel.setText("Duração:");

        turnoJLabel.setText("Turno:");

        matutinoJCheckBox.setText("Matutino");

        vespertinoJCheckBox.setText("Vespertino");

        noturnoJCheckBox.setText("Noturno");

        searchNomeJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search_black.png"))); // NOI18N
        searchNomeJButton.setToolTipText("Insira uma id e click neste botão para pesquisar um curso pelo nome e poder edita-lo");
        searchNomeJButton.addActionListener(action);
        searchNomeJButton.setActionCommand("pesquisarNome");

        searchProfessorJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search_black.png"))); // NOI18N
        searchProfessorJButton.setToolTipText("procure por professores existentes");
        searchProfessorJButton.addActionListener(action);
        searchProfessorJButton.setActionCommand("pesquisarProfessor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nomeJLabel)
                        .addComponent(professorJLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(turnoJLabel)
                    .addComponent(duracaoJLabel))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(duracaoJTextField)
                    .addComponent(professorJTextField)
                    .addComponent(nomeJTextField)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(matutinoJCheckBox)
                        .addGap(10, 10, 10)
                        .addComponent(vespertinoJCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(noturnoJCheckBox)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchProfessorJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchNomeJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchNomeJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nomeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nomeJLabel)))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(professorJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(professorJLabel)
                    .addComponent(searchProfessorJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(duracaoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(duracaoJLabel))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(turnoJLabel)
                    .addComponent(matutinoJCheckBox)
                    .addComponent(vespertinoJCheckBox)
                    .addComponent(noturnoJCheckBox))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Descrição do curso"));

        descricaoJTextArea.setColumns(20);
        descricaoJTextArea.setRows(5);
        jScrollPane1.setViewportView(descricaoJTextArea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        idJLabel.setText("ID");

        idJTextField.setEditable(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado da pesquisa"));

        jListResultado.setToolTipText("");
        jListResultado.addListSelectionListener(cursoListSelectionListener);
        jScrollPane2.setViewportView(jListResultado);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        cancelarJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        cancelarJButton.setToolTipText("Click aqui para fechar a Janela e cancelar as alterações");
        cancelarJButton.addActionListener(action);
        cancelarJButton.setActionCommand("cancelar");

        salvarJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save_blue.png"))); // NOI18N
        salvarJButton.setToolTipText("Click aqui para salvar as informações do formulário");
        salvarJButton.addActionListener(action);
        salvarJButton.setActionCommand("salvar");

        limparJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clear.png"))); // NOI18N
        limparJButton.setToolTipText("Click aqui para limpar todos os campos do cadastro");
        limparJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        limparJButton.addActionListener(action);
        limparJButton.setActionCommand("limpar");

        deletarJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/deletar.png"))); // NOI18N
        deletarJButton1.setPreferredSize(new java.awt.Dimension(65, 41));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(limparJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salvarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deletarJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(limparJButton)
                    .addComponent(salvarJButton)
                    .addComponent(cancelarJButton)
                    .addComponent(deletarJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        limparJButton.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cursoJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(idJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(idJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(cursoJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idJLabel))))
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jPanel1.getAccessibleContext().setAccessibleDescription("");
        jPanel2.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarJButton;
    private javax.swing.JLabel cursoJLabel;
    private javax.swing.JButton deletarJButton1;
    private javax.swing.JTextArea descricaoJTextArea;
    private javax.swing.JLabel duracaoJLabel;
    private javax.swing.JTextField duracaoJTextField;
    private javax.swing.JLabel idJLabel;
    private javax.swing.JTextField idJTextField;
    private javax.swing.JList jListResultado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton limparJButton;
    private javax.swing.JCheckBox matutinoJCheckBox;
    private javax.swing.JLabel nomeJLabel;
    private javax.swing.JTextField nomeJTextField;
    private javax.swing.JCheckBox noturnoJCheckBox;
    private javax.swing.JLabel professorJLabel;
    private javax.swing.JTextField professorJTextField;
    private javax.swing.JButton salvarJButton;
    private javax.swing.JButton searchNomeJButton;
    private javax.swing.JButton searchProfessorJButton;
    private javax.swing.JLabel turnoJLabel;
    private javax.swing.JCheckBox vespertinoJCheckBox;
    // End of variables declaration//GEN-END:variables
}

package br.sistemaescola.views;

import br.sistemaescola.controller.PrincipalController;
import br.sistemaescola.object.Aluno;
import br.sistemaescola.object.Curso;
import br.sistemaescola.object.Disciplina;
import br.sistemaescola.object.Faltas;
import br.sistemaescola.object.Professor;
import javax.swing.JDesktopPane;

/**
 *
 * @author Leandro Justin Vieira
 */
public class PrincipalJFrame extends javax.swing.JFrame {

    PrincipalController action = new PrincipalController(this); 
    
    public PrincipalJFrame() {
       initComponents();
            
       Professor p = new Professor();
       p.setNomeProfessor("Gilberto Vieira");    
       Professor p1 = new Professor();
       p1.setNomeProfessor("Paracelsio");
       br.sistemaescola.list.ProfessorList.addProfessor(p1);
       br.sistemaescola.list.ProfessorList.addProfessor(p); 
       
       
       Aluno aluno = new Aluno();
       aluno.setNomeAluno("Leandro Justin Vieira");
       Aluno aluno2 = new Aluno();
       aluno2.setNomeAluno("Tiago Aleff da Silva");
       Aluno aluno3 = new Aluno();
       aluno3.setNomeAluno("Kadson Farias");
       br.sistemaescola.list.AlunoList.addAluno(aluno);
       br.sistemaescola.list.AlunoList.addAluno(aluno2);
       br.sistemaescola.list.AlunoList.addAluno(aluno3);
       
       Disciplina disciplina = new Disciplina("Topicos I", null, "4", "20", "70", "Ciência da Computação", "Gilberto Vieira");
       Disciplina disciplina2 = new Disciplina("Banco de Dados I", null, "4", "20", "70", "Ciência da Computação", "Paracelsio");
       br.sistemaescola.list.DisciplinaList.addDisciplina(disciplina);
       br.sistemaescola.list.DisciplinaList.addDisciplina(disciplina2);
       
       
       Curso cienciaDaComputacao = new Curso("Ciência da Computação",
                                             "Gilberto Vieira",
                                             "78",
                                             "Graduacao em programacao",
                                             true, false, false);
       Curso direito             = new Curso("Direito",
                                             "Professor teste",
                                             "78",
                                             "Graduacao em direito",
                                             true, true, true);
       br.sistemaescola.list.CursoList.addCurso(direito);
       br.sistemaescola.list.CursoList.addCurso(cienciaDaComputacao);
       
       
       Faltas f = new Faltas("Ciência da Computação", "Topicos I", "Leandro Justin Vieira", "07", "novembro", "2015", true, true, true, true);
       Faltas f1 = new Faltas("Ciência da Computação", "Topicos I", "Leandro Justin Vieira", "08", "novembro", "2015", true, true, true, true);
       Faltas f2 = new Faltas("Ciência da Computação", "Topicos I", "Leandro Justin Vieira", "09", "novembro", "2015", true, true, true, true);
       Faltas f3 = new Faltas("Ciência da Computação", "Topicos I", "Tiago Aleff da Silva", "09", "novembro", "2015", true, true, true, true);
       br.sistemaescola.list.FaltasList.addFaltas(f);
       br.sistemaescola.list.FaltasList.addFaltas(f1);
       br.sistemaescola.list.FaltasList.addFaltas(f2);
       br.sistemaescola.list.FaltasList.addFaltas(f3);
       
       
    }

    public JDesktopPane getPrincipalFrame() {
        return JDesktopPane;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JDesktopPane = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        legalJLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        alunoJMenuItem = new javax.swing.JMenuItem();
        professorJMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        disciplinaJMenuItem = new javax.swing.JMenuItem();
        cursoJMenuItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        notaJMenuItem = new javax.swing.JMenuItem();
        faltaJMenuItem = new javax.swing.JMenuItem();
        diarioAcademicoJMenu = new javax.swing.JMenu();
        gerenciarNotasJMenuItem = new javax.swing.JMenuItem();
        gerenciarFaltasJMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Escola");

        JDesktopPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JDesktopPane.setForeground(new java.awt.Color(204, 204, 204));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo sistema escola- transparente.png"))); // NOI18N

        javax.swing.GroupLayout JDesktopPaneLayout = new javax.swing.GroupLayout(JDesktopPane);
        JDesktopPane.setLayout(JDesktopPaneLayout);
        JDesktopPaneLayout.setHorizontalGroup(
            JDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDesktopPaneLayout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JDesktopPaneLayout.setVerticalGroup(
            JDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDesktopPaneLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(212, Short.MAX_VALUE))
        );
        JDesktopPane.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        legalJLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        legalJLabel.setText("Copyrigth @ Your Aplication 2015");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(899, Short.MAX_VALUE)
                .addComponent(legalJLabel)
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(legalJLabel)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jMenu1.setText("Cadastrar / Editar");

        alunoJMenuItem.setText("Aluno");
        alunoJMenuItem.addActionListener(action);
        alunoJMenuItem.setActionCommand("aluno");
        jMenu1.add(alunoJMenuItem);

        professorJMenuItem.setText("Professor");
        professorJMenuItem.addActionListener(action);
        professorJMenuItem.setActionCommand("professor");
        professorJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                professorJMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(professorJMenuItem);
        jMenu1.add(jSeparator1);

        disciplinaJMenuItem.setText("Disciplina");
        disciplinaJMenuItem.addActionListener(action);
        disciplinaJMenuItem.setActionCommand("disciplina");
        jMenu1.add(disciplinaJMenuItem);

        cursoJMenuItem.setText("Curso");
        cursoJMenuItem.addActionListener(action);
        cursoJMenuItem.setActionCommand("curso");
        jMenu1.add(cursoJMenuItem);
        jMenu1.add(jSeparator2);

        notaJMenuItem.setText("Nota");
        notaJMenuItem.addActionListener(action);
        notaJMenuItem.setActionCommand("nota");
        jMenu1.add(notaJMenuItem);

        faltaJMenuItem.setText("Falta");
        faltaJMenuItem.addActionListener(action);
        faltaJMenuItem.setActionCommand("falta");
        jMenu1.add(faltaJMenuItem);

        jMenuBar1.add(jMenu1);

        diarioAcademicoJMenu.setText("Diário acadêmico");

        gerenciarNotasJMenuItem.setText("Gerenciar Notas");
        gerenciarNotasJMenuItem.addActionListener(action);
        gerenciarNotasJMenuItem.setActionCommand("gerenciar notas");
        diarioAcademicoJMenu.add(gerenciarNotasJMenuItem);

        gerenciarFaltasJMenuItem.setText("Gerenciar Faltas");
        gerenciarFaltasJMenuItem.addActionListener(action);
        gerenciarFaltasJMenuItem.setActionCommand("gerenciar faltas");
        diarioAcademicoJMenu.add(gerenciarFaltasJMenuItem);

        jMenuBar1.add(diarioAcademicoJMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JDesktopPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JDesktopPane)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void professorJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_professorJMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_professorJMenuItemActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane JDesktopPane;
    private javax.swing.JMenuItem alunoJMenuItem;
    private javax.swing.JMenuItem cursoJMenuItem;
    private javax.swing.JMenu diarioAcademicoJMenu;
    private javax.swing.JMenuItem disciplinaJMenuItem;
    private javax.swing.JMenuItem faltaJMenuItem;
    private javax.swing.JMenuItem gerenciarFaltasJMenuItem;
    private javax.swing.JMenuItem gerenciarNotasJMenuItem;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private volatile javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel legalJLabel;
    private javax.swing.JMenuItem notaJMenuItem;
    private javax.swing.JMenuItem professorJMenuItem;
    // End of variables declaration//GEN-END:variables
}

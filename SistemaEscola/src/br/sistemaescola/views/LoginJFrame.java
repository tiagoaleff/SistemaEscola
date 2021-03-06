package br.sistemaescola.views;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




import br.sistemaescola.config.CarregarLogin;
import br.sistemaescola.controller.LoginController;
import br.sistemaescola.controller.teclado.LoginTecladoController;
import br.sistemaescola.object.Login;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author Leandro Justin Vieira
 */
public class LoginJFrame extends javax.swing.JFrame {
    
    
    LoginTecladoController actionTeclado = new LoginTecladoController(this);
    LoginController action = new LoginController(this);
    CarregarLogin lastlogin;
    
    public LoginJFrame() {
        initComponents();
        
        lastlogin = new CarregarLogin();
        br.sistemaescola.log.Log.gravarMessagem("Programa aberto com sucesso");
        carregarLogin();
    }
    
    private void carregarLogin(){        
        String lastUser = lastlogin.getLogin().getUser();
        userJTextField.setText(lastUser);
    }
    
    public Login createLogin(){
        String user = userJTextField.getText();
        String password = new String(passwordJField.getPassword());
        
        Login result = new Login(user, password);
        
        return result;
    }

    public CarregarLogin getLastlogin() {
        return lastlogin;
    }

    public JPasswordField getPasswordJField() {
        return passwordJField;
    }

    public JTextField getUserJTextField() {
        return userJTextField;
    }
      
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userJTextField = new javax.swing.JTextField();
        userJLabel = new javax.swing.JLabel();
        passwordJLabel = new javax.swing.JLabel();
        loginJButton = new javax.swing.JButton();
        passwordJField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        versionJLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        legalJLabel = new javax.swing.JLabel();
        helpJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        userJTextField.addKeyListener(actionTeclado);

        userJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        userJLabel.setText("Usuário:");

        passwordJLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        passwordJLabel.setText("Senha:");

        loginJButton.setText("Entrar");
        loginJButton.addActionListener(action);
        loginJButton.setActionCommand("entrar");

        passwordJField.addKeyListener(actionTeclado);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo sistema escola- transparente.png"))); // NOI18N

        versionJLabel.setText("Version 1.0.0.0.1");

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        legalJLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        legalJLabel.setText("Copyrigth @ Your Aplication 2015");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        helpJButton.setText("Preciso de ajuda");
        helpJButton.addActionListener(action);
        helpJButton.setActionCommand("help");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(versionJLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordJLabel)
                            .addComponent(userJLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(loginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(helpJButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addComponent(passwordJField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(versionJLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(userJLabel)
                        .addGap(15, 15, 15)
                        .addComponent(userJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(passwordJLabel)
                        .addGap(15, 15, 15)
                        .addComponent(passwordJField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loginJButton)
                            .addComponent(helpJButton))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton helpJButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel legalJLabel;
    private javax.swing.JButton loginJButton;
    private javax.swing.JPasswordField passwordJField;
    private javax.swing.JLabel passwordJLabel;
    private javax.swing.JLabel userJLabel;
    public javax.swing.JTextField userJTextField;
    private javax.swing.JLabel versionJLabel;
    // End of variables declaration//GEN-END:variables
}

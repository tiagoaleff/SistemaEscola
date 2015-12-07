/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.controller;

import br.sistemaescola.config.ConfigUser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import br.sistemaescola.object.Login;
import br.sistemaescola.views.LoginJFrame;
import br.sistemaescola.views.PrincipalJFrame;
import java.io.IOException;

/**
 * 
 * @author Leandro Justin Vieira
 */
public class LoginController implements ActionListener {

    private LoginJFrame  loginFrame;

    public LoginController(LoginJFrame loginFrame) {
        this.loginFrame = loginFrame;
    }


    @Override
    public void actionPerformed(ActionEvent evt) {
    String action = evt.getActionCommand();
       switch (action) {
           case "entrar":
               verificarConexao( loginFrame.createLogin());
               break;
           case "help":
               help();
               break;
       }
    }
    
    public void verificarConexao(Login result){
        
        ConfigUser config = new ConfigUser();
                               
        if(!result.getUser().equals(config.getUser())){
            JOptionPane.showMessageDialog(loginFrame, "usuário ou senha incorreta");
            br.sistemaescola.log.Log.gravarMessagem("Falha ao fazer login na Aplicacao, usuario ou senha incorreta");
            loginFrame.getUserJTextField().setText("");
            loginFrame.getPasswordJField().setText("");
            loginFrame.getUserJTextField().requestFocus();
            return;
        }
        
        if(!result.getPassword().equals(config.getPassword())){
            JOptionPane.showMessageDialog(loginFrame, "usuário ou senha incorreta");
            br.sistemaescola.log.Log.gravarMessagem("Falha ao fazer login na Aplicacao, usuario ou senha incorreta");
            loginFrame.getUserJTextField().setText("");
            loginFrame.getPasswordJField().setText("");
            loginFrame.getUserJTextField().requestFocus();
            return;
        }        
        
        loginFrame.dispose();
        br.sistemaescola.log.Log.gravarMessagem( "Usuario " + result.getUser() + " logado na aplicacao");
        new PrincipalJFrame().setVisible(true);
        
        
        try {
            loginFrame.getLastlogin().escrever(result);
            JOptionPane.showMessageDialog(loginFrame, "Login Salvo na aplicação");
            br.sistemaescola.log.Log.gravarMessagem("Login Salvo na aplicação");
        } catch (IOException ex) {
            br.sistemaescola.log.Log.gravarMessagem("Erro ao Salvar o login : " + ex.getMessage());
            JOptionPane.showMessageDialog(loginFrame, "Erro ao Salvar o login");
        }
        
    }
    
    private void help(){
        
        String mensagem = 
                " A aplicação tem como funcionalidar gerir um sistema escolar\n"
                + "Para fazer login no programa deve-se informar o nome do usuario"
                + " e sua respectiva senha, nos campos correspondentes\n"
                + "Usuario Admin Senha 1234 (padrão)\n"
                + "Desenvolvedores: Leandro, Tiago e Kadson";
        
        
        JOptionPane.showMessageDialog(loginFrame, mensagem);
    }
    
    
}

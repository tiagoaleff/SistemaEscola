/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.controller.teclado;

import br.sistemaescola.controller.LoginController;
import br.sistemaescola.views.LoginJFrame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class LoginTecladoController implements KeyListener{

    private LoginJFrame frame;
    
    public LoginTecladoController(LoginJFrame frame) {
        this.frame = frame;
    }
    
    @Override
    public void keyTyped(KeyEvent e) {}
  
    @Override
    public void keyPressed(KeyEvent e) {
        
        if(frame.getUserJTextField().hasFocus()){
            if( e.getKeyCode() ==  KeyEvent.VK_ENTER) {
             frame.getPasswordJField().requestFocus(true);
            } 
        } 
        
        if(frame.getPasswordJField().hasFocus()){
            if( e.getKeyCode() ==  KeyEvent.VK_ENTER) {
                LoginController controller = new LoginController(frame);
                controller.verificarConexao(frame.createLogin());
            }
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {}


}

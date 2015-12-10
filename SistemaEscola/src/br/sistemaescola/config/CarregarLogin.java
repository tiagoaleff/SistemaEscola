/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.config;

import br.sistemaescola.object.Login;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class CarregarLogin {

    File file = new File("login.log");
    Login login;
    
    public CarregarLogin(){
        login = new Login();
        
        try {
            login = ler();
            br.sistemaescola.log.Log.gravarMessagem("Ultimo login carregado com sucesso");
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler último login!");
            br.sistemaescola.log.Log.gravarMessagem("Erro ao ler o último login : " + ex.getMessage());
        }
    }

    public Login getLogin() {
        return login;
    }
        
    
    public void escrever(Login login) throws IOException {
        
        FileOutputStream fos = new FileOutputStream(file);

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(login);

        oos.flush();

        oos.close();
    
    }

    
    //lê os dados da agenda já gravados em disco
    private Login ler() throws FileNotFoundException, IOException, ClassNotFoundException {
        
        FileInputStream fis = new FileInputStream(file);

        ObjectInputStream ois = new ObjectInputStream(fis);

        Login lastLogin  = (Login)ois.readObject();

        fis.close();   
        
        return lastLogin;
    }
    
    
}


import java.awt.Color;
import br.sistemaescola.views.loginJFrame;

/**
 * 
 * @author Leandro Justin Vieira
 */
public class Executar {
    
    public static void main(String args[]){
        
        loginJFrame login = new loginJFrame();
        login.setVisible(true);
        login.getContentPane().setBackground(Color.white);
    }

}

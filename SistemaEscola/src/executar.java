
import java.awt.Color;
import views.loginJFrame;

/**
 * 
 * @author Leandro Justin Vieira
 */
public class executar {
    
    public static void main(String args[]){
        
        loginJFrame login = new loginJFrame();
        login.setVisible(true);
        login.getContentPane().setBackground(Color.white);
    }

}

package CONTROLADOR;

import VISTA.CajasMensaje;
import VISTA.Juego;
import VISTA.menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.event.AncestorListener;

/**
 *
 * @author Tutorias
 */
public class Control implements ActionListener {
    
    private menu Menu;
   Juego game = new Juego();
    boolean Pausa = true;
    CajasMensaje msj;
     String NombreJugador;  
    public Control()
    {
        Menu = new menu();
        
        Menu.getBoton_ini().addActionListener(this);
         
    }
    
    
    
    public  void iniciar() {
        this.Menu.setVisible(true);
        while(Pausa)  
        {
            System.out.println("Juego iniciado");     
        }
        game.arranque();
       
    }
 
    
    public static void main(String[] args) {
        Control control = new Control();
        control.iniciar();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(Menu.getBoton_ini()))
        {
            NombreJugador = Menu.getTxt_NombreJugador().getText();
            
            Menu.setVisible(false);
          Pausa = false;
        }
    }
}

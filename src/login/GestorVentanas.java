package login;

import javax.swing.*;

public class GestorVentanas extends JFrame{
    
    public static void abrirVentanaPrincipal(JFrame ventanaActual, JFrame nuevaVentana){
        
        ventanaActual.dispose();
        nuevaVentana.setVisible(true);
        
        /*principal menu =new principal(); // abre el menu principal
        menu.setVisible(true);
        dispose(); // cierra el login*/
    }

}

package login;

import javax.swing.*;

public class login extends JFrame{
    private JTextField usuario;
    private JPasswordField password;
    private JButton submit;
    
    
    public login(){
        setTitle("Login");
        setSize(500, 500); //Tamaño de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// cierra con x
        setLayout(null);
            
        JLabel usuarioLabel = new JLabel("Usuario:"); // texto para identificar
        usuarioLabel.setBounds(20, 20, 80, 25);
        add(usuarioLabel);// lo muestra

        usuario = new JTextField(); // input
        usuario.setBounds(100, 20, 150, 25);
        add(usuario);
        
        JLabel passwordLabel = new JLabel("Contraseña:"); // texto para identificar
        passwordLabel.setBounds(20, 60, 80, 25);
        add(passwordLabel);// lo muestra
        
        password = new JPasswordField(); //input de contraseña
        password.setBounds(100, 60, 150, 25);
        add(password);
        
        submit = new JButton("Ingresar");
        submit.setBounds(100, 100, 100, 30);
        add(submit);
        
        // Proceso para el login
        submit.addActionListener(e -> validarDatos());
        
        setVisible(true);
       }
    
    private void validarDatos(){
        //extraigo los datos del form
        String textoUsuario = usuario.getText();
        String textoPassword = new String(password.getPassword());
        
        //Validación
        
        if(textoUsuario.equals("MASTER") && textoPassword.equals("1234")){
            JOptionPane.showMessageDialog(this, "Bienvenido :D");
            GestorVentanas.abrirVentanaPrincipal(this, new principal());
        }else{
            JOptionPane.showMessageDialog(this, "Usuario o Contraseña Incorrectos");
        }
    }
}


/*

public class login extends JFrame{
  private JTextField usuario;
  private JPassword password;
  private JButton submit;
}

public login(){
    setTitle("Login");
    setSize(500, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
JLabel usuarioLabel = new Jlabel("Usuario:");
add(usuarioLabel);

usuario = new JTextField();
add(usuario);




}

//public class login extends JFrame{
  //     public Ventana(){
    //        setSize(500, 500); //Tamaño de la ventana
      //      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // }
//}*/




package login;

import javax.swing.*;

public class principal extends JFrame{
    
    private JButton facturar;
    private JButton reportes;
    
    public principal(){
        setTitle("Menu Principal");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        facturar = new JButton("Facturar");
        facturar.setBounds(20, 100, 150, 30);
        add(facturar);
        
        reportes = new JButton("Ver Reportes");
        reportes.setBounds(20, 200, 150, 30);
        add(reportes);
        
        // Procesos para desviarse
        facturar.addActionListener(e -> abrirFactura());
        reportes.addActionListener(e -> abrirReportes());
    }
    
    public static void main(String[] args){
        login ventana = new login();
        ventana.setVisible(true);
        
    }
    
    private void abrirFactura(){
        factura ven_factura = new factura();
        ven_factura.setVisible(true);
        dispose();
    }
    private void abrirReportes(){
        reporte ven_reporte = new reporte();
        ven_reporte.setVisible(true);
        dispose();
    }
    
}

/*public class principal {
    public static void main(String[] args) {
        login ventana = new login();
        ventana.setVisible(true);
    }
}*/


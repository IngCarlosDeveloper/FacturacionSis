package login;
import javax.swing.*;

public class reporte extends JFrame {
    
    public JButton volver_principal;
    private JButton imprimir;
    private JComboBox<String> opciones;
    private JTextField monto;
    public static String[] lista = {
        "Todos",
        "01 - desinfectante azul",
        "02 - desinfectante rojo",
        "03 - desinfectante verde",
        "04 - desinfectante amarillo",
        "05 - desinfectante morado"
    };
    public int item;
    public int monto_mayor;
    private String mon_mayor;
    
    public reporte(){
            setTitle("Reportes");
            setSize(500, 500);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(null);
            
    volver_principal = new JButton("Pagina Principal");
    volver_principal.setBounds(125, 20, 200, 25);
    add(volver_principal);
        
    volver_principal.addActionListener(e -> GestorVentanas.abrirVentanaPrincipal(this, new principal()));
    
    opciones = new JComboBox<>(lista);
    opciones.setBounds(20, 80, 200,25);
    add(opciones);
    
    JLabel valorFactura = new JLabel("Solo mayor a: ");
    valorFactura.setBounds(20, 120, 200,25);
    add(valorFactura);
    
    monto = new JTextField();   
    monto.setBounds(20, 160, 200, 25);
    add(monto);
    
    imprimir = new JButton("Imprimir Reporte");
    imprimir.setBounds(125, 220, 200, 25 );
    add(imprimir);
    
    imprimir.addActionListener(e -> generarReporte());
}
    
    private void generarReporte(){
        
        item = opciones.getSelectedIndex();
        mon_mayor = monto.getText();
        
        if (mon_mayor.isEmpty()){
            monto_mayor = 0;
        }else{
           monto_mayor = Integer.parseInt(monto.getText());
        }
        
        buscador.buscar(item, monto_mayor);
        
    }
    
    
    public static void main(String[] args) {
        reporte ven_reporte = new reporte();
        ven_reporte.setVisible(true);
    }
}

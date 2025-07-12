package login;
import javax.swing.*;

public class factura extends JFrame {
    public JButton volver_principal;
    private JButton totalizar;
    public JTextField cantidad;
    private JComboBox<String> listaDesplegable;
    private String[] opciones = {
        "01 - desinfectante azul - 6 Bs.D",
        "02 - desinfectante rojo - 10 Bs.D",
        "03 - desinfectante verde - 15 Bs.D",
        "04 - desinfectante amarillo - 20 Bs.D",
        "05 - desinfectante morado - 30 Bs.D"
     };
    public int precio;
    public String item;
    public int productoSeleccionado;
    public int intCantidad;
    
    public factura(){
        setTitle("Facturación");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        volver_principal = new JButton("Pagina Principal");
        volver_principal.setBounds(125, 20, 200, 25);
        add(volver_principal);
        
        volver_principal.addActionListener(e -> GestorVentanas.abrirVentanaPrincipal(this, new principal()));
            
        
        listaDesplegable = new JComboBox<>(opciones);
        listaDesplegable.setBounds(20, 80, 200, 25);
        add(listaDesplegable);
            
        JLabel cantidadLabel = new JLabel("Cantidad: ");
        cantidadLabel.setBounds(20, 120, 200, 25);
        add(cantidadLabel);
        
        cantidad = new JTextField();
        cantidad.setBounds(80,120,200,25);
        add(cantidad);
        
            
        totalizar = new JButton("Totalizar");
        totalizar.setBounds(20, 160, 200, 25);
        add(totalizar);
        
        totalizar.addActionListener(e -> cobrar());
        
    }
    
    private void cobrar(){
        intCantidad = Integer.parseInt(cantidad.getText());
        productoSeleccionado = listaDesplegable.getSelectedIndex();
        item = (String)listaDesplegable.getSelectedItem();
        
        precio = switch (productoSeleccionado) {
            case 0 -> 6;
            case 1 -> 10;
            case 2 -> 15;
            case 3 -> 20;
            case 4 -> 30;
            default -> 0;
        };
        
        
        
        JOptionPane.showMessageDialog(this, "Producto: " + item + "\nCantidad: "+
               intCantidad +" Litros. \nPrecio Unitario: " +
               precio + " Bs.D \nTotal Venta: "+ intCantidad*precio +" Bs.D");
        
        int total = intCantidad*precio;
        
        int product = productoSeleccionado + 1;
        
        guardar.guardarFactura(product, item, intCantidad, precio, total);
    }
    
    
    
    public static void main(String[] args) {
        factura ven_factura = new factura();
        ven_factura.setVisible(true);
    }
}
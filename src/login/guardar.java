package login;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

public class guardar extends JFrame{
    public static void guardarFactura(int indiceItem, String descripcion, int CantidadProd, int precioUni, int total){
        try (FileWriter escribir = new FileWriter("facturas.txt", true)){
            escribir.write(indiceItem + ";" + descripcion + ";" + CantidadProd + ";" + precioUni + ";" + total +"\n");
            escribir.flush();
            
            JOptionPane.showMessageDialog(null, "Factura guardada correctamente!");
        } catch(IOException e){
            e.printStackTrace();
        }
       
    }
    public static void main(String[] args) {
        guardar ven_guardar = new guardar();
        ven_guardar.setVisible(true);
        
        //guardarFactura(1, "queso", 5, 3);
    }
}

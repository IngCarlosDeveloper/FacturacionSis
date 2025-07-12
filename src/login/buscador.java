package login;
import java.io.*;
import javax.swing.*;

public class buscador extends JFrame{
        
    public static void buscar(int item, int monto_mayor){
        int sumaTotal = 0; //Acumulador
        int litrosTotal = 0;
        String producto = "";
        
        try (BufferedReader br = new BufferedReader(new FileReader("facturas.txt"))){
            String linea;
            
            while((linea = br.readLine()) != null){
                //Separar por ;
                String[] partes = linea.split(";");
                
                int codigo = Integer.parseInt(partes[0].trim());
                int litros = Integer.parseInt(partes[2].trim());
                int totalVenta = Integer.parseInt(partes[4].trim());
                
                if (item != 0){
                    if(codigo == item && totalVenta >= monto_mayor){
                        sumaTotal += totalVenta;
                        litrosTotal += litros;
                        producto = reporte.lista[item];
                    }
                } else {
                    if(totalVenta >= monto_mayor){
                        sumaTotal += totalVenta;
                        litrosTotal += litros;
                        producto = "Todos";
                    }
                }
            }
            
            JOptionPane.showMessageDialog(null, "El producto seleccionado fue: " + producto +
                    "\n Total de Litro vendidos: " + litrosTotal +
                    "\n MontoTotal: "+ sumaTotal);
            
            
        } catch (IOException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al leer el archivo.");
        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en el formato de los datos.");
        }
    }
    
    
}

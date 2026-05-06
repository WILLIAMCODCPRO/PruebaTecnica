
package Controlador;

import Modelo.Producto;
import java.util.ArrayList;
import java.util.Scanner;


public class FlujoSecundario {
    
    

    public FlujoSecundario() {
    }
    
    public void registrarProducto(ArrayList <Producto> productos){
        System.out.println("Id producto");
        int idProducto = new Scanner(System.in).nextInt();
        
        System.out.println("Nombre producto");
        String nombreProducto = new Scanner(System.in).nextLine();
        
        System.out.println("Precio producto");
        double precioProducto = new Scanner(System.in).nextDouble();
        
        System.out.println("Stock producto");
        int stockProducto = new Scanner(System.in).nextInt();
        
        Producto productoFinal = new Producto(idProducto, nombreProducto, precioProducto,stockProducto);
        productos.add(productoFinal);
    }
    
    public void listarProductos(ArrayList <Producto> productos){
    
       productos.forEach(System.out::println);
    
    }
    
  
}

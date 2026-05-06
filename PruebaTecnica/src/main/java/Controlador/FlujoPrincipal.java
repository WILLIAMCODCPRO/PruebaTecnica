
package Controlador;

import Modelo.Producto;
import Vista.Menu;
import java.util.ArrayList;
import java.util.Scanner;



public class FlujoPrincipal {
    private final Menu menuprincipal = new Menu();
    private final FlujoSecundario secundario = new FlujoSecundario();

    public FlujoPrincipal() {
        
    }

    
    

    
    
    public void FlujoPrincipal(){
        int opcionUsuario;
        ArrayList <Producto> productos = new ArrayList<>();
        do {
            menuprincipal.MenuPrincipal();
            opcionUsuario = new Scanner(System.in).nextInt();
            switch (opcionUsuario) {
                case 1 -> secundario.registrarProducto(productos);
                case 2 -> secundario.listarProductos(productos);
                case 3 -> {
                }
                case 4 -> {
                }
                case 5 -> {}
                case 6 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Esa opcion no esta disponible");
            }
        } while (opcionUsuario != 6);
    
    }
    
    
    
    
}

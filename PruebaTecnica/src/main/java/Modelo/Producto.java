package Modelo;

public class Producto {
    private int id;
    private String nombre;
    private Double precio;
    private int Stock;

    public Producto(int id, String nombre, Double precio, int Stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.Stock = Stock;
    }

    public Producto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }
    
     @Override
    public String toString() {
        return "id " + " "+ id +" "+ "nombre " +" "+ nombre +" "+ "precio " +" "+ precio + "stock " + Stock;
    }
    
    
}

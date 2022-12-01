/*
 Asistencia Noviembre Andrea Llavel
 */
package ar.com.codesystem.ventas;

public class Producto {
    //Atributos de la Clase
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;
    //Constructor Vacio
    private Producto(){
        this.idProducto=++Producto.contadorProductos;
    }
    public Producto(String nombre, double precio){
        this();  //Llamamosal contador vacio para el aumento de idProducto
        this.nombre=nombre;
        this.precio=precio;
        
    }
// Hacemos click derecho Insert Code/Getter and Setter /No tildamos contador/Solo producto,nombre y precio 
    public int getIdProducto() {
        return idProducto;
    }    //No necesitmaos el set en Id de producto porqueno necesitmos que sea modificado
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
     //Insert Code/to String/y generamos los 3:producto,nombre,precio.
    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
}

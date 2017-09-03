/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

/**
 *
 * @author jorge enrique
 */
public class proveedor {
    private String nombre;
    private double deuda;
    private producto producto;

    public proveedor(String nombre, double deuda, producto producto) {
        this.nombre = nombre;
        this.deuda = deuda;
        this.producto = producto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getDeuda() {
        return deuda;
    }

    public producto getProducto() {
        return producto;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProducto(producto producto) {
        this.producto = producto;
    }
    
    
}

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
public class inventario {
    private double ingresos;
    private double egresos;

    public inventario(double ingresos, double egresos) {
        this.ingresos = ingresos;
        this.egresos = egresos;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public double getEgresos() {
        return egresos;
    }

    public void setEgresos(double egresos) {
        this.egresos = egresos;
    }
    
    public double ganancias(){
        return ingresos-egresos;
    }
}

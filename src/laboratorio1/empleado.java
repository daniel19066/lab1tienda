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
public class empleado {
    
    private String nombre ;
    private String horario ;
    private double sueldo ;
    private String documento;

    public empleado(String nombre, String horario, double sueldo,String documento) {
        this.nombre = nombre;
        this.horario = horario;
        this.sueldo = sueldo;
        this.documento= documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getHorario() {
        return horario;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
    
}

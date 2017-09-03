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
public class tienda {
    private String nombre;
    private int nit;
    private proveedor[] proveedores;
    private inventario inventario_tienda;
    private producto[] productos;
    private empleado[] empleados;
    private int cantidad_productos;
    private int cantidad_proveedores;
    private int cantidad_empleados;

    public tienda(String nombre, int nit) {
        this.nombre = nombre;
        this.nit = nit;
        this.proveedores = new proveedor[200];
        this.inventario_tienda = new inventario(0.0 ,0.0);
        this.productos = new producto[200];
        this.empleados = new empleado[7];
        this.cantidad_empleados=0;
        this.cantidad_productos=0;
        this.cantidad_proveedores=0;
    }

    public int getCantidad_productos() {
        return cantidad_productos;
    }

    public int getCantidad_proveedores() {
        return cantidad_proveedores;
    }

    public int getCantidad_empleados() {
        return cantidad_empleados;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public int getNit() {
        return nit;
    }

    public proveedor[] getProveedores() {
        return proveedores;
    }

    public inventario getInventario_tienda() {
        return inventario_tienda;
    }

    public producto[] getProductos() {
        return productos;
    }

    public empleado[] getEmpleados() {
        return empleados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public void setProveedores(proveedor[] provedores) {
        this.proveedores = provedores;
    }

    public void setInventario_tienda(inventario inventario_tienda) {
        this.inventario_tienda = inventario_tienda;
    }

    public void setProductos(producto[] productos) {
        this.productos = productos;
    }

    public void setEmpleados(empleado[] empleados) {
        this.empleados = empleados;
    }

    public void setCantidad_productos(int cantidad_productos) {
        this.cantidad_productos = cantidad_productos;
    }

    public void setCantidad_proveedores(int cantidad_proveedores) {
        this.cantidad_proveedores = cantidad_proveedores;
    }

    public void setCantidad_empleados(int cantidad_empleados) {
        this.cantidad_empleados = cantidad_empleados;
    }
    
    public boolean venta(String nombre, int cantidad){
        boolean ac=false;
        for (int i=0; i<this.cantidad_productos;i++){
            if(this.productos[i].getNombre().equals(nombre)){
                this.productos[i].setCantidad(this.productos[i].getCantidad()-cantidad);
                this.inventario_tienda.setIngresos((this.inventario_tienda.getIngresos()) + (this.productos[i].getPrecio()*cantidad));
                this.productos[i].setCantidad_vendida(this.productos[i].getCantidad_vendida()+ cantidad);
                ac=true;
                break;
            }
        }
        return ac;
    }
    public boolean pedidido(String nombre_prov,int cantidad, double precio){
        boolean ac=false;
        for (int i=0; i<this.cantidad_proveedores;i++){
            if(this.proveedores[i].getNombre().equals(nombre)){
                this.proveedores[i].setDeuda(this.proveedores[i].getDeuda()+ precio);
                this.inventario_tienda.setEgresos(this.inventario_tienda.getEgresos()+ precio);
                this.proveedores[i].getProducto().setCantidad(this.proveedores[i].getProducto().getCantidad() + cantidad);
                ac=true;
                break;
            }
        }
        return ac;
    }
    public boolean pagar_empleados(String nombre){
        boolean ac=false;
        for (int i=0; i<this.cantidad_proveedores;i++){
            if(this.empleados[i].getNombre().equals(nombre)){
                this.inventario_tienda.setEgresos(this.inventario_tienda.getEgresos()+this.empleados[i].getSueldo());
                ac=true;
                break;
            }
        }
        return ac;
    }
    public boolean contratar_empleado(String nombre, String horario, double sueldo, String documento){
        if(cantidad_empleados==7){
            return false;
        }else{
            empleados[cantidad_empleados]=new empleado(nombre,horario,sueldo,documento);
            return true;
        }
    }
    public boolean contratar_proveedor(String nombre, producto producto){
        if(cantidad_proveedores==200){
            return false;
        }else{
            proveedores[cantidad_proveedores]=new proveedor(nombre,0.0,producto);
            return true;
        }
   }
    public boolean agregar_producto(String nombre, double precio){
        if(cantidad_productos==200){
            return false;
        }else{
            productos[cantidad_productos]=new producto(nombre,precio,0);
            return true;
        }
    }
    public void eliminar_producto(String nombre){
        for(int i=0;i<cantidad_productos;i++){
            if(productos[i].getNombre().equals(nombre)){
                productos[i]=null;
                   for(int j=i;j<cantidad_productos-1;j++){
                    productos[j]=productos[j+1];
                }
                cantidad_productos-=1;   
                break;
            }
        }
    }
    public void despedir_empleado(String nombre){
        for(int i=0;i<cantidad_empleados;i++){
            if(empleados[i].getNombre().equals(nombre)){
                empleados[i]=null;
                   for(int j=i;j<cantidad_empleados-1;j++){
                    empleados[j]=empleados[j+1];
                }
                cantidad_empleados-=1;   
                break;
            }
        }
    }
    public void despedir_provedor(String nombre){
        for(int i=0;i<cantidad_proveedores;i++){
            if(proveedores[i].getNombre().equals(nombre)){
                proveedores[i]=null;
                   for(int j=i;j<cantidad_proveedores-1;j++){
                    proveedores[j]=proveedores[j+1];
                }
                cantidad_proveedores-=1;   
                break;
            }
        }
    }

}

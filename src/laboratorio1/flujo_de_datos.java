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

public class flujo_de_datos {
    public boolean mayor(int[] x, int n, int l){
        if(n==0){
            return l>x[n];
        }
        if(l>=x[n-1]){
            return mayor(x,n-1,l);
        }else{return false;}
    }
    int maximo( int[]x, int n){
    if(n==0){
        return x[n];
    }
    if(mayor(x,n,x[n-1])){
        return x[n-1];
    }else{
        return maximo(x,n-1);
        }
    }
    public void mostrar_productos(tienda tienda){
        producto[] productos1=tienda.getProductos();
        for(int i=0;i<tienda.getCantidad_productos();i++){
            System.out.println("nombre: " +productos1[i].getNombre());
            System.out.println("cantidad: " +productos1[i].getCantidad());
            System.out.println("precio: " +productos1[i].getPrecio());
        }
    }
    public void productos_agotados(tienda tienda){
        producto[] productos1=tienda.getProductos();
        for(int i=0;i<tienda.getCantidad_productos();i++){
            if(0==productos1[i].getCantidad()){
                System.out.println("producto agotado: " +productos1[i].getNombre());
            }
        }
    }
    public void producto_mas_vendidido(tienda tienda){
        producto[] productos1=tienda.getProductos();
        int[] c_ventas= new int[tienda.getCantidad_productos()];
        for(int i=0;i<tienda.getCantidad_productos();i++){
            c_ventas[i]=productos1[i].getCantidad_vendida();
        }
        System.out.println("producto mas vendidos: ");
        for(int i=0;i<tienda.getCantidad_productos();i++){
            if(productos1[i].getCantidad_vendida()==maximo(c_ventas,tienda.getCantidad_productos() )){
                System.out.println(productos1[i].getNombre());
            }
        }
    }
    public void ver_empleados(tienda tienda){
        empleado[] empleados1=tienda.getEmpleados();
        for(int i=0;i<tienda.getCantidad_empleados();i++){
            System.out.println("nombre: " +empleados1[i].getNombre());
            System.out.println("horario: " +empleados1[i].getHorario());
            System.out.println("sueldo: " +empleados1[i].getSueldo());
            System.out.println("documento: " +empleados1[i].getDocumento());
        }
    }
    public void ver_proveedores(tienda tienda){
        proveedor[] proveedores1=tienda.getProveedores();
        for(int i=0;i<tienda.getCantidad_proveedores();i++){
            System.out.println("nombre: " +proveedores1[i].getNombre());
            System.out.println("deuda: " +proveedores1[i].getDeuda());
            producto p1=proveedores1[i].getProducto();
            System.out.println("producto: " +p1.getNombre());
        }
    }
    
    public void ver_inventario(tienda tienda){
        inventario i1=tienda.getInventario_tienda();
        
        System.out.println("egresos: " +i1.getEgresos());
        System.out.println("ingresos: " +i1.getIngresos());
        System.out.println("ganancia"+i1.ganancias());
    }
    
}
